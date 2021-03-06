/*
 * Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
 *
 * 注意：本内容仅限于深圳市归一科技研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
 */
package com.gy.hsxt.access.web.aps.controllers.accountCompany;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gy.hsxt.access.web.aps.services.accountCompany.IBalanceService;
import com.gy.hsxt.access.web.aps.services.accountCompany.IIntegralAccountService;
import com.gy.hsxt.access.web.common.bean.HttpRespEnvelope;
import com.gy.hsxt.access.web.common.controller.BaseController;
import com.gy.hsxt.access.web.common.service.IBaseService;
import com.gy.hsxt.common.exception.HsException;
import com.gy.hsxt.ps.bean.AllocDetailSum;

/***************************************************************************
 * <PRE>
 * Description 		: 企业账户查询Controller
 * 
 * Project Name   	: hsxt-access-web-aps 
 * 
 * Package Name     : com.gy.hsxt.access.web.aps.controllers.accountCompany
 * 
 * File Name        : IntegralAccountController 
 * 
 * Author           : weixz
 * 
 * Create Date      : 2016-2-18 上午11:43:16
 * 
 * Update User      : weixz
 * 
 * Update Date      : 2016-2-18 上午11:43:16
 * 
 * UpdateRemark 	: 说明本次修改内容
 * 
 * Version          : v1.0
 * 
 * </PRE>
 ***************************************************************************/
@Controller
@RequestMapping("integralAccount")
public class IntegralAccountController extends BaseController {
	@Resource
	private IIntegralAccountService integralAccountService; // 用户积分服务类

	@Resource
	private IBalanceService balanceService; // 账户余额查询服务类

	
	/**
	 * 分页查询积分明细
	 * 
	 * @Description:
	 * @author: weixz
	 * @created: 2016年2月18日 上午11:45:03
	 * @param request
	 * @param response
	 * @return
	 * @return : HttpRespEnvelope
	 * @version V3.0.0
	 */
	@ResponseBody
	@RequestMapping(value = { "/detailed_page" }, method = { RequestMethod.GET, RequestMethod.POST }, produces = "application/json;charset=UTF-8")
	public HttpRespEnvelope searchAccEntryPage(HttpServletRequest request, HttpServletResponse response)
	{
		HttpRespEnvelope hre = null;

		try
		{
			// Token验证
			super.verifySecureToken(request);

			// 分页查询
			request.setAttribute("serviceName", balanceService);
			request.setAttribute("methodName", "searchEntAccountEntry");
			hre = super.doList(request, response);

		} catch (HsException e)
		{
			hre = new HttpRespEnvelope(e);
		}

		return hre;
	}
	
	/**
	 * 获取积分账户操作详情
	 * 
	 * @Description:
	 * @author: likui
	 * @created: 2016年1月26日 下午7:40:12
	 * @param request
	 * @param response
	 * @return
	 * @return : HttpRespEnvelope
	 * @version V3.0.0
	 */
	@ResponseBody
	@RequestMapping(value = { "/get_acc_opt_detailed" }, method = { RequestMethod.GET, RequestMethod.POST }, produces = "application/json;charset=UTF-8")
	public HttpRespEnvelope getAccOptDetailed(HttpServletRequest request, HttpServletResponse response)
	{
		HttpRespEnvelope hre = null;

		try
		{
			// Token验证
			super.verifySecureToken(request);
			String transNo = request.getParameter("transNo");
			String transType = request.getParameter("transType");
			Map<String,String> map =new HashMap<String,String>();
			map.put("transNo", transNo);
			map.put("transType", transType);
			hre = new HttpRespEnvelope(balanceService.queryAccOptDetailed(map));
		} catch (HsException e)
		{
			hre = new HttpRespEnvelope(e);
		}
		return hre;
	}
	/**
	 * 消费积分分配明细查询
	 * 
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = { "/get_point_allot_detailed" }, method = { RequestMethod.GET, RequestMethod.POST }, produces = "application/json;charset=UTF-8")
	public HttpRespEnvelope pointDetail(String companyResNo, String batchNo, HttpServletRequest request)
	{
		HttpRespEnvelope hre = null;

		try
		{
			// Token验证
			super.verifySecureToken(request);
			AllocDetailSum pdr = balanceService.queryPointAllotDetailed(batchNo, companyResNo);
			hre = new HttpRespEnvelope(pdr);
		} catch (HsException e)
		{
			hre = new HttpRespEnvelope(e);
		}

		return hre;
	}

	/**
	 * 消费积分分配明细查询
	 * 
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = { "/get_point_allot_detailed_list" }, method = { RequestMethod.GET, RequestMethod.POST }, produces = "application/json;charset=UTF-8")
	public HttpRespEnvelope queryPointAllotDetailedList(HttpServletRequest request, HttpServletResponse response)
	{
		HttpRespEnvelope hre = null;

		try
		{
			// Token验证
			super.verifySecureToken(request);

			// 设置服务名和方法名，调用父类查询分页方法
			request.setAttribute("serviceName", balanceService);
			request.setAttribute("methodName", "queryPointAllotDetailedList");
			return super.doList(request, response);

		} catch (HsException e)
		{
			hre = new HttpRespEnvelope(e);
			return hre;
		}

	}
	 /**
     * 投资分红流水查询
     * 
     * @Description:
     * @author: weixz
     * @created: 2016年2月18日 上午11:45:03
     * @param request
     * @param response
     * @return
     * @return : HttpRespEnvelope
     * @version V3.0.0
     */
    @ResponseBody
    @RequestMapping(value = { "/tzfh_detailed_page" }, method = { RequestMethod.GET, RequestMethod.POST }, produces = "application/json;charset=UTF-8")
    public HttpRespEnvelope searchTzfhAccEntryPage(HttpServletRequest request, HttpServletResponse response)
    {
        HttpRespEnvelope hre = null;

        try
        {
            // Token验证
            super.verifySecureToken(request);
            // 分页查询
            request.setAttribute("serviceName", balanceService);
            request.setAttribute("methodName", "searchCarAccountEntryDividend");
            hre = super.doList(request, response);

        } catch (HsException e)
        {
            hre = new HttpRespEnvelope(e);
        }

        return hre;
    }
    
	/**
	 * @return
	 * @see com.gy.hsxt.access.web.common.controller.BaseController#getEntityService()
	 */
	@Override
	protected IBaseService getEntityService()
	{
		return integralAccountService;
	}
}
