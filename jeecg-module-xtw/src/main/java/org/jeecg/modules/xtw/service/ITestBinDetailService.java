package org.jeecg.modules.xtw.service;

import org.jeecg.modules.xtw.entity.TestBinDetail;
import com.baomidou.mybatisplus.extension.service.IService;
import org.jeecg.modules.xtw.model.SylSublotModel;
import org.jeecg.modules.xtw.model.SylWaferlotModel;

import java.util.List;

/**
 * @Description: xtw_test_bin_detail
 * @Author: jeecg-boot
 * @Date:   2023-04-07
 * @Version: V1.0
 */
public interface ITestBinDetailService extends IService<TestBinDetail> {

    List<SylSublotModel> findSYL(String waterLot, String icName, String from, String to);

    List<SylWaferlotModel> findSYL(String icName, String from, String to);

}
