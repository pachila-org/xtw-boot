package org.jeecg.modules.xtw.service.impl;

import org.jeecg.modules.xtw.entity.TestBinDetail;
import org.jeecg.modules.xtw.mapper.TestBinDetailMapper;
import org.jeecg.modules.xtw.model.*;
import org.jeecg.modules.xtw.service.ITestBinDetailService;
import org.jeecg.modules.xtw.util.QuartileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description: xtw_test_bin_detail
 * @Author: jeecg-boot
 * @Date:   2023-04-07
 * @Version: V1.0
 */
@Service
public class TestBinDetailServiceImpl extends ServiceImpl<TestBinDetailMapper, TestBinDetail> implements ITestBinDetailService {
    @Autowired
    private TestBinDetailMapper binDetailMapper;

    @Override
    public List<SylSublotModel> findSYL(String waferLot, String icName, String from, String to) {

        List<SubLotBinModel> binList = binDetailMapper.querySYLList(waferLot, icName, from, to);
        List<SylSublotModel> modelList = new ArrayList<SylSublotModel>();
        BigDecimal [] arrSyl = new BigDecimal[binList.size()];

        // 输出binlist 大小
//        System.out.println("binList size: " + binList.size());

        // 将binList转换为modelList
        for (int i = 0; i < binList.size(); i++) {
            SubLotBinModel bin = binList.get(i);
            // Set yield value model
            SylSublotModel modelYield = new SylSublotModel();
            modelYield.setIcName(bin.getIcName());
            modelYield.setWaferLot(bin.getWaferLot());
            modelYield.setName(bin.getSubLot());
            modelYield.setType(SylSublotModel.YIELD);
            BigDecimal syl = bin.sumSYL();
            modelYield.setValue(syl);

            arrSyl[i] = syl;
            modelList.add(modelYield);
        }

        // 计算Mean值
        BigDecimal meanValue = QuartileUtil.calculate(arrSyl, 2).setScale(4, BigDecimal.ROUND_HALF_UP);

        BigDecimal meanValue3 = QuartileUtil.calculate(arrSyl, 3).setScale(4, BigDecimal.ROUND_HALF_UP);
        BigDecimal meanValue1 = QuartileUtil.calculate(arrSyl, 1).setScale(4, BigDecimal.ROUND_HALF_UP);
        // 计算mean+3xigema值 = (QUARTILE(数值范围,3)+QUARTILE(数值范围,1))/1.35
        BigDecimal plusXgmValue = meanValue3.add(meanValue1.divide(new BigDecimal(1.35), 4, BigDecimal.ROUND_HALF_UP));
//         计算mean-3xigema值 = (QUARTILE(数值范围,3)-QUARTILE(数值范围,1))/1.35
        BigDecimal minusXgmValue = meanValue3.subtract(meanValue1.divide(new BigDecimal(1.35), 4, BigDecimal.ROUND_HALF_UP));

        // 计算control line值
        BigDecimal controlValue = new BigDecimal("0.9");  // TODO

        for (int i = 0; i < binList.size(); i++) {
            SubLotBinModel bin = binList.get(i);

            // Set mean value model
            SylSublotModel modelMean = new SylSublotModel();
            modelMean.setIcName(bin.getIcName());
            modelMean.setWaferLot(bin.getWaferLot());
            modelMean.setName(bin.getSubLot());
            modelMean.setType(SylSublotModel.MEAN);
            modelMean.setValue(meanValue);
            modelList.add(modelMean);

            // set mean+3xgm value model
            SylSublotModel modelPlusXgm = new SylSublotModel();
            modelPlusXgm.setIcName(bin.getIcName());
            modelPlusXgm.setWaferLot(bin.getWaferLot());
            modelPlusXgm.setName(bin.getSubLot());
            modelPlusXgm.setType(SylSublotModel.PLUS_XIGEMA);
            modelPlusXgm.setValue(plusXgmValue);
            modelList.add(modelPlusXgm);

            // set mean-3xgm value model
            SylSublotModel modelMinusXgm = new SylSublotModel();
            modelMinusXgm.setIcName(bin.getIcName());
            modelMinusXgm.setWaferLot(bin.getWaferLot());
            modelMinusXgm.setName(bin.getSubLot());
            modelMinusXgm.setType(SylSublotModel.MINUS_XIGEMA);
            modelMinusXgm.setValue(minusXgmValue);
            modelList.add(modelMinusXgm);

            // set control value model
            SylSublotModel modelControl = new SylSublotModel();
            modelControl.setIcName(bin.getIcName());
            modelControl.setWaferLot(bin.getWaferLot());
            modelControl.setName(bin.getSubLot());
            modelControl.setType(SylSublotModel.CONTROL);
            modelControl.setValue(controlValue);
            modelList.add(modelControl);
        }

        // sort modellist by name property in ascending order
        modelList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

        // 输出ModelList 的大小
        System.out.println("modelList size: " + modelList.size());
        return modelList;
    }

