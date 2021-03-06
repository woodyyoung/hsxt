/*
 * Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
 *
 * 注意：本内容仅限于深圳市归一科技研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
 * 批处理作业dubbo接口
 * @author yangyp
 * 
 */
package com.gy.hsi.ds.job.service;

/***************************************************************************
 * <PRE>
 *  Project Name    : hsi-ds-param
 * 
 *  Package Name    : com.gy.hsi.ds.job.service
 * 
 *  File Name       : ILocalBatchServiceListener.java
 * 
 *  Creation Date   : 2016年5月26日
 * 
 *  Author          : zhangysh
 * 
 *  Purpose         : none
 * 
 * 
 *  History         : none
 * 
 * </PRE>
 ***************************************************************************/
public interface ILocalBatchServiceListener {

	/**
	 * 本地作业状态上报(本地)
	 * 
	 * @param executeId
	 *            执行id
	 * @param status
	 *            作业执行状态 0 成功 1失败 2执行中
	 * @param desc
	 *            相对应执行状态的描述
	 */
	public void reportStatusBySelf(String executeId, int status, String desc);
}
