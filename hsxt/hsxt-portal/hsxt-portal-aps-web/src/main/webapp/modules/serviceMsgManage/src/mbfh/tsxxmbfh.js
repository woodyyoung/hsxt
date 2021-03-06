define(['text!serviceMsgManageTpl/mbfh/tsxxmbfh/tsxxmbfh.html',
		'text!serviceMsgManageTpl/mbfh/tsxxmbfh/tsxxmbfh_ck.html',
		'text!serviceMsgManageTpl/mbfh/tsxxmbfh/tsxxmbfh_fh.html',
		'serviceMsgManageDat/serviceMsgManage',
        'commDat/common',
        'serviceMsgManageLan'
		], function(tsxxmbfhTpl, tsxxmbfh_ckTpl, tsxxmbfh_fhTpl, dataModoule,common){
	var tsxxmbfhFun = {
		tsxxmbfhBsGrid:null,	
		tsxxmbfh_self : null,
		showPage : function(){
			tsxxmbfh_self = this;
			tsxxmbfh_self.initForm();
		},
		/**
		 * 初始化界面
		 */
		initForm : function(){
			$('#busibox').html(tsxxmbfhTpl);
			/** 查询事件 */
			$("#queryBtn").click(function(){
				tsxxmbfh_self.initData();
			});
			comm.initSelect('#search_useCustType', comm.lang("serviceMsgManage").tsCustTypes, null, null, {name:'全部', value:''});
			tsxxmbfh_self.initData();
		},
		/**
		 * 初始化数据
		 */
		initData : function(){
			var params = {};
			params.search_tplType = 2;
			params.search_tplName = $("#search_tplName").val();
			params.search_useCustType = $("#search_useCustType").attr('optionValue');
			tsxxmbfhFun.tsxxmbfhBsGrid = dataModoule.findMessageTplApprList(params, tsxxmbfhFun.detail_1, tsxxmbfhFun.detail_2,tsxxmbfhFun.workOrderHangers,tsxxmbfhFun.workOrderRefuse);
		},
		/**
		 * 查看
		 */
		detail_1 : function(record, rowIndex, colIndex, options){
			if(colIndex == 1){
				return comm.getNameByEnumId(record['custType'], comm.lang("serviceMsgManage").tsCustTypes);
			}
			if(colIndex == 2){
				return comm.getNameByEnumId(record['buyResType'], comm.lang("serviceMsgManage").toBuyResRangeEnum);
			}
			if(colIndex == 3){
				return comm.getNameByEnumId(record['bizType'], comm.lang("serviceMsgManage").busTypes);
			}
			if(colIndex == 4){
				return comm.getNameByEnumId(record['status'], comm.lang("serviceMsgManage").tplAllStatus);
			}
			if(colIndex == 6){
				return $('<a id="'+ record.tempId +'" >查看</a>').click(function(e) {
					tsxxmbfh_self.chaKan(record);
				}.bind(this));
			}
		},
		/**
		 * 复核
		 */
		detail_2 : function(record, rowIndex, colIndex, options){
			/*if(colIndex < 5){
				return null;
			}*/
			if((record.status == 1 || record.status == 4 || record.status == 5) && colIndex == 6){//待复核
				return $('<a id="'+ record.tempId +'" >复核</a>').click(function(e) {
					tsxxmbfh_self.fuHe(record.tempId, record.applyId);
				}.bind(this));
			}
		},
		/**
		 * 工单挂起
		 */
		workOrderHangers: function(record, rowIndex, colIndex, options){
			if(colIndex == 7){
				/*return comm.workflow_operate('挂起', '推送消息模板复核业务', function(){
					common.workTaskHangUp({"bizNo":record.tempId},function(rsp){
						comm.alert({imgClass: 'tips_yes' ,content:comm.lang("serviceMsgManage")[22000],callOk:function(){
							tsxxmbfhFun.tsxxmbfhBsGrid.refreshPage();
						}});
					});
				});*/
				return comm.workflow_operate('挂起', '推送消息模板复核业务', function(){
					 require(["workoptSrc/gdgq"],function(gdgq){
							gdgq.guaQi(record.tempId,tsxxmbfhFun.tsxxmbfhBsGrid);
						});
				 });
			}
		},
		/**
		 * 工单拒绝受理
		 */
		workOrderRefuse: function(record, rowIndex, colIndex, options){
			if(colIndex == 7){
				return comm.workflow_operate('拒绝受理', '推送消息模板复核业务', function(){
					common.workTaskRefuseAccept({"bizNo":record.tempId},function(rsp){
						comm.alert({imgClass: 'tips_yes' ,content:comm.lang("serviceMsgManage")[22000],callOk:function(){
							tsxxmbfhFun.tsxxmbfhBsGrid.refreshPage();
						}});
					});
				});
			}
		},
		/**
		 * 查看动作
		 */
		chaKan : function(record){
			$('#ck_dialog').html(tsxxmbfh_ckTpl);
			$("#ck_dialog").dialog({
				title:"查看模版",
				width:"900",
				modal:true,
				closeIcon : true,
				buttons:{ 
					"关闭":function(){
						$( this ).dialog( "destroy" );
					}
				}
			});
			$('#view_tempName').html(record.tempName);
			$('#view_bizType').html(comm.getNameByEnumId(record.bizType, comm.lang("serviceMsgManage").busTypes));
			$('#view_custType').html(comm.getNameByEnumId(record.custType, comm.lang("serviceMsgManage").tsCustTypes));
			$('#view_buyResType').html(comm.getNameByEnumId(record.buyResType, comm.lang("serviceMsgManage").toBuyResRangeEnum));
			$('#view_tempContent').html(record.tempContent);
			dataModoule.findMsgTplApprHisList({search_tempId:record.tempId}, function(record_, rowIndex_, colIndex_, options_){
				if(colIndex_ == 1){
					return comm.getNameByEnumId(record_['reqStatus'], comm.lang("serviceMsgManage").reqStatus);
				}
				if(colIndex_ == 4){
					return comm.getNameByEnumId(record_['reviewResult'], comm.lang("serviceMsgManage").reviewResults);
				}
				return $('<a id="'+ record_.applyId +'" >查看</a>').click(function(e) {
					comm.alert({title:"备注",content : record_.apprRemark});
				}.bind(this));
			});
		},
		/**
		 * 复核动作
		 */
		fuHe : function(tempId, applyId){
			$('#fh_dialog').html(tsxxmbfh_fhTpl);
			/*弹出框*/
			$("#fh_dialog").dialog({
				title:"复核信息",
				width:"400",
				modal:true,
				closeIcon : true,
				buttons:{ 
					"确定":function(){
						if(!tsxxmbfh_self.validateData().form()){
							return;
						}
						var params = {};
						params.tempId = tempId;
						params.applyId = applyId;
						params.reviewRes = $('input[name="reviewRes"]:checked').val();
						params.apprRemark = $("#apprRemark").val();
						dataModoule.reviewTemplate(params, function(){
							comm.alert({content:comm.lang("serviceMsgManage")[22000], callOk:function(){
								$("#fh_dialog").dialog("destroy");
								tsxxmbfh_self.initData();
							}});
						});
					},
					"取消":function(){
						$(this).dialog("destroy");
					}
				}
			});
		},
		/**
		 * 数据校验
		 */
		validateData : function(){
			return $("#review_form").validate({
				rules : {
					reviewRes : {
						required : true
					},
					apprRemark : {
						rangelength:[1, 300]
					}
				},
				messages : {
					reviewRes : {
						required : comm.lang("serviceMsgManage")[36610]
					},
					apprRemark : {
						rangelength : comm.lang("serviceMsgManage")[36611]
					}
				},
				errorPlacement : function (error, element) {
					$(element).attr("title", $(error).text()).tooltip({
						tooltipClass: "ui-tooltip-error",
						destroyFlag : true,
						destroyTime : 3000,
						position : {
							my : "left+2 top+30",
							at : "left top"
						}
					}).tooltip("open");
					$(".ui-tooltip").css("max-width", "230px");
				},
				success : function (element) {
					$(element).tooltip();
					$(element).tooltip("destroy");
				}
			});
		}
	}	
	
	return tsxxmbfhFun;
});