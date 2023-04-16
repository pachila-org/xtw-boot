package org.jeecg.modules.xtw.controller;

import java.util.Arrays;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.system.query.QueryGenerator;
import org.jeecg.modules.xtw.entity.XtwTestRecord;
import org.jeecg.modules.xtw.model.JimuDictModel;
import org.jeecg.modules.xtw.service.IXtwTestRecordService;

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
 * @Description: xtw_test_record
 * @Author: jeecg-boot
 * @Date:   2023-04-09
 * @Version: V1.0
 */
@Api(tags="xtw_test_record")
@RestController
@RequestMapping("/xtw/testRecord")
@Slf4j
public class XtwTestRecordController extends JeecgController<XtwTestRecord, IXtwTestRecordService> {
	@Autowired
	private IXtwTestRecordService xtwTestRecordService;
	
	/**
	 * 分页列表查询
	 *
	 * @param xtwTestRecord
	 * @param pageNo
	 * @param pageSize
	 * @param req
	 * @return
	 */
	//@AutoLog(value = "xtw_test_record-分页列表查询")
	@ApiOperation(value="xtw_test_record-分页列表查询", notes="xtw_test_record-分页列表查询")
	@GetMapping(value = "/list")
	public Result<IPage<XtwTestRecord>> queryPageList(XtwTestRecord xtwTestRecord,
								   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
								   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
								   HttpServletRequest req) {
		QueryWrapper<XtwTestRecord> queryWrapper = QueryGenerator.initQueryWrapper(xtwTestRecord, req.getParameterMap());
		Page<XtwTestRecord> page = new Page<XtwTestRecord>(pageNo, pageSize);
		IPage<XtwTestRecord> pageList = xtwTestRecordService.page(page, queryWrapper);
		return Result.OK(pageList);
	}
	
	/**
	 *   添加
	 *
	 * @param xtwTestRecord
	 * @return
	 */
	@AutoLog(value = "xtw_test_record-添加")
	@ApiOperation(value="xtw_test_record-添加", notes="xtw_test_record-添加")
	//@RequiresPermissions("org.jeecg.modules.xtw:xtw_test_record:add")
	@PostMapping(value = "/add")
	public Result<String> add(@RequestBody XtwTestRecord xtwTestRecord) {
		xtwTestRecordService.save(xtwTestRecord);
		return Result.OK("添加成功！");
	}
	
	/**
	 *  编辑
	 *
	 * @param xtwTestRecord
	 * @return
	 */
	@AutoLog(value = "xtw_test_record-编辑")
	@ApiOperation(value="xtw_test_record-编辑", notes="xtw_test_record-编辑")
	//@RequiresPermissions("org.jeecg.modules.xtw:xtw_test_record:edit")
	@RequestMapping(value = "/edit", method = {RequestMethod.PUT,RequestMethod.POST})
	public Result<String> edit(@RequestBody XtwTestRecord xtwTestRecord) {
		xtwTestRecordService.updateById(xtwTestRecord);
		return Result.OK("编辑成功!");
	}
	
	/**
	 *   通过id删除
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "xtw_test_record-通过id删除")
	@ApiOperation(value="xtw_test_record-通过id删除", notes="xtw_test_record-通过id删除")
	//@RequiresPermissions("org.jeecg.modules.xtw:xtw_test_record:delete")
	@DeleteMapping(value = "/delete")
	public Result<String> delete(@RequestParam(name="id",required=true) String id) {
		xtwTestRecordService.removeById(id);
		return Result.OK("删除成功!");
	}
	
	/**
	 *  批量删除
	 *
	 * @param ids
	 * @return
	 */
	@AutoLog(value = "xtw_test_record-批量删除")
	@ApiOperation(value="xtw_test_record-批量删除", notes="xtw_test_record-批量删除")
	//@RequiresPermissions("org.jeecg.modules.xtw:xtw_test_record:deleteBatch")
	@DeleteMapping(value = "/deleteBatch")
	public Result<String> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
		this.xtwTestRecordService.removeByIds(Arrays.asList(ids.split(",")));
		return Result.OK("批量删除成功!");
	}
	
	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	//@AutoLog(value = "xtw_test_record-通过id查询")
	@ApiOperation(value="xtw_test_record-通过id查询", notes="xtw_test_record-通过id查询")
	@GetMapping(value = "/queryById")
	public Result<XtwTestRecord> queryById(@RequestParam(name="id",required=true) String id) {
		XtwTestRecord xtwTestRecord = xtwTestRecordService.getById(id);
		if(xtwTestRecord==null) {
			return Result.error("未找到对应数据");
		}
		return Result.OK(xtwTestRecord);
	}

    /**
    * 导出excel
    *
    * @param request
    * @param xtwTestRecord
    */
    //@RequiresPermissions("org.jeecg.modules.xtw:xtw_test_record:exportXls")
    @RequestMapping(value = "/exportXls")
    public ModelAndView exportXls(HttpServletRequest request, XtwTestRecord xtwTestRecord) {
        return super.exportXls(request, xtwTestRecord, XtwTestRecord.class, "xtw_test_record");
    }

    /**
      * 通过excel导入数据
    *
    * @param request
    * @param response
    * @return
    */
    //@RequiresPermissions("org.jeecg.modules.xtw:xtw_test_record:importExcel")
    @RequestMapping(value = "/importExcel", method = RequestMethod.POST)
    public Result<?> importExcel(HttpServletRequest request, HttpServletResponse response) {
        return super.importExcel(request, response, XtwTestRecord.class);
    }

	/**
	 * 获取大批次（waferLot）的下拉列表信息
	 */
	@ApiOperation(value = "获取大批次（waferLot）的下拉列表信息", notes = "获取大批次（waferLot）的下拉列表信息")
	@RequestMapping(value = "/getWaferLotList", method = RequestMethod.GET)
	public List<?> getWaferLotList(@RequestParam(name="from",required=false) String from, @RequestParam(name="to",required=false) String to) {
		List<JimuDictModel> waferLotList = xtwTestRecordService.getWaferLotList(from, to);
		return waferLotList;
	}

	/**
	 * 获取产品名（icName）的下拉列表信息
	 */
	@ApiOperation(value = "获取产品名（icName）的下拉列表信息", notes = "获取产品名（icName）的下拉列表信息")
	@RequestMapping(value = "/getIcNameList", method = RequestMethod.GET)
	public List<?> getIcNameList(@RequestParam(name="waferLot",required=false) String waferLot, @RequestParam(name="from",required=false) String from, @RequestParam(name="to",required=false) String to) {
		List<JimuDictModel> icNameList = xtwTestRecordService.getICNameList(waferLot, from, to);
		return icNameList;
	}

	/**
	 * 获取测试项目（testItem）的下拉列表信息
	 */
	@ApiOperation(value = "获取测试项目（testItem）的下拉列表信息", notes = "获取测试项目（testItem）的下拉列表信息")
	@RequestMapping(value = "/getTestItemList", method = RequestMethod.GET)
	public List<?> getTestItemList(@RequestParam(name="waferLot",required=false) String waferLot, @RequestParam(name="icName",required=false) String icName, @RequestParam(name="from",required=false) String from, @RequestParam(name="to",required=false) String to) {
		List<JimuDictModel> testItemList = xtwTestRecordService.getTestItemList(waferLot, icName, from, to);
		return testItemList;
	}
}
