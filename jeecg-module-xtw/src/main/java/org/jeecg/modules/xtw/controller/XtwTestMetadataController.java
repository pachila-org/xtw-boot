package org.jeecg.modules.xtw.controller;

import java.util.Arrays;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.system.query.QueryGenerator;
import org.jeecg.modules.xtw.entity.XtwTestMetadata;
import org.jeecg.modules.xtw.service.IXtwTestMetadataService;

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
 * @Description: xtw_test_metadata
 * @Author: jeecg-boot
 * @Date:   2023-04-12
 * @Version: V1.0
 */
@Api(tags="xtw_test_metadata")
@RestController
@RequestMapping("/xtw/xtwTestMetadata")
@Slf4j
public class XtwTestMetadataController extends JeecgController<XtwTestMetadata, IXtwTestMetadataService> {
	@Autowired
	private IXtwTestMetadataService xtwTestMetadataService;
	
	/**
	 * 分页列表查询
	 *
	 * @param xtwTestMetadata
	 * @param pageNo
	 * @param pageSize
	 * @param req
	 * @return
	 */
	//@AutoLog(value = "xtw_test_metadata-分页列表查询")
	@ApiOperation(value="xtw_test_metadata-分页列表查询", notes="xtw_test_metadata-分页列表查询")
	@GetMapping(value = "/list")
	public Result<IPage<XtwTestMetadata>> queryPageList(XtwTestMetadata xtwTestMetadata,
								   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
								   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
								   HttpServletRequest req) {
		QueryWrapper<XtwTestMetadata> queryWrapper = QueryGenerator.initQueryWrapper(xtwTestMetadata, req.getParameterMap());
		Page<XtwTestMetadata> page = new Page<XtwTestMetadata>(pageNo, pageSize);
		IPage<XtwTestMetadata> pageList = xtwTestMetadataService.page(page, queryWrapper);
		return Result.OK(pageList);
	}
	
	/**
	 *   添加
	 *
	 * @param xtwTestMetadata
	 * @return
	 */
	@AutoLog(value = "xtw_test_metadata-添加")
	@ApiOperation(value="xtw_test_metadata-添加", notes="xtw_test_metadata-添加")
	//@RequiresPermissions("xtw:xtw_test_metadata:add")
	@PostMapping(value = "/add")
	public Result<String> add(@RequestBody XtwTestMetadata xtwTestMetadata) {
		xtwTestMetadataService.save(xtwTestMetadata);
		return Result.OK("添加成功！");
	}
	
	/**
	 *  编辑
	 *
	 * @param xtwTestMetadata
	 * @return
	 */
	@AutoLog(value = "xtw_test_metadata-编辑")
	@ApiOperation(value="xtw_test_metadata-编辑", notes="xtw_test_metadata-编辑")
	//@RequiresPermissions("xtw:xtw_test_metadata:edit")
	@RequestMapping(value = "/edit", method = {RequestMethod.PUT,RequestMethod.POST})
	public Result<String> edit(@RequestBody XtwTestMetadata xtwTestMetadata) {
		xtwTestMetadataService.updateById(xtwTestMetadata);
		return Result.OK("编辑成功!");
	}
	
	/**
	 *   通过id删除
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "xtw_test_metadata-通过id删除")
	@ApiOperation(value="xtw_test_metadata-通过id删除", notes="xtw_test_metadata-通过id删除")
	//@RequiresPermissions("xtw:xtw_test_metadata:delete")
	@DeleteMapping(value = "/delete")
	public Result<String> delete(@RequestParam(name="id",required=true) String id) {
		xtwTestMetadataService.removeById(id);
		return Result.OK("删除成功!");
	}
	
	/**
	 *  批量删除
	 *
	 * @param ids
	 * @return
	 */
	@AutoLog(value = "xtw_test_metadata-批量删除")
	@ApiOperation(value="xtw_test_metadata-批量删除", notes="xtw_test_metadata-批量删除")
	//@RequiresPermissions("xtw:xtw_test_metadata:deleteBatch")
	@DeleteMapping(value = "/deleteBatch")
	public Result<String> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
		this.xtwTestMetadataService.removeByIds(Arrays.asList(ids.split(",")));
		return Result.OK("批量删除成功!");
	}
	
	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	//@AutoLog(value = "xtw_test_metadata-通过id查询")
	@ApiOperation(value="xtw_test_metadata-通过id查询", notes="xtw_test_metadata-通过id查询")
	@GetMapping(value = "/queryById")
	public Result<XtwTestMetadata> queryById(@RequestParam(name="id",required=true) String id) {
		XtwTestMetadata xtwTestMetadata = xtwTestMetadataService.getById(id);
		if(xtwTestMetadata==null) {
			return Result.error("未找到对应数据");
		}
		return Result.OK(xtwTestMetadata);
	}

    /**
    * 导出excel
    *
    * @param request
    * @param xtwTestMetadata
    */
    //@RequiresPermissions("xtw:xtw_test_metadata:exportXls")
    @RequestMapping(value = "/exportXls")
    public ModelAndView exportXls(HttpServletRequest request, XtwTestMetadata xtwTestMetadata) {
        return super.exportXls(request, xtwTestMetadata, XtwTestMetadata.class, "xtw_test_metadata");
    }

    /**
      * 通过excel导入数据
    *
    * @param request
    * @param response
    * @return
    */
    //@RequiresPermissions("xtw:xtw_test_metadata:importExcel")
    @RequestMapping(value = "/importExcel", method = RequestMethod.POST)
    public Result<?> importExcel(HttpServletRequest request, HttpServletResponse response) {
        return super.importExcel(request, response, XtwTestMetadata.class);
    }

}
