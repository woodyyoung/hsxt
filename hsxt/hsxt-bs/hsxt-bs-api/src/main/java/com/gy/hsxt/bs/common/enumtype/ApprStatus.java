/*
 * Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
 *
 * 注意：本内容仅限于深圳市归一科技研发有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
package com.gy.hsxt.bs.common.enumtype;

/**
 * 通用审批状态枚举类
 * 
 * @Package: com.gy.hsxt.bs.common.enumtype
 * @ClassName: ApprStatus
 * @Description: TODO
 * @author: likui
 * @date: 2015年9月29日 下午4:37:15
 * @company: gyist
 * @version V3.0.0
 */
public enum ApprStatus {

	/** 待审批 **/
	WAIT_APPR(0),

	/** 审批通过 **/
	PASS(1),

	/** 审批驳回 **/
	REJECT(2);

	private int code;

	ApprStatus(int code)
	{
		this.code = code;
	}

	public int getCode()
	{
		return code;
	}

	/**
	 * 校验审批状态类型
	 *
	 * @param code 状态代码
	 * @return boolean
	 */
	public static boolean checkStatus(int code) {
		for (ApprStatus apprStatus : ApprStatus.values()) {
			if (apprStatus.getCode() == code) {
				return true;
			}
		}
		return false;
	}
}
