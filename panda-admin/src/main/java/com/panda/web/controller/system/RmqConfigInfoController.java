package com.panda.web.controller.system;

import java.util.Date;
import java.util.List;

import com.panda.framework.util.ShiroUtils;
import com.panda.system.service.ISysDictDataService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.panda.common.annotation.Log;
import com.panda.common.enums.BusinessType;
import com.panda.system.domain.RmqConfigInfo;
import com.panda.system.service.IRmqConfigInfoService;
import com.panda.common.core.controller.BaseController;
import com.panda.common.core.page.TableDataInfo;
import com.panda.common.core.domain.AjaxResult;
import com.panda.common.utils.poi.ExcelUtil;

/**
 * rmq配置 信息操作处理
 * 
 * @author panda
 * @date 2019-06-08
 */
@Controller
@RequestMapping("/system/rmqConfigInfo")
public class RmqConfigInfoController extends BaseController
{
    private String prefix = "system/rmqConfigInfo";
	
	@Autowired
	private IRmqConfigInfoService rmqConfigInfoService;
	@Autowired
	private ISysDictDataService dictDataService;
	@RequiresPermissions("system:rmqConfigInfo:view")
	@GetMapping()
	public String rmqConfigInfo()
	{
	    return prefix + "/rmqConfigInfo";
	}
	
	/**
	 * 查询rmq配置列表
	 */
	@RequiresPermissions("system:rmqConfigInfo:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(RmqConfigInfo rmqConfigInfo)
	{
		startPage();
        List<RmqConfigInfo> list = rmqConfigInfoService.selectRmqConfigInfoList(rmqConfigInfo);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出rmq配置列表
	 */
	@RequiresPermissions("system:rmqConfigInfo:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RmqConfigInfo rmqConfigInfo)
    {
    	List<RmqConfigInfo> list = rmqConfigInfoService.selectRmqConfigInfoList(rmqConfigInfo);
        ExcelUtil<RmqConfigInfo> util = new ExcelUtil<RmqConfigInfo>(RmqConfigInfo.class);
        return util.exportExcel(list, "rmqConfigInfo");
    }
	
	/**
	 * 新增rmq配置
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存rmq配置
	 */
	@RequiresPermissions("system:rmqConfigInfo:add")
	@Log(title = "rmq配置", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(RmqConfigInfo rmqConfigInfo)
	{

		rmqConfigInfo.setTopicHoldEmpCode(ShiroUtils.getLoginName());
		rmqConfigInfo.setTopicHoldEmpName(ShiroUtils.getSysUser().getUserName());
		rmqConfigInfo.setCreateTime(new Date());
		rmqConfigInfo.setModifyTime(new Date());
		rmqConfigInfo.setNamesrv(dictDataService.selectDictLabel("clustor_namesrv",rmqConfigInfo.getClustor()));
		if(!checkRmq(rmqConfigInfo)){
			return error("topic或者cgroup命名不规范");
		}
		return toAjax(rmqConfigInfoService.insertRmqConfigInfo(rmqConfigInfo));
	}

	public boolean  checkRmq(RmqConfigInfo rmqConfigInfo){
		if(!rmqConfigInfo.getCgroup().endsWith("_CGROUP")){
			return false;
		}
		if(!rmqConfigInfo.getTopic().startsWith("MARKET")
			|| !rmqConfigInfo.getTopic().endsWith("PRODUCER")
		){
			return false;
		}
		return true;
	}

	/**
	 * 修改rmq配置
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		RmqConfigInfo rmqConfigInfo = rmqConfigInfoService.selectRmqConfigInfoById(id);
		mmap.put("rmqConfigInfo", rmqConfigInfo);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存rmq配置
	 */
	@RequiresPermissions("system:rmqConfigInfo:edit")
	@Log(title = "rmq配置", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(RmqConfigInfo rmqConfigInfo)
	{
		if(!checkRmq(rmqConfigInfo)){
			return error("topic或者cgroup命名不规范");
		}
		rmqConfigInfo.setModifyTime(new Date());
		rmqConfigInfo.setNamesrv(dictDataService.selectDictLabel("clustor_namesrv",rmqConfigInfo.getClustor()));
		return toAjax(rmqConfigInfoService.updateRmqConfigInfo(rmqConfigInfo));
	}
	
	/**
	 * 删除rmq配置
	 */
	@RequiresPermissions("system:rmqConfigInfo:remove")
	@Log(title = "rmq配置", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(rmqConfigInfoService.deleteRmqConfigInfoByIds(ids));
	}
	
}
