package org.jeecg.modules.xtw.service.impl;

import org.jeecg.modules.xtw.entity.TestBinDetail;
import org.jeecg.modules.xtw.mapper.TestBinDetailMapper;
import org.jeecg.modules.xtw.model.SubLotBinModel;
import org.jeecg.modules.xtw.model.SylStaticsModel;
import org.jeecg.modules.xtw.service.ITestBinDetailService;
import org.jeecg.modules.xtw.util.MathUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.math.BigDecimal;
import java.util.ArrayList;
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
        BigDecimal [] arr = new BigDecimal[binList.size()];

        for (int i = 0; i < binList.size(); i++) {
            SubLotBinModel bin = binList.get(i);
            SylStaticsModel model = new SylStaticsModel();
            model.setWaferLot(bin.getWaferLot());
            model.setIcName(bin.getIcName());
            model.setName(bin.getSubLot());
            model.setType(SylStaticsModel.YIELD);
            model.setValue(bin.sumSYL());
            modelList.add(model);
            arr[i] = model.getValue();
        }

        // 计算mean值
        BigDecimal meanValue = MathUtils.quartile(arr, 2);
        // 计算mean-3xigema值
        BigDecimal meanValue3 = MathUtils.quartile(arr, 3);
        BigDecimal meanValue1 = MathUtils.quartile(arr, 1);
        BigDecimal xgmValue = meanValue3.subtract(meanValue1).divide(new BigDecimal(1.35), 4, BigDecimal.ROUND_HALF_UP);

        // 计算control line值
        // TODO
        BigDecimal controlValue = new BigDecimal(0.5);

        for (int i = 0; i < binList.size(); i++) {
            SubLotBinModel bin = binList.get(i);
            SylStaticsModel modelMean = new SylStaticsModel();
            modelMean.setWaferLot(bin.getWaferLot());
            modelMean.setIcName(bin.getIcName());
            modelMean.setName(bin.getSubLot());
            modelMean.setType(SylStaticsModel.MEAN);
            modelMean.setValue(meanValue);
            modelList.add(modelMean);

            SylStaticsModel modelXGM = new SylStaticsModel();
            modelXGM.setWaferLot(bin.getWaferLot());
            modelXGM.setIcName(bin.getIcName());
            modelXGM.setName(bin.getSubLot());
            modelXGM.setType(SylStaticsModel.XIGEMA);
            modelXGM.setValue(xgmValue);
            modelList.add(modelXGM);

            SylStaticsModel controlXGM = new SylStaticsModel();
            controlXGM.setWaferLot(bin.getWaferLot());
            controlXGM.setIcName(bin.getIcName());
            controlXGM.setName(bin.getSubLot());
            controlXGM.setType(SylStaticsModel.CONTROL);
            controlXGM.setValue(controlValue);
            modelList.add(controlXGM);
        }

        return modelList;
    }
}
