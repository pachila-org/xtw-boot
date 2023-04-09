package org.jeecg.modules.xtw.controller;

import java.util.Arrays;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.system.query.QueryGenerator;
import org.jeecg.modules.xtw.entity.XtwFieldDefinition;
import org.jeecg.modules.xtw.service.IXtwFieldDefinitionService;

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
 * @Description: xtw_field_definition
 * @Author: jeecg-boot
 * @Date:   2023-04-09
 * @Version: V1.0
 */
@Api(tags="xtw_field_definition")
@RestController
@RequestMapping("/xtw/xtwFieldDefinition")
@Slf4j
public class XtwFieldDefinitionController extends JeecgController<XtwFieldDefinition, IXtwFieldDefinitionService> {
	@Autowired
	private IXtwFieldDefinitionService xtwFieldDefinitionService;
	
	/**
	 * 分页列表查询
	 *
	 * @param xtwFieldDefinition
	 * @param pageNo
	 * @param pageSize
	 * @param req
	 * @return
	 */
	//@AutoLog(value = "xtw_field_definition-分页列表查询")
	@ApiOperation(value="xtw_field_definition-分页列表查询", notes="xtw_field_definition-分页列表查询")
	@GetMapping(value = "/list")
	public Result<IPage<XtwFieldDefinition>> queryPageList(XtwFieldDefinition xtwFieldDefinition,
								   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
								   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
								   HttpServletRequest req) {
		QueryWrapper<XtwFieldDefinition> queryWrapper = QueryGenerator.initQueryWrapper(xtwFieldDefinition, req.getParameterMap());
		Page<XtwFieldDefinition> page = new Page<XtwFieldDefinition>(pageNo, pageSize);
		IPage<XtwFieldDefinition> pageList = xtwFieldDefinitionService.page(page, queryWrapper);
		return Result.OK(pageList);
	}
	
	/**
	 *   添加
	 *
	 * @param xtwFieldDefinition
	 * @return
	 */
	@AutoLog(value = "xtw_field_definition-添加")
	@ApiOperation(value="xtw_field_definition-添加", notes="xtw_field_definition-添加")
	//@RequiresPermissions("xtw:xtw_field_definition:add")
	@PostMapping(value = "/add")
	public Result<String> add(@RequestBody XtwFieldDefinition xtwFieldDefinition) {
		xtwFieldDefinitionService.save(xtwFieldDefinition);
		return Result.OK("添加成功！");
	}
	
	/**
	 *  编辑
	 *
	 * @param xtwFieldDefinition
	 * @return
	 */
	@AutoLog(value = "xtw_field_definition-编辑")
	@ApiOperation(value="xtw_field_definition-编辑", notes="xtw_field_definition-编辑")
	//@RequiresPermissions("xtw:xtw_field_definition:edit")
	@RequestMapping(value = "/edit", method = {RequestMethod.PUT,RequestMethod.POST})
	public Result<String> edit(@RequestBody XtwFieldDefinition xtwFieldDefinition) {
		xtwFieldDefinitionService.updateById(xtwFieldDefinition);
		return Result.OK("编辑成功!");
	}
	
	/**
	 *   通过id删除
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "xtw_field_definition-通过id删除")
	@ApiOperation(value="xtw_field_definition-通过id删除", notes="xtw_field_definition-通过id删除")
	//@RequiresPermissions("xtw:xtw_field_definition:delete")
	@DeleteMapping(value = "/delete")
	public Result<String> delete(@RequestParam(name="id",required=true) String id) {
		xtwFieldDefinitionService.removeById(id);
		return Result.OK("删除成功!");
	}
	
	/**
	 *  批量删除
	 *
	 * @param ids
	 * @return
	 */
	@AutoLog(value = "xtw_field_definition-批量删除")
	@ApiOperation(value="xtw_field_definition-批量删除", notes="xtw_field_definition-批量删除")
	//@RequiresPermissions("xtw:xtw_field_definition:deleteBatch")
	@DeleteMapping(value = "/deleteBatch")
	public Result<String> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
		this.xtwFieldDefinitionService.removeByIds(Arrays.asList(ids.split(",")));
		return Result.OK("批量删除成功!");
	}
	
	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	//@AutoLog(value = "xtw_field_definition-通过id查询")
	@ApiOperation(value="xtw_field_definition-通过id查询", notes="xtw_field_definition-通过id查询")
	@GetMapping(value = "/queryById")
	public Result<XtwFieldDefinition> queryById(@RequestParam(name="id",required=true) String id) {
		XtwFieldDefinition xtwFieldDefinition = xtwFieldDefinitionService.getById(id);
		if(xtwFieldDefinition==null) {
			return Result.error("未找到对应数据");
		}
		return Result.OK(xtwFieldDefinition);
	}

    /**
    * 导出excel
    *
    * @param request
    * @param xtwFieldDefinition
    */
    //@RequiresPermissions("xtw:xtw_field_definition:exportXls")
    @RequestMapping(value = "/exportXls")
    public ModelAndView exportXls(HttpServletRequest request, XtwFieldDefinition xtwFieldDefinition) {
        return super.exportXls(request, xtwFieldDefinition, XtwFieldDefinition.class, "xtw_field_definition");
    }

    /**
      * 通过excel导入数据
    *
    * @param request
    * @param response
    * @return
    */
    //@RequiresPermissions("xtw:xtw_field_definition:importExcel")
    @RequestMapping(value = "/importExcel", method = RequestMethod.POST)
    public Result<?> importExcel(HttpServletRequest request, HttpServletResponse response) {
        return super.importExcel(request, response, XtwFieldDefinition.class);
    }

}
