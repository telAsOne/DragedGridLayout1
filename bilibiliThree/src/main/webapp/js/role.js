$('#roles').datagrid({
	url:"/BiliBili3/getRoles?roleName=null",
	fit:true,
	border:false,
	striped:true,
	rownumbers:true,
	pagination:true,
	toolbar:'#toolbar_role',
	columns:[[
	          {field:'roleId', title:'角色ID', checkbox:true},
	          {field:'roleName', title:'角色名称',  align:'center', width:120},
	          ]],
});