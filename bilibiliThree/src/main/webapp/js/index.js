$(function() {
	$("#big").accordion({
		animate:true,
		selected:0,
		width:200,
		fit:false,
		onSelect:function(){
			var pp = $('#big').accordion('getSelected');
			var index=$('#big').accordion('getPanelIndex',pp);
			var pid=document.getElementById("pid"+index).value;
			$('#nav'+index).tree({
				url:'menu/'+pid,
				lines:false,
				onClick:function(node){
					if(node.url){
						if($('#tabs').tabs("exists",node.text)){
							$('#tabs').tabs("select",node.text);
						}else{
							$('#tabs').tabs('add',{    
								title:node.text,    
								closable:true,  
								cache:false,
								iconCls:node.iconCls,
								content:'<iframe scrolling="auto" frameborder="0" src="'+node.url+'" style="width:100%;height:100%;display:block;"></iframe>'
							});
						}
					}
				}
			});
		}
	}); 
});



