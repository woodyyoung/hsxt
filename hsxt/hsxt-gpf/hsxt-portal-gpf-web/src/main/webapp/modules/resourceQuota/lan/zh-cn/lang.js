define(["commSrc/comm"],function(){
	comm.langConfig['quota'] ={
			errorCodes : {
				46005: "该管理公司配额超过999，请减少申请配额",
				46010: "同步资源配额分配数据到地区平台失败",
				46014: "同步数据失败",
				46030: "保存配额申请失败",
				46031: "审批配额申请失败",
				46032: "互生号被占用或已使用",
				46033: "批复配额数已大于可分配的配额数"
			},
			status : {
				0 : "待复核",
			    1 : "审批通过",
			    2 : "审批驳回"
			}
	}
});
