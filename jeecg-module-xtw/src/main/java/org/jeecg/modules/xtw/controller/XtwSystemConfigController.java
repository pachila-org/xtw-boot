package org.jeecg.modules.xtw.controller;

import java.util.Arrays;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.system.query.QueryGenerator;
import org.jeecg.modules.xtw.entity.XtwSystemConfig;
import org.jeecg.modules.xtw.service.IXtwSystemConfigService;

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
 * @Description: xtw_system_config
 * @Author: jeecg-boot
 * @Date:   2023-04-09
 * @Version: V1.0
 */
@Api(tags="xtw_system_config")
@RestController
@RequestMapping("/xtw/xtwSystemConfig")
@Slf4j
public class XtwSystemConfigController extends JeecgController<XtwSystemConfig, IXtwSystemConfigService> {
	@Autowired
	private IXtwSystemConfigService xtwSystemConfigService;
	
	/**
	 * 分页列表查询
	 *
	 * @param xtwSystemConfig
	 * @param pageNo
	 * @param pageSize
	 * @param req
	 * @return
	 */
	//@AutoLog(value = "xtw_system_config-分页列表查询")
	@ApiOperation(value="xtw_system_config-分页列表查询", notes="xtw_system_config-分页列表查询")
	@GetMapping(value = "/list")
	public Result<IPage<XtwSystemConfig>> queryPageList(XtwSystemConfig xtwSystemConfig,
								   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
								   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
								   HttpServletRequest req) {
		QueryWrapper<XtwSystemConfig> queryWrapper = QueryGenerator.initQueryWrapper(xtwSystemConfig, req.getParameterMap());
		Page<XtwSystemConfig> page = new Page<XtwSystemConfig>(pageNo, pageSize);
		IPage<XtwSystemConfig> pageList = xtwSystemConfigService.page(page, queryWrapper);
		return Result.OK(pageList);
	}
	
	/**
	 *   添加
	 *
	 * @param xtwSystemConfig
	 * @return
	 */
	@AutoLog(value = "xtw_system_config-添加")
	@ApiOperation(value="xtw_system_config-添加", notes="xtw_system_config-添加")
	//@RequiresPermissions("xtw:xtw_system_config:add")
	@PostMapping(value = "/add")
	public Result<String> add(@RequestBody XtwSystemConfig xtwSystemConfig) {
		xtwSystemConfigService.save(xtwSystemConfig);
		return Result.OK("添加成功！");
	}
	
	/**
	 *  编辑
	 *
	 * @param xtwSystemConfig
	 * @return
	 */
	@AutoLog(value = "xtw_system_config-编辑")
	@ApiOperation(value="xtw_system_config-编辑", notes="xtw_system_config-编辑")
	//@RequiresPermissions("xtw:xtw_system_config:edit")
	@RequestMapping(value = "/edit", method = {RequestMethod.PUT,RequestMethod.POST})
	public Result<String> edit(@RequestBody XtwSystemConfig xtwSystemConfig) {
		xtwSystemConfigService.updateById(xtwSystemConfig);
		return Result.OK("编辑成功!");
	}
	
	/**
	 *   通过id删除
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "xtw_system_config-通过id删除")
	@ApiOperation(value="xtw_system_config-通过id删除", notes="xtw_system_config-通过id删除")
	//@RequiresPermissions("xtw:xtw_system_config:delete")
	@DeleteMapping(value = "/delete")
	public Result<String> delete(@RequestParam(name="id",required=true) String id) {
		xtwSystemConfigService.removeById(id);
		return Result.OK("删除成功!");
	}
	
	/**
	 *  批量删除
	 *
	 * @param ids
	 * @return
	 */
	@AutoLog(value = "xtw_system_config-批量删除")
	@ApiOperation(value="xtw_system_config-批量删除", notes="xtw_system_config-批量删除")
	//@RequiresPermissions("xtw:xtw_system_config:deleteBatch")
	@DeleteMapping(value = "/deleteBatch")
	public Result<String> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
		this.xtwSystemConfigService.removeByIds(Arrays.asList(ids.split(",")));
		return Result.OK("批量删除成功!");
	}
	
	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	//@AutoLog(value = "xtw_system_config-通过id查询")
	@ApiOperation(value="xtw_system_config-通过id查询", notes="xtw_system_config-通过id查询")
	@GetMapping(value = "/queryById")
	public Result<XtwSystemConfig> queryById(@RequestParam(name="id",required=true) String id) {
		XtwSystemConfig xtwSystemConfig = xtwSystemConfigService.getById(id);
		if(xtwSystemConfig==null) {
			return Result.error("未找到对应数据");
		}
		return Result.OK(xtwSystemConfig);
	}

    /**
    * 导出excel
    *
    * @param request
    * @param xtwSystemConfig
    */
    //@RequiresPermissions("xtw:xtw_system_config:exportXls")
    @RequestMapping(value = "/exportXls")
    public ModelAndView exportXls(HttpServletRequest request, XtwSystemConfig xtwSystemConfig) {
        return super.exportXls(request, xtwSystemConfig, XtwSystemConfig.class, "xtw_system_config");
    }

    /**
      * 通过excel导入数据
    *
    * @param request
    * @param response
    * @return
    */
    //@RequiresPermissions("xtw:xtw_system_config:importExcel")
    @RequestMapping(value = "/importExcel", method = RequestMethod.POST)
    public Result<?> importExcel(HttpServletRequest request, HttpServletResponse response) {
        return super.importExcel(request, response, XtwSystemConfig.class);
    }

}
