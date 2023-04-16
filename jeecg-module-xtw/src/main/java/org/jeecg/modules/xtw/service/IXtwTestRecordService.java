package org.jeecg.modules.xtw.service;

import org.jeecg.modules.xtw.entity.XtwTestRecord;
import com.baomidou.mybatisplus.extension.service.IService;
import org.jeecg.modules.xtw.model.JimuDictModel;

import java.util.List;

/**
 * @Description: xtw_test_record
 * @Author: jeecg-boot
 * @Date:   2023-04-09
 * @Version: V1.0
 */
public interface IXtwTestRecordService extends IService<XtwTestRecord> {

    /**
     * 获取wafer lot列表
     * @param from 某段时间内的大批次，时间开始日期 格式如 2021-01-01
     * @param to 某段时间内的大批次，时间结束日期 格式如 2021-01-01
     * @return
     */
    List<JimuDictModel> getWaferLotList(String from, String to);


    /**
     * 获取IC_Name 列表
     * @param waferLot 已经明确的大批次信息，可以为空
     * @param from 某段时间内的大批次，时间开始日期 格式如 2021-01-01，可以为空
     * @param to 某段时间内的大批次，时间结束日期 格式如 2021-01-01，可以为空
     * @return
     */
    List<JimuDictModel> getICNameList(String waferLot, String from, String to);

    /**
     * 获取测试项列表
     * @param waferLot 已经明确的大批次信息，可以为空
     * @param icName 已经明确的IC_Name信息，可以为空
     * @param from 某段时间内的大批次，时间开始日期 格式如 2021-01-01，可以为空
     * @param to 某段时间内的大批次，时间结束日期 格式如 2021-01-01，可以为空
     * @return
     */
    List<JimuDictModel> getTestItemList(String waferLot,String icName,String from,String to);

}
