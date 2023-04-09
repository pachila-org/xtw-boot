package org.jeecg.modules.xtw.controller;

import java.util.Arrays;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.system.query.QueryGenerator;
import org.jeecg.modules.xtw.entity.XtwTestOthersDetailNew;
import org.jeecg.modules.xtw.service.IXtwTestOthersDetailNewService;

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
 * @Description: xtw_test_others_detail_new
 * @Author: jeecg-boot
 * @Date:   2023-04-09
 * @Version: V1.0
 */
@Api(tags="xtw_test_others_detail_new")
@RestController
@RequestMapping("/xtw/xtwTestOthersDetailNew")
@Slf4j
public class XtwTestOthersDetailNewController extends JeecgController<XtwTestOthersDetailNew, IXtwTestOthersDetailNewService> {
	@Autowired
	private IXtwTestOthersDetailNewService xtwTestOthersDetailNewService;
	
	/**
	 * 分页列表查询
	 *
	 * @param xtwTestOthersDetailNew
	 * @param pageNo
	 * @param pageSize
	 * @param req
	 * @return
	 */
	//@AutoLog(value = "xtw_test_others_detail_new-分页列表查询")
	@ApiOperation(value="xtw_test_others_detail_new-分页列表查询", notes="xtw_test_others_detail_new-分页列表查询")
	@GetMapping(value = "/list")
	public Result<IPage<XtwTestOthersDetailNew>> queryPageList(XtwTestOthersDetailNew xtwTestOthersDetailNew,
								   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
								   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
								   HttpServletRequest req) {
		QueryWrapper<XtwTestOthersDetailNew> queryWrapper = QueryGenerator.initQueryWrapper(xtwTestOthersDetailNew, req.getParameterMap());
		Page<XtwTestOthersDetailNew> page = new Page<XtwTestOthersDetailNew>(pageNo, pageSize);
		IPage<XtwTestOthersDetailNew> pageList = xtwTestOthersDetailNewService.page(page, queryWrapper);
		return Result.OK(pageList);
	}
	
	/**
	 *   添加
	 *
	 * @param xtwTestOthersDetailNew
	 * @return
	 */
	@AutoLog(value = "xtw_test_others_detail_new-添加")
	@ApiOperation(value="xtw_test_others_detail_new-添加", notes="xtw_test_others_detail_new-添加")
	//@RequiresPermissions("xtw:xtw_test_others_detail_new:add")
	@PostMapping(value = "/add")
	public Result<String> add(@RequestBody XtwTestOthersDetailNew xtwTestOthersDetailNew) {
		xtwTestOthersDetailNewService.save(xtwTestOthersDetailNew);
		return Result.OK("添加成功！");
	}
	
	/**
	 *  编辑
	 *
	 * @param xtwTestOthersDetailNew
	 * @return
	 */
	@AutoLog(value = "xtw_test_others_detail_new-编辑")
	@ApiOperation(value="xtw_test_others_detail_new-编辑", notes="xtw_test_others_detail_new-编辑")
	//@RequiresPermissions("xtw:xtw_test_others_detail_new:edit")
	@RequestMapping(value = "/edit", method = {RequestMethod.PUT,RequestMethod.POST})
	public Result<String> edit(@RequestBody XtwTestOthersDetailNew xtwTestOthersDetailNew) {
		xtwTestOthersDetailNewService.updateById(xtwTestOthersDetailNew);
		return Result.OK("编辑成功!");
	}
	
	/**
	 *   通过id删除
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "xtw_test_others_detail_new-通过id删除")
	@ApiOperation(value="xtw_test_others_detail_new-通过id删除", notes="xtw_test_others_detail_new-通过id删除")
	//@RequiresPermissions("xtw:xtw_test_others_detail_new:delete")
	@DeleteMapping(value = "/delete")
	public Result<String> delete(@RequestParam(name="id",required=true) String id) {
		xtwTestOthersDetailNewService.removeById(id);
		return Result.OK("删除成功!");
	}
	
	/**
	 *  批量删除
	 *
	 * @param ids
	 * @return
	 */
	@AutoLog(value = "xtw_test_others_detail_new-批量删除")
	@ApiOperation(value="xtw_test_others_detail_new-批量删除", notes="xtw_test_others_detail_new-批量删除")
	//@RequiresPermissions("xtw:xtw_test_others_detail_new:deleteBatch")
	@DeleteMapping(value = "/deleteBatch")
	public Result<String> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
		this.xtwTestOthersDetailNewService.removeByIds(Arrays.asList(ids.split(",")));
		return Result.OK("批量删除成功!");
	}
	
	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	//@AutoLog(value = "xtw_test_others_detail_new-通过id查询")
	@ApiOperation(value="xtw_test_others_detail_new-通过id查询", notes="xtw_test_others_detail_new-通过id查询")
	@GetMapping(value = "/queryById")
	public Result<XtwTestOthersDetailNew> queryById(@RequestParam(name="id",required=true) String id) {
		XtwTestOthersDetailNew xtwTestOthersDetailNew = xtwTestOthersDetailNewService.getById(id);
		if(xtwTestOthersDetailNew==null) {
			return Result.error("未找到对应数据");
		}
		return Result.OK(xtwTestOthersDetailNew);
	}

    /**
    * 导出excel
    *
    * @param request
    * @param xtwTestOthersDetailNew
    */
    //@RequiresPermissions("xtw:xtw_test_others_detail_new:exportXls")
    @RequestMapping(value = "/exportXls")
    public ModelAndView exportXls(HttpServletRequest request, XtwTestOthersDetailNew xtwTestOthersDetailNew) {
        return super.exportXls(request, xtwTestOthersDetailNew, XtwTestOthersDetailNew.class, "xtw_test_others_detail_new");
    }

    /**
      * 通过excel导入数据
    *
    * @param request
    * @param response
    * @return
    */
    //@RequiresPermissions("xtw:xtw_test_others_detail_new:importExcel")
    @RequestMapping(value = "/importExcel", method = RequestMethod.POST)
    public Result<?> importExcel(HttpServletRequest request, HttpServletResponse response) {
        return super.importExcel(request, response, XtwTestOthersDetailNew.class);
    }

}