    @Override
    public List<SylModel> findSYL4List(String waferLot, String icName, String from, String to) {
        List<SylSublotModel> modelList = findSYL(waferLot, icName, from, to);
        List<SylModel> sylModelList = new ArrayList<SylModel>();

        Map<String, List<SylSublotModel>> map = new HashMap<String, List<SylSublotModel>>();
        // 将modellist转换为map
        for (SylSublotModel model : modelList) {
            String key = model.getKey();
            if (map.containsKey(key)) {
                map.get(key).add(model);
            } else {
                List<SylSublotModel> list = new ArrayList<SylSublotModel>();
                list.add(model);
                map.put(key, list);
            }
        }

        // 将map转换为sylModelList , 一个key转换成一个syLmodel
        for (String key : map.keySet()) {
            List<SylSublotModel> list = map.get(key);
            SylModel sylModel = new SylModel();
            sylModel.setIcName(list.get(0).getIcName());
            sylModel.setWaferLot(list.get(0).getWaferLot());
            sylModel.setSubLot(list.get(0).getName());

            // 遍历list，将list中的model中的value 根据 type，转换为sylmodel中的属性
            for (SylSublotModel model : list) {
                if (model.getType().equals(SylSublotModel.MEAN)) {
                    sylModel.setRobustMean(model.getValue());
                } else if (model.getType().equals(SylSublotModel.PLUS_XIGEMA)) {
                    sylModel.setMeanPlus3xgm(model.getValue());
                } else if (model.getType().equals(SylSublotModel.MINUS_XIGEMA)) {
                    sylModel.setMeanMinus3xgm(model.getValue());
                } else if (model.getType().equals(SylSublotModel.CONTROL)) {
                    sylModel.setControlLine(model.getValue());
                } else if (model.getType().equals(SylSublotModel.YIELD)) {
                    sylModel.setYield(model.getValue());
                }
            }
            sylModelList.add(sylModel);
        }
        return sylModelList;
    }

