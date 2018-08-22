window.onload = function(){    
    var input = document.getElementById("file_input");    
    var result;    
    var dataArr = []; // 储存所选图片的结果(文件名和base64数据)  
    var fd;  //FormData方式发送请求    
    var oSubmit = document.getElementById("button"); 
    var oInput = document.getElementById("file_input");  
     
    if(typeof FileReader==='undefined'){    
        alert("抱歉，你的浏览器不支持 FileReader");    
        input.setAttribute('disabled','disabled');    
    }else{    
        input.addEventListener('change',readFile,false);    
    }　//handler    
        var count=0;
    function readFile(){   
        fd = new FormData();    
        var iLen = this.files.length;  
        var index = 0;  
        if(count+iLen>10){
        	alert("图片超过10张，请重新选择");
        }else{
        	if(count+iLen==10){
        		$("#uploadImg").css("display","none");
        		$("#file_input").css("display","none");
        	}
        	count+=iLen;
        	for(var i=0;i<iLen;i++){
            if (!input['value'].match(/.jpg|.gif|.png|.jpeg|.bmp/i)){//判断上传文件格式    
                return alert("上传的图片格式不正确，请重新选择");    
            }  
            var reader = new FileReader();  
            reader.index = i;    
            fd.append(i,this.files[i]);  
            reader.readAsDataURL(this.files[i]);  //转成base64    
            reader.fileName = this.files[i].name;  
            reader.onload = function(e){   
                var imgMsg = {    
                    name : this.fileName,//获取文件名    
                    base64 : this.result   //reader.readAsDataURL方法执行完后，base64数据储存在reader.result里    
                }   
                dataArr.push(imgMsg);    
                result = '<div class="delete">删除</div><div class="result"><img src="'+this.result+'"  alt=""/></div>';    
                var div = document.createElement('div');  
                div.innerHTML = result;    
                div['className'] = 'float';  
                div['index'] = index;   
                $('#container').append(div); 
              //  document.getElementById('container').appendChild(div);  　　//插入dom树    
                var img = div.getElementsByTagName('img')[0];  
                img.onload = function(){    
                    var nowHeight = ReSizePic(this); //设置图片大小    
                    this.parentNode.style.display = 'block';    
                    var oParent = this.parentNode;    
                    if(nowHeight){    
                        oParent.style.paddingTop = (oParent.offsetHeight - nowHeight)/2 + 'px';    
                    }    
                }   
  
  
                div.onclick = function(){  
                	count--;
                	if(count<10){
                		$("#uploadImg").css("display","inline-block");
                		$("#file_input").css("display","inline-block");
                	}
                    this.remove();                  // 在页面中删除该图片元素  
                    delete dataArr[this.index];  // 删除dataArr对应的数据  
                }  
                index++;  
            }    
        }    
        }
    }    
        
        
    function send(){   
  
        var submitArr = [];  
        for (var i = 0; i < dataArr.length; i++) {  
            if (dataArr[i]) {  
                submitArr.push(dataArr[i]);  
            }  
        }
        // console.log('提交的数据：'+JSON.stringify(submitArr)) 
        $.ajax({    
            url : 'paintingData',    
            type : 'post', 
            dataType: 'json',   
             data:{
            	 ds:JSON.stringify(submitArr)
            },
            //processData: false,   用FormData传fd时需有这两项    
            //contentType: false,   
            success : function(data){    
              alert(data);  
          　}
        });    
    }    
  
    oInput.onclick=function(){  
        oInput.value = "";   // 先将oInput值清空，否则选择图片与上次相同时change事件不会触发  
    }   
    oSubmit.onclick=function(){ 
        if(!dataArr.length){    
            return alert('请先选send择文件');    
        }   
        send();    
    }    
}    
/*    
 用ajax发送fd参数时要告诉jQuery不要去处理发送的数据，    
 不要去设置Content-Type请求头才可以发送成功，否则会报“Illegal invocation”的错误，    
 也就是非法调用，所以要加上“processData: false,contentType: false,”    
 * */    
    
                
function ReSizePic(ThisPic) {    
    var RePicWidth = 150; //这里修改为您想显示的宽度值    
    
    var TrueWidth = ThisPic.width; //图片实际宽度    
    var TrueHeight = ThisPic.height; //图片实际高度    
        
    if(TrueWidth>TrueHeight){    
        //宽大于高    
        var reWidth = RePicWidth;    
        ThisPic.width = reWidth;    
        //垂直居中    
        var nowHeight = TrueHeight * (reWidth/TrueWidth);    
        return nowHeight;  //将图片修改后的高度返回，供垂直居中用    
    }else{    
        //宽小于高    
        var reHeight = RePicWidth;    
        ThisPic.height = reHeight;    
    }    
} 