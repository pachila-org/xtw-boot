package org.jeecg.modules.xtw.service.impl;

import org.jeecg.modules.xtw.entity.TestBinDetail;
import org.jeecg.modules.xtw.mapper.TestBinDetailMapper;
import org.jeecg.modules.xtw.model.SubLotBinModel;
import org.jeecg.modules.xtw.model.SylStaticsModel;
import org.jeecg.modules.xtw.service.ITestBinDetailService;
import org.jeecg.modules.xtw.util.MathUtils;
import org.jeecg.modules.xtw.util.QuartileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
    public List<SylStaticsModel> findSYL(String waferLot, String icName, String from, String to) {

        List<SubLotBinModel> binList = binDetailMapper.querySYLList(waferLot, icName, from, to);
        List<SylStaticsModel> modelList = new ArrayList<SylStaticsModel>();

        // 输出binlist 大小
//        System.out.println("binList size: " + binList.size());

        HashMap<String, List> map = new HashMap<String, List>();
        for (int i = 0; i < binList.size(); i++) {
            SubLotBinModel bin = binList.get(i);
            String key = bin.getWaferLot() + "@" + bin.getIcName() + "@" + bin.getSubLot();
            System.out.println("current key: " + key);
            if (map.containsKey(key)) {
                List<SubLotBinModel> oldModel = map.get(key);
                oldModel.add(bin);
//                System.out.println("current key exist. and add model " + oldModel.size() );
            } else {
                List<SubLotBinModel> model = new ArrayList<SubLotBinModel>();
                model.add(bin);
                map.put(key, model);
//                System.out.println("current key new. and add model " + model.size() );
            }
        }
        // 输出map的大小
//        System.out.println("map size: " + map.size());

        // 遍历map对象
        for (String key : map.keySet()) {
            List<SubLotBinModel> subLotBinModelList = map.get(key);
            BigDecimal[] arrSyl = new BigDecimal[subLotBinModelList.size()];

            BigDecimal bin12 = new BigDecimal(0);
            BigDecimal binAll = new BigDecimal(0);

            for (int i = 0; i < subLotBinModelList.size(); i++) {
                SubLotBinModel bin = subLotBinModelList.get(i);
                arrSyl[i] = bin.sumSYL();
                bin12 = bin12.add(new BigDecimal(bin.getBin1()).add(new BigDecimal(bin.getBin2())));
                binAll = binAll.add(bin.sumAllBin());
            }

            BigDecimal yieldValue =  bin12.divide(binAll, 4, RoundingMode.HALF_UP);
            BigDecimal meanValue = QuartileUtil.calculate(arrSyl, 2).setScale(4, BigDecimal.ROUND_HALF_UP);
            // 计算mean-3xigema值
            BigDecimal meanValue3 = QuartileUtil.calculate(arrSyl, 3).setScale(4, BigDecimal.ROUND_HALF_UP);
            BigDecimal meanValue1 = QuartileUtil.calculate(arrSyl, 1).setScale(4, BigDecimal.ROUND_HALF_UP);
            BigDecimal xgmValue = meanValue3.subtract(meanValue1.divide(new BigDecimal(1.35), 4, BigDecimal.ROUND_HALF_UP));
            // 计算control line值
            BigDecimal controlValue = new BigDecimal("0.9");  // TODO

            // 输出key， bin12， binAll， yieldValue， meanValue，meanValue3, meanValue1,  xgmValue， controlValue

            System.out.println(key + " " + bin12 + " " + binAll + " " + yieldValue + " " + meanValue + " " + meanValue3 + " " + meanValue1 + " " + xgmValue + " " + controlValue);

            // Set yield value model
            SylStaticsModel modelYield = new SylStaticsModel();
            modelYield.setKey(key);
            modelYield.setType(SylStaticsModel.YIELD);
            modelYield.setValue(yieldValue);
            modelList.add(modelYield);

            // Set mean value model
            SylStaticsModel modelMean = new SylStaticsModel();
            modelMean.setKey(key);
            modelMean.setType(SylStaticsModel.MEAN);
            modelMean.setValue(meanValue);
            modelList.add(modelMean);

            // set mean-3xigema value model
            SylStaticsModel modelMean3 = new SylStaticsModel();
            modelMean3.setKey(key);
            modelMean3.setType(SylStaticsModel.XIGEMA);
            modelMean3.setValue(xgmValue);
            modelList.add(modelMean3);

            // set control line value model
            SylStaticsModel modelControl = new SylStaticsModel();
            modelControl.setKey(key);
            modelControl.setType(SylStaticsModel.CONTROL);
            modelControl.setValue(controlValue);
            modelList.add(modelControl);

        }

        // sort modellist by name property in ascending order
        modelList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

        // 输出ModelList 的大小
        System.out.println("modelList size: " + modelList.size());
        return modelList;
    }
}
