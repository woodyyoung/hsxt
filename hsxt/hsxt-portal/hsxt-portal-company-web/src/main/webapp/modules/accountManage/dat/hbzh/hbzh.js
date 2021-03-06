﻿define(function () {
	return {
		//货币账户余额查询
		findCurrencyBlance : function (data,callback) { 
			comm.requestFun("findCurrencyBlance" , data, callback,comm.lang("accountManage"));
		},
		
		//货币账户-货币转银行，初始化界面
		initCurrencyTransferBank : function(data, callback){
			comm.requestFun("initCurrencyTransferBank" , data, callback,comm.lang("accountManage"));
		},
		//货币账户-货币转银行，初始化界面
		getBankTransFee : function(data, callback){
			comm.requestFun("getBankTransFee" , data, callback,comm.lang("accountManage"));
		},
		//确认转出返回信息  互生币转现提交
		currencyTransferBank: function (data, callback) {
			comm.requestFun("currencyTransferBank" , data, callback,comm.lang("accountManage"));
		},
		//货币账户明细查询
		detailedPage:function(gridId,params,callback){
			return comm.getCommBsGrid(gridId, "hsbDetailedPage", params,callback);
		}
	};
});