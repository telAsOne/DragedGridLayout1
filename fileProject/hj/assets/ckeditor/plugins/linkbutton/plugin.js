(function(){
    //Section 1 : 按下自定义按钮时执行的代码
    var a= {
        exec:function(editor){
        $("#a").click();
        	
        }
    },
    //Section 2 : 创建自定义按钮、绑定方法
    b='linkbutton';
    CKEDITOR.plugins.add(b,{
        init:function(editor){
            editor.addCommand(b,a);
            editor.ui.addButton('linkbutton',{
                label:'图片',
                icon: this.path + 'im.png',
                command:b
            });
        }
    });
	
	
	var input = document.getElementById("a"); 
        	
      		    var result;
      		    var data=null;
      		    var dataArr = []; // 储存所选图片的结果(文件名和base64数据)  
      		    var fd;  //FormData方式发送请求    
      		    if(typeof FileReader==='undefined'){    
      		        alert("抱歉，你的浏览器不支持 FileReader");    
      		        input.setAttribute('disabled','disabled');    
      		    }else{    
      		        input.addEventListener('change',readFile,false);    
      		    }   
      		    function readFile(){ 
						if (!$("#a").val().match(/.jpg|.gif|.png|.jpeg|.bmp/i)){
      		                return alert("上传的图片格式不正确，请重新选择");    
      		            }  				
      		        fd = new FormData();    
      		        var iLen = this.files.length;  
      		        var index = 0;  
      		        for(var i=0;i<iLen;i++){
      		        	if(i==0){
      		        		data=CKEDITOR.instances.editor1.getData();
      		        	}
      		           
      		            var reader = new FileReader();  
      		            reader.index = i;    
      		            fd.append(i,this.files[i]);  
      		            reader.readAsDataURL(this.files[i]);  //转成base64    
      		            reader.fileName = this.files[0].name;  
      		            reader.onload = function(e){   
      		                var imgMsg = {    
      		                    name : this.fileName,
      		                    base64 : this.result
      		                },   
      		              result = '<img  src="'+this.result+'"  style="display:block;margin:20px auto;width:500px;height:313px;" alt=""/>'; 
						 CKEDITOR.instances.editor1.setData(data+result);
      		            }    
      		        }    
      		    }
})(); 