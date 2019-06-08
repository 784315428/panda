package com.panda.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.panda.system.mapper.RmqConfigInfoMapper;
import com.panda.system.domain.RmqConfigInfo;
import com.panda.system.service.IRmqConfigInfoService;
import com.panda.common.core.text.Convert;

/**
 * rmq配置 服务层实现
 * 
 * @author panda
 * @date 2019-06-08
 */
@Service
public class RmqConfigInfoServiceImpl implements IRmqConfigInfoService 
{
	@Autowired
	private RmqConfigInfoMapper rmqConfigInfoMapper;

	/**
     * 查询rmq配置信息
     * 
     * @param id rmq配置ID
     * @return rmq配置信息
     */
    @Override
	public RmqConfigInfo selectRmqConfigInfoById(Integer id)
	{
	    return rmqConfigInfoMapper.selectRmqConfigInfoById(id);
	}
	
	/**
     * 查询rmq配置列表
     * 
     * @param rmqConfigInfo rmq配置信息
     * @return rmq配置集合
     */
	@Override
	public List<RmqConfigInfo> selectRmqConfigInfoList(RmqConfigInfo rmqConfigInfo)
	{
	    return rmqConfigInfoMapper.selectRmqConfigInfoList(rmqConfigInfo);
	}
	
    /**
     * 新增rmq配置
     * 
     * @param rmqConfigInfo rmq配置信息
     * @return 结果
     */
	@Override
	public int insertRmqConfigInfo(RmqConfigInfo rmqConfigInfo)
	{
	    return rmqConfigInfoMapper.insertRmqConfigInfo(rmqConfigInfo);
	}
	
	/**
     * 修改rmq配置
     * 
     * @param rmqConfigInfo rmq配置信息
     * @return 结果
     */
	@Override
	public int updateRmqConfigInfo(RmqConfigInfo rmqConfigInfo)
	{
	    return rmqConfigInfoMapper.updateRmqConfigInfo(rmqConfigInfo);
	}

	/**
     * 删除rmq配置对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteRmqConfigInfoByIds(String ids)
	{
		return rmqConfigInfoMapper.deleteRmqConfigInfoByIds(Convert.toStrArray(ids));
	}
	
}
