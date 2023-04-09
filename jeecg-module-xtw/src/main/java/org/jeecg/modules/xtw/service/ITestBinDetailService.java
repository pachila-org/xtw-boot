package org.jeecg.modules.xtw.service;

import org.jeecg.common.api.vo.Result;
import org.jeecg.modules.xtw.entity.TestBinDetail;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Description: xtw_test_bin_detail
 * @Author: jeecg-boot
 * @Date:   2023-04-07
 * @Version: V1.0
 */
public interface ITestBinDetailService extends IService<TestBinDetail> {

    Result<?> findSYL(String lotStr, String product);

}
