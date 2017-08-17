﻿define([ "commSrc/comm" ], function() {
	comm.langConfig['zypeManage'] = {
		// 共用
		22000 : "操作成功",
		22001 : "操作失败",
		22003 : "参数错误",
		22004 : "token令牌无效",
		0 : "处理成功",
		requestError : '请求出错，请重试！',
		begin_Date : '请输入开始日期',
		end_Date : '请输入结束日期',
		digits : '请输入整数',
		maxlength : '最多输入{0}个字',
		kjrq : '请选择快捷日期',
		ywlb : '请选择业务类别',

		quotaTypeEnume : {
			1 : "首次配置",
			2 : "增加配额",
			3 : "减少配额"
		},
		quotaStatusEnume : {
			0 : "待审批",
			1 : "审批通过",
			2 : "审批驳回"
		},
		appReasonEnum:{
			'4':'配额售罄',
			'3':'配额不足',
			'2':'人口增加',
			'1':'人口减少',
			'0':'其他'
		},
		add_remark:"添加备注",
		quota_detail:"配额详情",
		input_appr_num:"请正确输入批复数量！",
		appr_num_error_point:"输入批复数量,不可大于申请数！",
		approve_title:"审批",
		city_res_quota_detail:"三级资源配置详情",
		city_res_quota_config_detail:"三级区域配额配置详情",
		city_res_quota_approve:"三级资源配置审批",
		province_res_quota_detail:"二级资源配置详情",
		province_res_quota_config_detail:"二级区域配额配置详情",
		province_res_quota_approve:"二级资源配置审批",
		approve_success_point:"审批成功",
		quota_confirm_title:"确定",
		city_res_status_detail:"城市资源状态详情",
		quota_query_title:"查看",
		quota_app_title : "配额申请",
		submit_app_title : "提交申请",
		quota_app_success : "配额申请成功",
		cancel_title : "取消",
		quota_num_prompt : "请正确输入配额数！",
		quota_num_error_prompt : "本次申请调整配额数不能超过可申请配额数！",
		add_apply_record:"请添加一条申请配额记录",
		apply_sub_success:"申请提交成功",
		apply_success:"申请成功",
		input_apply_quota_num:"请正确输入申请配额数",
		select_apply_pro:"请选择申请配额二级区域",
		select_cfg_type:"请选择配置类型",
		entName:"管理公司名称",
		not_add_entMange_pro:"不能同时添加多家管理公司二级区域申请",
		exist_pro_apply_record:"该二级区域已存在申请记录，不能重复添加",
		no_exist_ans:"不能存在多条配额申请记录",
		12007 : "参数错误,未查询配额申请待审批数据",
		12013 : "保存平台资源配额申请单失败",
		12014 : "审批平台资源配额分配申请失败",
		12017 : "参数错误,实际分配的资源号数量与批复的数据不一致",
		12025 : "任务状态不是办理中",
		12501:"可分配的资源配额数量不足 ",
		12502:"可释放的空闲资源配额数量不足",
		12503 : "不是首次配置",
		12504:"审批数量大于申请数量",
		12505:"省配额申请有待审批的数据",
		12506: "地区平台配额审批失败",
		12507: "地区平台配额申请失败",
		12508:"地区平台配额申请调用总平台失败",
		12509 : "二级区域配配额申请失败",
		12510 : "可减少资源配额不足或批复数量大于申请数量",
		12511: "城市配额申请失败",
		12512: "城市配额审批失败",
		12513: "省配额审批状态错误",
		12514: "城市配额审批状态错误",
		12515: "城市配额申请有待审批的数据",
		34014 : "无申请配额数据",
		34015 : "省代码不能为空",
		34016 : "申请类型不能为空",
		34017 : "申请数量不能为空",
		34018 : "业务申请编号不能为空",
		34019 : "批复数量不能为空",
		34020 : "审核状态不能为空",
		34021 : "企业名称不能为空",
		34022 : "申请数量必须大于0",
		34023 : "城市代码不能为空",
		23801 : "数据没找到",
		34028 : "城市人口数不能为空",
		12000 : "一级区域配额申请类型为",
		12001 : "申请配额数量不能大于可申请配额数",
		12002 : "申请配额数量不能大于已分配配额数"
	}
});