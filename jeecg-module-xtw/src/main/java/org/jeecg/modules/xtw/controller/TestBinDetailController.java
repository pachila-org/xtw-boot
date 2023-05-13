package org.jeecg.modules.xtw.controller;

import java.util.Arrays;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jeecg.common.api.vo.JimuResult;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.system.query.QueryGenerator;
import org.jeecg.modules.xtw.entity.TestBinDetail;
import org.jeecg.modules.xtw.service.ITestBinDetailService;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;

import org.jeecg.common.system.base.controller.JeecgController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.jeecg.common.aspect.annotation.AutoLog;

/**
 * @Description: xtw_test_bin_detail
 * @Author: jeecg-boot
 * @Date: 2023-04-07
 * @Version: V1.0
 */
@Api(tags = "芯涛微接口")
@RestController
@RequestMapping("/xtw/testbin")
@Slf4j
public class TestBinDetailController extends JeecgController<TestBinDetail, ITestBinDetailService> {
    @Autowired
    private ITestBinDetailService testBinDetailService;

    /**
     * 分页列表查询
     *
     * @param testBinDetail
     * @param pageNo
     * @param pageSize
     * @param req
     * @return
     */
    //@AutoLog(value = "xtw_test_bin_detail-分页列表查询")
    @ApiOperation(value = "xtw_test_bin_detail-分页列表查询", notes = "xtw_test_bin_detail-分页列表查询")
    @GetMapping(value = "/list")
    public Result<IPage<TestBinDetail>> queryPageList(TestBinDetail testBinDetail,
                                                      @RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo,
                                                      @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize,
                                                      HttpServletRequest req) {
        QueryWrapper<TestBinDetail> queryWrapper = QueryGenerator.initQueryWrapper(testBinDetail, req.getParameterMap());
        Page<TestBinDetail> page = new Page<TestBinDetail>(pageNo, pageSize);
        IPage<TestBinDetail> pageList = testBinDetailService.page(page, queryWrapper);
        return Result.OK(pageList);
    }

    /**
     * 添加
     *
     * @param testBinDetail
     * @return
     */
    @AutoLog(value = "xtw_test_bin_detail-添加")
    @ApiOperation(value = "xtw_test_bin_detail-添加", notes = "xtw_test_bin_detail-添加")
    //@RequiresPermissions("org.xtw.modules:xtw_test_bin_detail:add")
    @PostMapping(value = "/add")
    public Result<String> add(@RequestBody TestBinDetail testBinDetail) {
        testBinDetailService.save(testBinDetail);
        return Result.OK("添加成功！");
    }

    /**
     * 编辑
     *
     * @param testBinDetail
     * @return
     */
    @AutoLog(value = "xtw_test_bin_detail-编辑")
    @ApiOperation(value = "xtw_test_bin_detail-编辑", notes = "xtw_test_bin_detail-编辑")
    //@RequiresPermissions("org.xtw.modules:xtw_test_bin_detail:edit")
    @RequestMapping(value = "/edit", method = {RequestMethod.PUT, RequestMethod.POST})
    public Result<String> edit(@RequestBody TestBinDetail testBinDetail) {
        testBinDetailService.updateById(testBinDetail);
        return Result.OK("编辑成功!");
    }

    /**
     * 通过id删除
     *
     * @param id
     * @return
     */
    @AutoLog(value = "xtw_test_bin_detail-通过id删除")
    @ApiOperation(value = "xtw_test_bin_detail-通过id删除", notes = "xtw_test_bin_detail-通过id删除")
    //@RequiresPermissions("org.xtw.modules:xtw_test_bin_detail:delete")
    @DeleteMapping(value = "/delete")
    public Result<String> delete(@RequestParam(name = "id", required = true) String id) {
        testBinDetailService.removeById(id);
        return Result.OK("删除成功!");
    }

    /**
     * 批量删除
     *
     * @param ids
     * @return
     */
    @AutoLog(value = "xtw_test_bin_detail-批量删除")
    @ApiOperation(value = "xtw_test_bin_detail-批量删除", notes = "xtw_test_bin_detail-批量删除")
    //@RequiresPermissions("org.xtw.modules:xtw_test_bin_detail:deleteBatch")
    @DeleteMapping(value = "/deleteBatch")
    public Result<String> deleteBatch(@RequestParam(name = "ids", required = true) String ids) {
        this.testBinDetailService.removeByIds(Arrays.asList(ids.split(",")));
        return Result.OK("批量删除成功!");
    }

    /**
     * 通过id查询
     *
     * @param id
     * @return
     */
    //@AutoLog(value = "xtw_test_bin_detail-通过id查询")
    @ApiOperation(value = "xtw_test_bin_detail-通过id查询", notes = "xtw_test_bin_detail-通过id查询")
    @GetMapping(value = "/queryById")
    public Result<TestBinDetail> queryById(@RequestParam(name = "id", required = true) String id) {
        TestBinDetail testBinDetail = testBinDetailService.getById(id);
        if (testBinDetail == null) {
            return Result.error("未找到对应数据");
        }
        return Result.OK(testBinDetail);
    }

    /**
     * 导出excel
     *
     * @param request
     * @param testBinDetail
     */
    //@RequiresPermissions("org.xtw.modules:xtw_test_bin_detail:exportXls")
    @RequestMapping(value = "/exportXls")
    public ModelAndView exportXls(HttpServletRequest request, TestBinDetail testBinDetail) {
        return super.exportXls(request, testBinDetail, TestBinDetail.class, "xtw_test_bin_detail");
    }

    /**
     * 通过excel导入数据
     *
     * @param request
     * @param response
     * @return
     */
    //@RequiresPermissions("org.xtw.modules:xtw_test_bin_detail:importExcel")
    @RequestMapping(value = "/importExcel", method = RequestMethod.POST)
    public Result<?> importExcel(HttpServletRequest request, HttpServletResponse response) {
        return super.importExcel(request, response, TestBinDetail.class);
    }

    @ApiOperation("获取良率统计数据")
    @RequestMapping(value = "/sylstatistics", method = RequestMethod.POST)
    public JimuResult<?> getSylStatistics(@RequestParam(name = "waferLot", required = true) String waferLot,
                                          @RequestParam(name = "icName", required = true) String icName,
                                          @RequestParam(name = "from", required = false) String from,
                                          @RequestParam(name = "to", required = false) String to) {
        List sylList = this.testBinDetailService.findSYL(waferLot, icName, from, to);
        JimuResult result = JimuResult.ok(sylList);
        result.setCount(sylList.size());
        return result;
    }

    @ApiOperation("获取良率统计数据")
    @RequestMapping(value = "/syl_icname", method = RequestMethod.POST)
    public JimuResult<?> getSylStatisticsByIcName(@RequestParam(name = "icName", required = true) String icName,
                                          @RequestParam(name = "from", required = false) String from,
                                          @RequestParam(name = "to", required = false) String to) {
        List sylList = this.testBinDetailService.findSYL(icName, from, to);
        JimuResult result = JimuResult.ok(sylList);
        result.setCount(sylList.size());
        return result;
    }

}
