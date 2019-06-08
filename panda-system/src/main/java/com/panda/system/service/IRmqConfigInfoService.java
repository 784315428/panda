package com.panda.system.service;

import com.panda.system.domain.RmqConfigInfo;
import java.util.List;

/**
 * rmq配置 服务层
 * 
 * @author panda
 * @date 2019-06-08
 */
public interface IRmqConfigInfoService 
{
	/**
     * 查询rmq配置信息
     * 
     * @param id rmq配置ID
     * @return rmq配置信息
     */
	public RmqConfigInfo selectRmqConfigInfoById(Integer id);
	
	/**
     * 查询rmq配置列表
     * 
     * @param rmqConfigInfo rmq配置信息
     * @return rmq配置集合
     */
	public List<RmqConfigInfo> selectRmqConfigInfoList(RmqConfigInfo rmqConfigInfo);
	
	/**
     * 新增rmq配置
     * 
     * @param rmqConfigInfo rmq配置信息
     * @return 结果
     */
	public int insertRmqConfigInfo(RmqConfigInfo rmqConfigInfo);
	
	/**
     * 修改rmq配置
     * 
     * @param rmqConfigInfo rmq配置信息
     * @return 结果
     */
	public int updateRmqConfigInfo(RmqConfigInfo rmqConfigInfo);
		
	/**
     * 删除rmq配置信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteRmqConfigInfoByIds(String ids);
	
}
