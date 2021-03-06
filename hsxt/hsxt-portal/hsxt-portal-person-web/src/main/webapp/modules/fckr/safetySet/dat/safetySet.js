﻿define(function () {
	return {
		//查询是否设置过交易密码及预留信息
		findSecuritySetType : function (callback) {
			comm.requestFun("no_findSecuritySetType",null,callback,comm.lang("safetySet"));
		},
		//设置预留信息
		setReserveInfo : function (jsonParam, callback) {
			comm.requestFun("no_setReserveInfo",jsonParam,callback,comm.lang("safetySet"));
		},
		//获取预留信息
		findReservationInfo: function (jsonParam, callback) {
			comm.requestFun("no_findReservationInfo",jsonParam,callback,comm.lang("safetySet"));
		},
		
		//获取所有密保问题
		getAllPwdQuestion : function (jsonParam, callback) {
			comm.requestFun("no_getAllPwdQuestion",jsonParam,callback,comm.lang("safetySet"));
		},

		//设置密保问题
		setPwdQuestion : function (jsonParam, callback) {
			comm.requestFun("no_setPwdQuestion",jsonParam,callback,comm.lang("safetySet"));
		},
		
		//设置交易密码
		setTradePwd : function (jsonParam, callback) {
			comm.requestFun("no_setTradePwd",jsonParam,callback,comm.lang("safetySet"));
		},
		
		//修改交易密码
		modfiyDealPwd : function (jsonParam, callback) {
			comm.requestFun("no_modfiyDealPwd",jsonParam,callback,comm.lang("safetySet"));
		},
		
		//修改登录密码
		modfiyLoginPwd : function (data, callback) {
			comm.requestFun("no_modfiyLoginPwd",data,callback,comm.lang("safetySet"));
		},
		
		//发送短信验证码
		mobileSendCode: function (jsonParam, callback) {
			comm.requestFun("no_mobileSendCode" , jsonParam, callback,comm.lang("myHsCard"));
		},
		//重置交易密码身份验证
		checkNoCarderMainInfo: function (jsonParam, callback) {
			comm.requestFun("checkNoCarderMainInfo" , jsonParam, callback,comm.lang("myHsCard"));
		},
		
		//发送短信验证码
		delPwdSendMobileCode: function (jsonParam, callback) {
			comm.requestFun("delPwdSendMobileCode" , jsonParam, callback,comm.lang("myHsCard"));
		},
		//查询交易密码长度
		initTradePwd : function (jsonParam, callback) {
			comm.requestFun("initTradePwd",jsonParam,callback,comm.lang("safeSet"));
		},
		//获取绑定的手机号码
		findMobileByCustId : function (jsonParam, callback) {
			comm.requestFun("no_findMobileByCustId" , jsonParam, callback,comm.lang("myHsCard"));
		},
		
		//重置交易密码
		resetTradePwd : function(data, callback){
			comm.requestFun("no_resetTradePwd",data,callback,comm.lang("safetySet"));
		},
		
		//修改绑定手机号码
		editBindMobile : function (jsonParam, callback) {
			comm.requestFun("no_editBindMobile" , jsonParam, callback,comm.lang("myHsCard"));
		},
		
		//添加绑定手机号
		addBindMobile : function (jsonParam, callback) {
			comm.requestFun("addBindMobile" , jsonParam, callback,comm.lang("myHsCard"));
		},
		
		//添加绑定手机号
		findEamilByCustId : function (jsonParam, callback) {
			comm.requestFun("findEamilByCustId" , jsonParam, callback,comm.lang("myHsCard"));
		},
		
		
		//获取验证码验证地址
		getcheckCodePath : function(){
			return comm.domainList.local + "checkCode"
		},
		
		//用户信息验证 及 是否实名认证
		checkUserinfo : function(data, callback){
			comm.requestFun("checkUserinfo",data,callback,comm.lang("safetySet"));
		},
	
		//存在交易密码
		existTradePwd : function(data, callback){
			comm.requestFun("existTradePwd",data,callback,comm.lang("safetySet"));
		},
		//获得预留信息
		getReserveInfo : function(data, callback){
			comm.requestFun("getReserveInfo",data,callback,comm.lang("safetySet"));
		},
		
		
		//提交重置交易密码申请验证
		getCheckDealPwdCondition : function (data, callback) {
			//comm.requestPost('', data, callback)
			callback({"code":0,"msg":""});
		},
		
		//重置交易密码，返回状态信息
		getResetDealPwd : function (data, callback) {
			callback({"code":0,"msg":""});
		},
		//验证码生成URL地址
		getCodeUrl:function(){
			var param=comm.getRequestParams();
			return comm.domainList['personWeb']+comm.UrlList["generateSecuritCode"]+"?custId="+param.custId+"&type=tradePwd&"+(new Date()).valueOf();
		}
		
	};
});