    @Override
    public List<SylWaferlotModel> findSYL(String icName, String from, String to) {

        List<SubLotBinModel> binList = binDetailMapper.querySYLListNew(icName, from, to);
        List<SylWaferlotModel> modelList = new ArrayList<SylWaferlotModel>();
        BigDecimal [] arrSyl = new BigDecimal[binList.size()];

        // 将binList转换为modelList
        for (int i = 0; i < binList.size(); i++) {
            SubLotBinModel bin = binList.get(i);
            // Set yield value model
            SylWaferlotModel modelYield = new SylWaferlotModel();
            modelYield.setIcName(bin.getIcName());
            modelYield.setName(bin.getWaferLot());
            modelYield.setType(SylSublotModel.YIELD);
            BigDecimal syl = bin.sumSYL();
            modelYield.setValue(syl);

            arrSyl[i] = syl;
            modelList.add(modelYield);
        }

        // 计算Mean值
        BigDecimal meanValue = QuartileUtil.calculate(arrSyl, 2).setScale(4, BigDecimal.ROUND_HALF_UP);

        BigDecimal meanValue3 = QuartileUtil.calculate(arrSyl, 3).setScale(4, BigDecimal.ROUND_HALF_UP);
        BigDecimal meanValue1 = QuartileUtil.calculate(arrSyl, 1).setScale(4, BigDecimal.ROUND_HALF_UP);
        // 计算mean+3xigema值 = (QUARTILE(数值范围,3)+QUARTILE(数值范围,1))/1.35
        BigDecimal plusXgmValue = meanValue3.add(meanValue1.divide(new BigDecimal(1.35), 4, BigDecimal.ROUND_HALF_UP));
//         计算mean-3xigema值 = (QUARTILE(数值范围,3)-QUARTILE(数值范围,1))/1.35
        BigDecimal minusXgmValue = meanValue3.subtract(meanValue1.divide(new BigDecimal(1.35), 4, BigDecimal.ROUND_HALF_UP));

        // 计算control line值
        BigDecimal controlValue = new BigDecimal("0.9");  // TODO

        for (int i = 0; i < binList.size(); i++) {
            SubLotBinModel bin = binList.get(i);

            // Set mean value model
            SylWaferlotModel modelMean = new SylWaferlotModel();
            modelMean.setIcName(bin.getIcName());
            modelMean.setName(bin.getWaferLot());
            modelMean.setType(SylSublotModel.MEAN);
            modelMean.setValue(meanValue);
            modelList.add(modelMean);

            // set mean+3xgm value model
            SylWaferlotModel modelPlusXgm = new SylWaferlotModel();
            modelPlusXgm.setIcName(bin.getIcName());
            modelPlusXgm.setName(bin.getWaferLot());
            modelPlusXgm.setType(SylSublotModel.PLUS_XIGEMA);
            modelPlusXgm.setValue(plusXgmValue);
            modelList.add(modelPlusXgm);

            // set mean-3xgm value model
            SylWaferlotModel modelMinusXgm = new SylWaferlotModel();
            modelMinusXgm.setIcName(bin.getIcName());
            modelMinusXgm.setName(bin.getWaferLot());
            modelMinusXgm.setType(SylSublotModel.MINUS_XIGEMA);
            modelMinusXgm.setValue(minusXgmValue);
            modelList.add(modelMinusXgm);

            // set control value model
            SylWaferlotModel modelControl = new SylWaferlotModel();
            modelControl.setIcName(bin.getIcName());
            modelControl.setName(bin.getWaferLot());
            modelControl.setType(SylSublotModel.CONTROL);
            modelControl.setValue(controlValue);
            modelList.add(modelControl);
        }

        // sort modellist by name property in ascending order
        modelList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

        // 输出ModelList 的大小
        System.out.println("modelList size: " + modelList.size());
        return modelList;
    }

    @Override
    public List<SylModel> findSYL4List(String icName, String from, String to) {
        List<SylWaferlotModel> modelList = findSYL(icName, from, to);
        List<SylModel> sylModelList = new ArrayList<SylModel>();

        Map<String, List<SylWaferlotModel>> map = new HashMap<String, List<SylWaferlotModel>>();
        // 将modellist转换为map
        for (SylWaferlotModel model : modelList) {
            String key = model.getKey();
            if (map.containsKey(key)) {
                map.get(key).add(model);
            } else {
                List<SylWaferlotModel> list = new ArrayList<SylWaferlotModel>();
                list.add(model);
                map.put(key, list);
            }
        }

        // 将map转换为sylModelList , 一个key转换成一个syLmodel
        for (String key : map.keySet()) {
            List<SylWaferlotModel> list = map.get(key);
            SylModel sylModel = new SylModel();
            sylModel.setIcName(list.get(0).getIcName());
            sylModel.setWaferLot(list.get(0).getName());

            // 遍历list，将list中的model中的value 根据 type，转换为sylmodel中的属性
            for (SylWaferlotModel model : list) {
                if (model.getType().equals(SylWaferlotModel.MEAN)) {
                    sylModel.setRobustMean(model.getValue());
                } else if (model.getType().equals(SylWaferlotModel.PLUS_XIGEMA)) {
                    sylModel.setMeanPlus3xgm(model.getValue());
                } else if (model.getType().equals(SylWaferlotModel.MINUS_XIGEMA)) {
                    sylModel.setMeanMinus3xgm(model.getValue());
                } else if (model.getType().equals(SylWaferlotModel.CONTROL)) {
                    sylModel.setControlLine(model.getValue());
                } else if (model.getType().equals(SylWaferlotModel.YIELD)) {
                    sylModel.setYield(model.getValue());
                }
            }
            sylModelList.add(sylModel);
        }
        return sylModelList;
    }

    @Override
    public List<BinDataModel> getBinDatas(String waterLot, String icName, String from, String to) {
        List<BinDataModel> binList = binDetailMapper.queryBinDatas(waterLot, icName, from, to);
        return binList;
    }
}
