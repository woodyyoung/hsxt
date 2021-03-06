package com.gy.hsxt.access.web.aps.services.codeclaration;

import java.util.List;
import java.util.Map;

import com.gy.hsxt.bs.bean.apply.*;
import org.springframework.stereotype.Service;

import com.gy.hsxt.access.web.common.service.IBaseService;
import com.gy.hsxt.common.bean.Page;
import com.gy.hsxt.common.bean.PageData;
import com.gy.hsxt.common.exception.HsException;

/**
 * 
 * @projectName   : hsxt-access-web-aps
 * @package       : com.gy.hsxt.access.web.aps.services.codeclaration
 * @className     : IEntFilingService.java
 * @description   : 企业报备接口
 * @author        : maocy
 * @createDate    : 2015-12-15
 * @updateUser    : 
 * @updateDate    : 
 * @updateRemark  : 
 * @version       : v0.0.1
 */
@Service
public interface IEntFilingService extends IBaseService {
    
    /**
     * 
     * 方法名称：报备信息查询
     * 方法描述：报备信息查询
     * @param filterMap 查询参数
     * @param sortMap 排序参数
     * @param page 分页参数
     * @return
     * @throws HsException
     */
    public PageData<FilingAppInfo> findScrollResult(Map filterMap, Map sortMap, Page page) throws HsException;
	
    /**
     * 
     * 方法名称：异议报备审核查询
     * 方法描述：异议报备审核查询
     * @param filterMap 查询参数
     * @param sortMap 排序参数
     * @param page 分页参数
     * @return
     * @throws HsException
     */
	public PageData<FilingAppInfo> platQueryDisagreedFiling(Map filterMap, Map sortMap, Page page) throws HsException;
	
    /**
     * 
     * 方法名称：企业报备审核查询
     * 方法描述：企业报备审核查询
     * @param filterMap 查询参数
     * @param sortMap 排序参数
     * @param page 分页参数
     * @return
     * @throws HsException
     */
	public PageData<FilingAppInfo> platQueryApprFiling(Map filterMap, Map sortMap, Page page) throws HsException;

	/**
	 * 
	 * 方法名称：查看异议报备详情
	 * 方法描述：依据申请编号查询异议报备详情
	 * @param applyId 申请编号
	 * @return
	 * @throws HsException
	 */
	public Map<String, Object> findFilingById(String applyId) throws HsException;
	
	/**
	 * 
	 * 方法名称：审批企业报备
	 * 方法描述：地区平台审批企业报备
	 * @param apprParam 审批信息
	 * @throws HsException
	 */
	public void apprCommFiling(FilingApprParam apprParam) throws HsException;
	
	/**
	 * 
	 * 方法名称：审批企业异议报备
	 * 方法描述：地区平台审批企业异议报备
	 * @param apprParam 审批信息
	 * @throws HsException
	 */
	public void apprDisaFiling(FilingApprParam apprParam) throws HsException;
	
	/**
	 * 
	 * 方法名称：修改报备企业信息
	 * 方法描述：修改报备企业信息
	 * @param filing 报备企业信息
	 * @return 报备申请编号 
	 * @throws HsException
	 */
	public void updateEntFiling(FilingApp filing) throws HsException;
	
	/**
     * 
     * 方法名称：保存附件信息
     * 方法描述：保存附件信息
     * @param filingAptitudes 附件信息列表
     * @throws HsException
     */
    public List<FilingAptitude> saveAptitude(List<FilingAptitude> filingAptitudes) throws HsException;
    
    /**
     * 
     * 方法名称：查询附件信息
     * 方法描述：根据申请编号查询附件信息
     * @param applyId 报备企业申请编号
     * @return filingAptitudes 附件信息列表
     * @throws HsException
     */
    public List<FilingAptitude> queryAptByApplyId(String applyId) throws HsException;
    
    /**
     * 
     * 方法名称：查询企业基本信息
     * 方法描述：根据申请编号查询企业基本信息
     * @param applyId 报备企业申请编号
     * @throws HsException
     */
    public FilingApp queryFilingBaseInfoById(String applyId) throws HsException;

	/**
	 * 查询企业相同项
	 *
	 * @param applyId 报备编号
	 * @return 相同项对象
	 * @throws HsException
	 */
	FilingSameItem findSameItem(String applyId) throws HsException;
}
