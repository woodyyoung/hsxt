/***************************************************************************
 *
 * This document contains confidential and proprietary information 
 * subject to non-disclosure agreements with GUIYI Technology, Ltd. 
 * This information shall not be distributed or copied without written 
 * permission from GUIYI technology, Ltd.
 *
 ***************************************************************************/

package com.gy.hsxt.point.client.bean;

import com.alibaba.fastjson.JSON;

/**
 * 国家
 * 
 * @Package: com.gy.hsxt.lcs.bean  
 * @ClassName: Country 
 * @Description: TODO
 *
 * @author: yangjianguo 
 * @date: 2015-12-15 下午12:25:31 
 * @version V3.0
 */
public class Country implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    /** 国家代码 **/
    private String countryNo;

    /** 国家英文代码 **/
    private String countryCode;

    /** 国家中文名 **/
    private String countryNameCn;

    /** 国家名称 **/
    private String countryName;

    /** 电话区号 **/
    private String phonePrefix;

    /** 邮政编号 **/
    private String postCode;

    /** 删除标识 **/
    private long delFlag;

    /** 版本号 **/
    private long version;

    public String getCountryNo() {
        return countryNo;
    }

    public void setCountryNo(String countryNo) {
        this.countryNo = countryNo;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryNameCn() {
        return countryNameCn;
    }

    public void setCountryNameCn(String countryNameCn) {
        this.countryNameCn = countryNameCn;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getPhonePrefix() {
        return phonePrefix;
    }

    public void setPhonePrefix(String phonePrefix) {
        this.phonePrefix = phonePrefix;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public long getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(long delFlag) {
        this.delFlag = delFlag;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
