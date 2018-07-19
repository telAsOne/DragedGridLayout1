$(function(){
	$.ajax({ 
		url: '/BiliBili3/roles?roleName=null', 
		type:'json',
		success: function(data){
			$("#cc").attr("value",data[0].text);
		}
	});
	
	$('#users').datagrid({
		url:"/BiliBili3/users?adminName=null",
		fit:true,
		border:false,
		striped:true,
		rownumbers:true,
		pagination:true,
		toolbar:'#toolbar_user',
		columns:[[
		          {field:'adminId', title:'职员ID', checkbox:true},
		          {field:'adminName', title:'职员名称',  align:'center', width:120},
		          {field:'adminState', title:'就职状态',  align:'center', width:120},
		          ]],
		
	});
	
	$('#form_add_user').dialog({
		title:'新增用户',
		width:350,
		height:310,
		cache: false,  
		closed:true,
		buttons:[
		         {
		        	 text:'提交',
		        	 handler:function(){
		        		 $.messager.progress({
		        			 text:'请求处理中...'
		        		 });
		        		 $('#form_add_user').form('submit',{
		        			 url:'/BiliBili3/addUser',
		        			 success:function(data){
		        				 $.messager.progress('close');
		        				 if(data>0){
		        					 $.messager.show({
		        						 title:'提示',
		        						 msg:'新增成功！'
		        					 });
		        					 $('#form_add_user').dialog('close').form('clear');
		        					 $('#users').datagrid('reload');
		        				 }else{
		        					 $.messager.alert("警告",'新增失败！','warning');
		        				 }
		        			 }
		        		 });
		        	 }
		         },
		         {
		        	 text:'取消',
		        	 handler:function(){
		        		 $('#form_add_user').dialog('close').form('reset');
		        	 }
		         }
		         ]
	});
	
	
	
	
	$('#form_edit_user').dialog({
		title:'修改用户信息',
		width:350,
		height:250,
		cache: false,  
		closed:true,
		buttons:[
		         {
		        	 text:'提交',
		        	 handler:function(){
		        		 $.messager.progress({
		        			 text:'请求处理中...'
		        		 });
		        		 $('#form_edit_user').form('submit',{
		        			 url:'/BiliBili3/updateUserById',
		        			 success:function(data){
		        				 $.messager.progress('close');
		        				 if(data>0){
		        					 $.messager.show({
		        						 title:'提示',
		        						 msg:'修改成功！'
		        					 });
		        					 $('#form_edit_user').dialog('close').form('clear');
		        					 $('#users').datagrid('reload');
		        				 }else{
		        					 $.messager.alert("警告",'修改失败！','warning');
		        				 }
		        			 }
		        		 });
		        	 }
		         },
		         {
		        	 text:'取消',
		        	 handler:function(){
		        		 $('#form_edit_user').dialog('close').form('reset');
		        	 }
		         }
		         ]
		
		
	});






	userTool={
			query:function(){
				$("#users").datagrid("load",{
					adminName:$("#adminName").val()
				});
			},
			add:function(){
				$('#form_add_user').dialog('open');
				$('#cc').combobox({    
					url:'/BiliBili3/roles?roleName=null',    
					valueField:'id',    
					textField:'text',
					panelMaxHeight:'150'
				});
			},
			edit:function(){
				var rows = $('#users').datagrid('getSelections');
				if(rows.length>1){
					$.messager.alert("警告",'只能选择一条记录!','warning');
				}else if(rows.length==0){
					$.messager.alert("警告",'请选择您要修改的记录!','warning');
				}else if(rows.length==1){
					$('#adminId').attr("value",rows[0].adminId);
					$('#form_edit_user').dialog('open');
					document.getElementById("userName").value=rows[0].adminName;
					$.ajax({
						url: '/BiliBili3/getRoleNameById?adminId='+rows[0].adminId, 
						type:'json',
						success: function(data){
							$('#dd').combobox('setValue', data.roleName);
						}
					});
					$('#dd').combobox({
						url:'/BiliBili3/roles?roleName=null',    
						valueField:'id',    
						textField:'text',
						panelMaxHeight:'150',
					});
					if(rows[0].adminState=="在职"||rows[0].adminState=="就职"){
						$("#adminState").val("0").prop("selected", 'selected'); 
					}
					if(rows[0].adminState=="停职"){
						$("#adminState").val("1").prop("selected", 'selected'); 
					}
					if(rows[0].adminState=="离职"){
						$("#adminState").val("2").prop("selected", 'selected'); 
					}
					
					
					
				}
			},


	}







});