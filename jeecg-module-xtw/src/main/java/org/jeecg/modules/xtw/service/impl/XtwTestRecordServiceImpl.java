package org.jeecg.modules.xtw.service.impl;

import org.jeecg.modules.xtw.entity.XtwTestRecord;
import org.jeecg.modules.xtw.mapper.XtwTestRecordMapper;
import org.jeecg.modules.xtw.model.JimuDictModel;
import org.jeecg.modules.xtw.service.IXtwTestRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @Description: xtw_test_record
 * @Author: jeecg-boot
 * @Date:   2023-04-09
 * @Version: V1.0
 */
@Service
public class XtwTestRecordServiceImpl extends ServiceImpl<XtwTestRecordMapper, XtwTestRecord> implements IXtwTestRecordService {

    @Autowired
    private XtwTestRecordMapper testRecordMapper;

    @Override
    public List<JimuDictModel> getWaferLotList(String from, String to) {
        return testRecordMapper.getWaferLotList(from, to);
    }

    @Override
    public List<JimuDictModel> getICNameList(String waferLot, String from, String to) {
        return testRecordMapper.getICNameList(waferLot, from, to);
    }

    @Override
    public List<JimuDictModel> getTestItemList(String waferLot,String icName,String from,String to) {
        return testRecordMapper.getTestItemList(waferLot, icName, from, to);
    }
}
