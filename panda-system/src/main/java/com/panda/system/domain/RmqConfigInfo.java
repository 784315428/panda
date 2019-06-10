package com.panda.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.panda.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * rmq配置表 rmq_config_info
 * 
 * @author panda
 * @date 2019-06-08
 */
public class RmqConfigInfo extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 主键 */
	private Integer id;
	/** 主题 */
	private String topic;
	/** namesrv */
	private String namesrv;
	/** 消费组 */
	private String cgroup;
	/** tag */
	private String tag;
	/** 域 */
	private String field;
	/** 集群 */
	private String clustor;
	/** 消费方war包 */
	private String consumerWarName;
	/** 生产方war包 */
	private String produerWarName;
	/** 主题持有者工号 */
	private String topicHoldEmpCode;
	/** 主题持有者名字 */
	private String topicHoldEmpName;
	/** 生产方运维工号 */
	private String produerDevopsEmpCode;
	/** 生产方运维名字 */
	private String produerDevopsEmpName;
	/** 消费方运维工号 */
	private String consumerDevopsEmpCode;
	/** 消费方运维名字 */
	private String consumerDevopsEmpName;
	/** 修改时间 */
	private Date modifyTime;
	/** 修改时间 */
	private Date createTime;
	/** 主题持有者工号 */
	private String consumerHoldEmpCode;
	/** 主题持有者名字 */
	private String consumerHoldEmpName;


	public String getConsumerHoldEmpCode()
	{
		return consumerHoldEmpCode;
	}
	public void setConsumerHoldEmpCode(String consumerHoldEmpCode)
	{
		this.consumerHoldEmpCode = consumerHoldEmpCode;
	}

	public String getConsumerHoldEmpName()
	{
		return consumerHoldEmpName;
	}
	public void setConsumerHoldEmpName(String consumerHoldEmpName)
	{
		this.consumerHoldEmpName = consumerHoldEmpName;
	}

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setTopic(String topic) 
	{
		this.topic = topic;
	}

	public String getTopic() 
	{
		return topic;
	}
	public void setNamesrv(String namesrv) 
	{
		this.namesrv = namesrv;
	}

	public String getNamesrv() 
	{
		return namesrv;
	}
	public void setCgroup(String cgroup) 
	{
		this.cgroup = cgroup;
	}

	public String getCgroup() 
	{
		return cgroup;
	}
	public void setTag(String tag) 
	{
		this.tag = tag;
	}

	public String getTag() 
	{
		return tag;
	}
	public void setField(String field) 
	{
		this.field = field;
	}

	public String getField() 
	{
		return field;
	}
	public void setClustor(String clustor) 
	{
		this.clustor = clustor;
	}

	public String getClustor() 
	{
		return clustor;
	}
	public void setConsumerWarName(String consumerWarName) 
	{
		this.consumerWarName = consumerWarName;
	}

	public String getConsumerWarName() 
	{
		return consumerWarName;
	}
	public void setProduerWarName(String produerWarName) 
	{
		this.produerWarName = produerWarName;
	}

	public String getProduerWarName() 
	{
		return produerWarName;
	}
	public void setTopicHoldEmpCode(String topicHoldEmpCode) 
	{
		this.topicHoldEmpCode = topicHoldEmpCode;
	}

	public String getTopicHoldEmpCode() 
	{
		return topicHoldEmpCode;
	}
	public void setTopicHoldEmpName(String topicHoldEmpName) 
	{
		this.topicHoldEmpName = topicHoldEmpName;
	}

	public String getTopicHoldEmpName() 
	{
		return topicHoldEmpName;
	}
	public void setProduerDevopsEmpCode(String produerDevopsEmpCode) 
	{
		this.produerDevopsEmpCode = produerDevopsEmpCode;
	}

	public String getProduerDevopsEmpCode() 
	{
		return produerDevopsEmpCode;
	}
	public void setProduerDevopsEmpName(String produerDevopsEmpName) 
	{
		this.produerDevopsEmpName = produerDevopsEmpName;
	}

	public String getProduerDevopsEmpName() 
	{
		return produerDevopsEmpName;
	}
	public void setConsumerDevopsEmpCode(String consumerDevopsEmpCode) 
	{
		this.consumerDevopsEmpCode = consumerDevopsEmpCode;
	}

	public String getConsumerDevopsEmpCode() 
	{
		return consumerDevopsEmpCode;
	}
	public void setConsumerDevopsEmpName(String consumerDevopsEmpName) 
	{
		this.consumerDevopsEmpName = consumerDevopsEmpName;
	}

	public String getConsumerDevopsEmpName() 
	{
		return consumerDevopsEmpName;
	}
	public void setModifyTime(Date modifyTime) 
	{
		this.modifyTime = modifyTime;
	}

	public Date getModifyTime() 
	{
		return modifyTime;
	}

	public Date getCreateTime()
	{
		return createTime;
	}

	public void setCreateTime(Date createTime)
	{
		this.createTime = createTime;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("topic", getTopic())
            .append("namesrv", getNamesrv())
            .append("cgroup", getCgroup())
            .append("tag", getTag())
            .append("field", getField())
            .append("clustor", getClustor())
            .append("consumerWarName", getConsumerWarName())
            .append("produerWarName", getProduerWarName())
            .append("topicHoldEmpCode", getTopicHoldEmpCode())
            .append("topicHoldEmpName", getTopicHoldEmpName())
            .append("produerDevopsEmpCode", getProduerDevopsEmpCode())
            .append("produerDevopsEmpName", getProduerDevopsEmpName())
            .append("consumerDevopsEmpCode", getConsumerDevopsEmpCode())
            .append("consumerDevopsEmpName", getConsumerDevopsEmpName())
            .append("createTime", getCreateTime())
            .append("modifyTime", getModifyTime())
            .toString();
    }
}
