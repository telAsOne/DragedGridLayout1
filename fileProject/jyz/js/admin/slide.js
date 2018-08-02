$(function(){
	
	$('#slide').datagrid({
		url:"allImg",
		border:false,
		rownumbers:true,
		fitColumns:true,
		striped:true,
		toolbar:"#toolbar",
		pagination:true,
		pageSize: 10,  
		pageList: [10,20,50,100,200], 
		loadFilter: pagerFilter,
		view: detailview,
		columns:[[
		          {field:'slideId', title:'图片ID', checkbox:true},
		          {field:'linkaddress', title:'链接地址',align:'center', width:120,formatter:aLink},
				 
				  {field:'isshow', title:'是否显示在首页',  align:'center', width:120,formatter:isShow},
				  {field:'isenabled', title:'是否启用',  align:'center', width:120,formatter:isEnabled},
				  {field:'startTime', title:'创建时间',  align:'center', width:120},
				  {field:'endTime', title:'最后修改时间',  align:'center', width:120}
		          ]],
			detailFormatter:function(index,row){
		return '<div style="padding:2px"><table class="ddv"></table></div>';
	},
	onExpandRow: function(index,row){
		var ddv = $(this).datagrid('getRowDetail',index).find('table.ddv');
		
		ddv.datagrid({
			url:'oneImg/'+row.slideId,
			fitColumns:true,
			rownumbers:true,
			loadMsg:'',
			nowrap:false,
			rowStyler: function(index,row){
		return 'font-size:13px';
		},
		height:'auto',
			columns:[[
				{field:'slideTitle',title:'图片标题',align:'center',formatter:textFormatter},
				 {field:'imageurl', title:'图片主体',  align:'center',formatter:imgFormatter},
				{field:'slideContent',title:'图片内容',align:'center',formatter:textFormatter}
				]],	
			onResize:function(){
				
			$('#slide').datagrid('fixDetailRowHeight',index);
		},
		onLoadSuccess:function(){
			setTimeout(function(){
				$('#slide').datagrid('fixDetailRowHeight',index);
			},0)
		}
		});
		$('#slide').datagrid('fixDetailRowHeight',index);
	}
	});
	
	function aLink(value,row,index){
		if('' != value && null != value)
			value = '<a href="'+value+'">'+value+'</a>';
		return  value;
		return  value;
	};
	//是否启用
	function isEnabled(value,row,index){
		if(value==0){
			value = "启用";
		}else{
			value = "不启用";
		}	
		return  value;
	};
	//是否显示
	function isShow(value,row,index){
		if(value==0){
			value = "显示";
		}else{
			value = "不显示";
		}	
		return  value;
	}
//添加图片
	function imgFormatter(value,row,index){
		if('' != value && null != value)
			value = '<div style="width:500px;height:200px; "><img src="'+value+'"></div>';
		return  value;
	}	
	//添加图片详情
	function textFormatter(value,row,index){
		if('' != value && null != value)
			
			value = '<div style="width:200px;height:200px;word-break: break-all;word-wrap: break-word; ">'+value+'</div>';
		return  value;
	}
	//分页功能      
	function pagerFilter(data) {  
		if (typeof data.length == 'number' && typeof data.splice == 'function') {  
			data = {  
				total: data.length,  
				rows: data  
			}  
		}  
		var dg = $(this);  
		var opts = dg.datagrid('options');  
		var pager = dg.datagrid('getPager');  
		pager.pagination({  
			onSelectPage: function (pageNum, pageSize) {  
			opts.pageNumber = pageNum;  
			opts.pageSize = pageSize;  
			pager.pagination('refresh', {  
				pageNumber: pageNum,  
				pageSize: pageSize  
			});  
			dg.datagrid('loadData', data);  
		}  
		});  
		if (!data.originalRows) {  
			if(data.rows)  
				data.originalRows = (data.rows);  
			else if(data.data && data.data.rows)  
				data.originalRows = (data.data.rows);  
			else  
				data.originalRows = [];  
		}  
		var start = (opts.pageNumber - 1) * parseInt(opts.pageSize);  
		var end = start + parseInt(opts.pageSize);  
		data.rows = (data.originalRows.slice(start, end));  
		return data;  
	};
	//判断新增还是修改
	var isType;
//修改图片
	$('#form_edit').dialog({    
		title: '修改图片信息',
		iconCls:'icon-large-picture',
		width: 720,  
		cache: false,  
		top:75,
		draggable:false,
		closed:true,
		closable:false,
		modal: true,
		buttons:[
			{
				text:'提交',
				iconCls:'icon-mini-add',
				handler:function(){
					var file = $('.user_pic img').attr('src');
					var url = "";
					var texts = "";
					if(isType == true){
						url='updateImg';
						texts='修改';
					}else{
						url='insertSlideImg';
						texts='新增';
					}	
					if(file.length>100){
						encodeURIComponent(file);
					};
					$.messager.progress({
						text:'请求处理中...'
					});
					$('#form_edit').form('submit',{
						url:''+url,
						onSubmit: function(param){    
							param.file = file;       
						},
						success:function(data){
						$.messager.progress('close');
						if(data>0){
							$.messager.show({
								title:'提示',
								msg:texts+'话题成功'
							});
							$('#form_edit').dialog('close').form('clear');
							$("#slide").datagrid('reload');
							
							
						}else{
							$.messager.alert("警告",texts+'失败，请联系系统管理员！','warning');

						}
						//将图片清空
						$('.user_pic img').attr('src','');
					}
				});
			}
			},
			{
				text:'取消',
				iconCls:'icon-mini-refresh',
				handler:function(){
				$('#form_edit').dialog('close').form('clear');
				//将图片清空
				$('.user_pic img').attr('src','');
			}

			}
			]
	});
	//多行文本框
	$('.huanhang').textbox({
		multiline:true
	});
		
	tool = {
		query:function(){
		$("#repertory").datagrid("load", {  
			c_name: $('#auths').combobox("getText"),
			p_Name: $("#p_name").val()
		});
	},
	add:function(){
		isType = false;
		$('#form_edit').dialog({
			title:'新增话题'
		})
		$('#form_edit').dialog('open');
	},
	del:function(){
		var rows = $('#slide').datagrid('getSelections');
		if(rows.length == 0 ){
			$.messager.alert("警告",'尚未选择任何记录！','warning');
		}else{
			$.messager.confirm('删除确认','您确认想要删除选中记录吗？',function(r){    
				if (r){  
					var ids = [];
					for(var i=0; i<rows.length; i++){
						ids.push(rows[i].slideId);
					}
					$.ajax({
						url:'deleteImg',
						type:'post',
						data:{
						id:ids.join(',')
					},
					beforeSend:function(){
						$.messager.progress({
							text:'请求处理中...'
						});
					},
					success:function(data,response,status){
						$.messager.progress('close');
						if(data==0){
							$.messager.show({
								title:'提示',
								msg:'删除成功'
							});
						}else{
								
							$.messager.alert("提示",data,'info');
						}
						$('#slide').datagrid('reload');
					}
					});
				}    
			});
		}
	},
	edit:function(){
		var row = $('#slide').datagrid('getSelections');
		if(row.length > 1){
			$.messager.alert("警告",'只能选一条记录！','warning');
		}else if(row.length == 0 ){
			$.messager.alert("警告",'尚未选择任何记录！','warning');
		}if(row.length == 1){
			$.ajax({
				url:'oneImg/'+row[0].slideId,
				type:'GET',
				dataType:'json',
			beforeSend:function(){
				
				$.messager.progress({
					text:'请求处理中...'
				});
				
			},
			success:function(data,response,status){
				$.messager.progress('close');
			
				if(data){
					isType = true;
					$('#form_edit').dialog({
						title:'修改话题'
					})
					$('#form_edit').form('load',{
						slideId:data[0].slideId,
						slideContent:data[0].slideContent,
						slideTitle:data[0].slideTitle,
						linkaddress:data[0].linkaddress
						
					}).dialog('open');
					$("img[name='imageurl']").attr('src',data[0].imageurl+'?'+Math.random());
					if(data[0].isshow == 0){
						$("input[name='isshow']").get(0).checked=true;
					}else{
						$("input[name='isshow']").get(1).checked=true;
					}	
					
					if(data[0].isenabled == 0){
						$("input[name='isenabled']").get(0).checked=true;
					}else{
						$("input[name='isenabled']").get(1).checked=true;
					}	
					 
				}
			}
			});
		}
	}
	};	
	
});