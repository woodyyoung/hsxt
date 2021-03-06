/*
 * Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
 *
 * 注意：本内容仅限于深圳市归一科技研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
 */
package com.gy.hsxt.uc.as.bean.device;

/**
 * PAD对象
 * 
 * @Package: com.gy.hsxt.uc.as.bean.device
 * @ClassName: AsPad
 * @Description: TODO
 * 
 * @author: lixuan
 * @date: 2015-10-19 下午6:23:06
 * @version V1.0
 */
public class AsPad extends AsDevice {

	private static final long serialVersionUID = -7950120247680573602L;

	/** 设备秘钥 */
	private String pmk;

	/**
	 * @return the 设备秘钥
	 */
	public String getPmk() {
		return pmk;
	}

	/**
	 * @param 设备秘钥
	 *            the pmk to set
	 */
	public void setPmk(String pmk) {
		this.pmk = pmk;
	}

}
