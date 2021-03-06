define([ 'text!reporterTpl/tree/tree5/line.html' ,'echarts',
                'echarts/chart/tree',],function(lineTpl ,ec){
	return { 
		showPage : function(tabid){			
			$('#main-content > div[data-contentid="'+tabid+'"]').html(lineTpl) ;	 
			//Todo...
		 	 option = {
    title : {
        text: '树图',
        subtext: '反转'
    },
    toolbox: {
        show : true,
        feature : {
            mark : {show: true},
            dataView : {show: true, readOnly: false},
            restore : {show: true},
            saveAsImage : {show: true}
        }
    },
    calculable : false,

    series : [
        {
            name:'树图',
            type:'tree',
            orient: 'horizontal',  // vertical horizontal
            direction: 'inverse',
            rootLocation: {x: 'center',y: 250}, // 根节点位置  {x: 100, y: 'center'}
            nodePadding: 1,
            itemStyle: {
                normal: {
                    label: {
                        show: false,
                        formatter: "{b}"
                    },
                    lineStyle: {
                        color: '#48b',
                        shadowColor: '#000',
                        shadowBlur: 3,
                        shadowOffsetX: 3,
                        shadowOffsetY: 5,
                        type: 'curve' // 'curve'|'broken'|'solid'|'dotted'|'dashed'

                    }
                },
                emphasis: {
                    label: {
                        show: true
                    }
                }
            },
            
            data: [
                {
                    name: '根节点',
                    value: 6,
                    children: [
                        {
                            name: '节点1',
                            value: 4,
                            children: [
                                {
                                    name: '叶子节点1',
                                    value: 4
                                },
                                {
                                    name: '叶子节点2',
                                    value: 4
                                },
                                {
                                    name: '叶子节点3',
                                    value: 2
                                },
                                 {
                                    name: '叶子节点4',
                                    value: 2
                                },
                                {
                                    name: '叶子节点5',
                                    value: 2
                                },
                                {
                                    name: '叶子节点6',
                                    value: 4
                                }
                            ]
                        },
                        {
                            name: '节点2',
                            value: 4,
                            children: [{
                                name: '叶子节点7',
                                value: 4
                            },
                            {
                                name: '叶子节点8',
                                value: 4
                            }]
                        },
                        {
                            name: '节点3',
                            value: 1,
                            children: [
                                {
                                    name: '叶子节点9',
                                    value: 4
                                },
                                {
                                    name: '叶子节点10',
                                    value: 4
                                },
                                {
                                    name: '叶子节点11',
                                    value: 2
                                },
                                 {
                                    name: '叶子节点12',
                                    value: 2
                                }
                            ]
                        }
                    ]
                }
            ]
        }
    ]
};
                    
				                    
        
        
        
	         $('#tree5').css({width:'800px',height:'320px'});
	         var myChart = ec.init($('#tree5')[0]);
	         myChart.setOption(option) ;
		 		

			 
		 	 
		}
	}
}); 

 