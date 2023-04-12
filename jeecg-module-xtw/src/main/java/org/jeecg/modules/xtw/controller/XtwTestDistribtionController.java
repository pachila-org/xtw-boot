package org.jeecg.modules.xtw.controller;

import java.util.Arrays;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jeecg.common.api.vo.JimuResult;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.system.query.QueryGenerator;
import org.jeecg.modules.xtw.entity.XtwTestDistribtion;
import org.jeecg.modules.xtw.service.IXtwTestDistribtionService;

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
 * @Description: xtw_test_distribtion
 * @Author: jeecg-boot
 * @Date:   2023-04-09
 * @Version: V1.0
 */
@Api(tags="xtw_test_distribtion")
@RestController
@RequestMapping("/xtw/distribtion")
@Slf4j
public class XtwTestDistribtionController extends JeecgController<XtwTestDistribtion, IXtwTestDistribtionService> {
	@Autowired
	private IXtwTestDistribtionService xtwTestDistribtionService;
	
	/**
	 * 分页列表查询
	 *
	 * @param xtwTestDistribtion
	 * @param pageNo
	 * @param pageSize
	 * @param req
	 * @return
	 */
	//@AutoLog(value = "xtw_test_distribtion-分页列表查询")
	@ApiOperation(value="xtw_test_distribtion-分页列表查询", notes="xtw_test_distribtion-分页列表查询")
	@GetMapping(value = "/list")
	public Result<IPage<XtwTestDistribtion>> queryPageList(XtwTestDistribtion xtwTestDistribtion,
								   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
								   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
								   HttpServletRequest req) {
		QueryWrapper<XtwTestDistribtion> queryWrapper = QueryGenerator.initQueryWrapper(xtwTestDistribtion, req.getParameterMap());
		Page<XtwTestDistribtion> page = new Page<XtwTestDistribtion>(pageNo, pageSize);
		IPage<XtwTestDistribtion> pageList = xtwTestDistribtionService.page(page, queryWrapper);
		return Result.OK(pageList);
	}
	
	/**
	 *   添加
	 *
	 * @param xtwTestDistribtion
	 * @return
	 */
	@AutoLog(value = "xtw_test_distribtion-添加")
	@ApiOperation(value="xtw_test_distribtion-添加", notes="xtw_test_distribtion-添加")
	//@RequiresPermissions("xtw:xtw_test_distribtion:add")
	@PostMapping(value = "/add")
	public Result<String> add(@RequestBody XtwTestDistribtion xtwTestDistribtion) {
		xtwTestDistribtionService.save(xtwTestDistribtion);
		return Result.OK("添加成功！");
	}
	
	/**
	 *  编辑
	 *
	 * @param xtwTestDistribtion
	 * @return
	 */
	@AutoLog(value = "xtw_test_distribtion-编辑")
	@ApiOperation(value="xtw_test_distribtion-编辑", notes="xtw_test_distribtion-编辑")
	//@RequiresPermissions("xtw:xtw_test_distribtion:edit")
	@RequestMapping(value = "/edit", method = {RequestMethod.PUT,RequestMethod.POST})
	public Result<String> edit(@RequestBody XtwTestDistribtion xtwTestDistribtion) {
		xtwTestDistribtionService.updateById(xtwTestDistribtion);
		return Result.OK("编辑成功!");
	}
	
	/**
	 *   通过id删除
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "xtw_test_distribtion-通过id删除")
	@ApiOperation(value="xtw_test_distribtion-通过id删除", notes="xtw_test_distribtion-通过id删除")
	//@RequiresPermissions("xtw:xtw_test_distribtion:delete")
	@DeleteMapping(value = "/delete")
	public Result<String> delete(@RequestParam(name="id",required=true) String id) {
		xtwTestDistribtionService.removeById(id);
		return Result.OK("删除成功!");
	}
	
	/**
	 *  批量删除
	 *
	 * @param ids
	 * @return
	 */
	@AutoLog(value = "xtw_test_distribtion-批量删除")
	@ApiOperation(value="xtw_test_distribtion-批量删除", notes="xtw_test_distribtion-批量删除")
	//@RequiresPermissions("xtw:xtw_test_distribtion:deleteBatch")
	@DeleteMapping(value = "/deleteBatch")
	public Result<String> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
		this.xtwTestDistribtionService.removeByIds(Arrays.asList(ids.split(",")));
		return Result.OK("批量删除成功!");
	}
	
	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	//@AutoLog(value = "xtw_test_distribtion-通过id查询")
	@ApiOperation(value="xtw_test_distribtion-通过id查询", notes="xtw_test_distribtion-通过id查询")
	@GetMapping(value = "/queryById")
	public Result<XtwTestDistribtion> queryById(@RequestParam(name="id",required=true) String id) {
		XtwTestDistribtion xtwTestDistribtion = xtwTestDistribtionService.getById(id);
		if(xtwTestDistribtion==null) {
			return Result.error("未找到对应数据");
		}
		return Result.OK(xtwTestDistribtion);
	}

    /**
    * 导出excel
    *
    * @param request
    * @param xtwTestDistribtion
    */
    //@RequiresPermissions("xtw:xtw_test_distribtion:exportXls")
    @RequestMapping(value = "/exportXls")
    public ModelAndView exportXls(HttpServletRequest request, XtwTestDistribtion xtwTestDistribtion) {
        return super.exportXls(request, xtwTestDistribtion, XtwTestDistribtion.class, "xtw_test_distribtion");
    }

    /**
      * 通过excel导入数据
    *
    * @param request
    * @param response
    * @return
    */
    //@RequiresPermissions("xtw:xtw_test_distribtion:importExcel")
    @RequestMapping(value = "/importExcel", method = RequestMethod.POST)
    public Result<?> importExcel(HttpServletRequest request, HttpServletResponse response) {
        return super.importExcel(request, response, XtwTestDistribtion.class);
    }

//	@ApiOperation("获取某个批次某个项目的数据分布明细情况")
//	@RequestMapping(value = "/detailDistribution", method = RequestMethod.POST)
//	public JimuResult<?> detailDistribution(@RequestParam(name = "waferLot", required = true) String waferLot,
//											@RequestParam(name = "icName", required = true) String icName,
//											@RequestParam(name = "subLot", required = true) String subLog,
//											@RequestParam(name = "testItem", required = true) String testItem) {
//		List result = xtwTestDistribtionService.detailDistribution(waferLot, icName, subLog, testItem);
//		JimuResult jimuResult = JimuResult.ok(result)
//		jimuResult.setCount(result.size());
//		return jimuResult;
//	}

	@ApiOperation("获取指定大批次与产品下的数据分布情况")
	@RequestMapping(value = "/statistics", method = RequestMethod.POST)
	public JimuResult<?> distributionStatistics(@RequestParam(name = "waferLot", required = true) String waferLot,
											@RequestParam(name = "icName", required = true) String icName,
											@RequestParam(name = "testItem", required = true) String testItem,
												@RequestParam(name = "site", required = false) String site,
												@RequestParam(name = "dateFrom", required = false) String dateFrom,
												@RequestParam(name = "dateTo", required = false) String dateTo) {
		List result = xtwTestDistribtionService.distributionStatistics(waferLot, icName, testItem, site, dateFrom, dateTo);
		JimuResult jimuResult = JimuResult.ok(result);
		jimuResult.setCount(result.size());
		return jimuResult;
	}

}
