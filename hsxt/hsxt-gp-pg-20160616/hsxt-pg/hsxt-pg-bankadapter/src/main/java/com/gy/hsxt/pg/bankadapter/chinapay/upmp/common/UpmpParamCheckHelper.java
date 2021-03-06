/***************************************************************************
 *
 * This document contains confidential and proprietary information 
 * subject to non-disclosure agreements with GUIYI Technology, Ltd. 
 * This information shall not be distributed or copied without written 
 * permission from GUIYI technology, Ltd.
 *
 ***************************************************************************/

package com.gy.hsxt.pg.bankadapter.chinapay.upmp.common;

import java.math.BigInteger;
import java.util.Date;

import com.gy.hsxt.pg.bankadapter.chinapay.upmp.params.UpmpPayTnParam;
import com.gy.hsxt.pg.bankadapter.chinapay.upmp.params.UpmpRefundParam;
import com.gy.hsxt.pg.bankadapter.common.constants.BanksConstants.ErrorCode;
import com.gy.hsxt.pg.bankadapter.common.exception.BankAdapterException;
import com.gy.hsxt.pg.bankadapter.common.utils.StringParamChecker;

/***************************************************************************
 * <PRE>
 *  Project Name    : bankadapter
 * 
 *  Package Name    : com.gy.hsxt.pg.bankadapter.chinapay.upmp.common
 * 
 *  File Name       : UpmpParamCheckHelper.java
 * 
 *  Creation Date   : 2014-12-1
 * 
 *  Author          : zhangysh
 * 
 *  Purpose         : 中国银联UPMP传递的参数值校验帮助类
 * 
 * 
 *  History         : none
 * 
 * </PRE>
 ***************************************************************************/
public class UpmpParamCheckHelper {
	/**
	 * 校验退款参数
	 * 
	 * @param param
	 * @return
	 */
	public static boolean checkPayTnParams(UpmpPayTnParam param) {
		StringParamChecker.check("orderNo", param.getOrderNo(), 16, 40);

		Date orderDate = param.getOrderDate();

		if (null == orderDate) {
			throw new BankAdapterException(ErrorCode.INVALID_PARAM,
					"订单日期orderDate格式必须是yyyyMMdd，且不能为空！");
		}

		BigInteger payAmount = param.getPayAmount();

		if ((null == payAmount) || (0 >= payAmount.longValue())) {
			throw new BankAdapterException(ErrorCode.INVALID_PARAM,
					"金额payAmount必须大于0！");
		}

		return true;
	}

	/**
	 * 校验退款参数
	 * 
	 * @param param
	 * @return
	 */
	public static boolean checkRefundParams(UpmpRefundParam param) {
		BigInteger refundAmount = param.getRefundAmount();

		if ((null == refundAmount) || (0 >= refundAmount.longValue())) {
			throw new BankAdapterException(ErrorCode.INVALID_PARAM,
					"退款金额refundAmount必须大于0！");
		}

		StringParamChecker.check("refundOrderNo", param.getRefundOrderNo(), 16,
				40);

		StringParamChecker.check("qn", param.getQn(), 16, 40);

		StringParamChecker.check("notifyUrl", param.getNotifyUrl(), 10, 80);

		return true;
	}

	/**
	 * 校验订单状态请求参数
	 * 
	 * @param orderNo
	 * @param orderDate
	 * @return
	 */
	public static boolean checkOrderStateParam(String orderNo, Date orderDate) {
		
		StringParamChecker.check("orderNo", orderNo, 16, 40);

		if (null == orderDate) {
			throw new BankAdapterException(ErrorCode.INVALID_PARAM,
					"订单日期orderDate不能为空！");
		}

		return true;
	}
}
