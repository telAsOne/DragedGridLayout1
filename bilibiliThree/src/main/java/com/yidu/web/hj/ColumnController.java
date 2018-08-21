package com.yidu.web.hj;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.aspectj.weaver.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.yidu.utils.InitImgServlet;

import sun.misc.BASE64Decoder;


@Controller
@RequestMapping("/column")
public class ColumnController {
	/**
	 * 接收日常提交的数据
	 * @param request
	 * @param map
	 * @param inputName
	 * @throws IOException
	 */
	@ResponseBody
	@RequestMapping(value="/photoData",method=RequestMethod.POST)
	public void  painting(
			HttpServletRequest request,
			Map<String,Object> map
			,@RequestParam("inputName") String inputName) throws IOException{
		System.out.println("inputName\t"+inputName);
		String ds = request.getParameter("ds"); 
		JSONArray json=JSONArray.fromObject(ds);
		//获取外部图片路径
		String path = "everydayAll/everydayId/";
		//获取外部文件夹
		String realPath ="D:/R3/demo/fileProject/hj/images/user/" + path;

		File a = new File(realPath);
		if (!a.exists()) {//判断文件目录的存在
			a.mkdirs();
		}
		for (int j = 0; j <json.size(); j++) {
			JSONObject jsonOne = json.getJSONObject(j); 
			String imgName = (String) jsonOne.get("name");
			imgName="everydayId"+"_"+(j+1)+imgName.substring(imgName.lastIndexOf("."));
			String file = (String) jsonOne.get("base64");
			BASE64Decoder decoder  = new BASE64Decoder();
			//将头部截取出来
			int number=0;
			if(imgName.substring(imgName.lastIndexOf(".")+1).equalsIgnoreCase("png")||
					imgName.substring(imgName.lastIndexOf(".")+1).equalsIgnoreCase(".gif")){
				number=22;
			}else if(imgName.substring(imgName.lastIndexOf(".")+1).equalsIgnoreCase("jpg")){
				number=23;
			}
			String imagebasefile = file.substring(number);
			try {
				// Base64解码
				byte[] bytes = decoder.decodeBuffer(imagebasefile);
				for (int i = 0; i < bytes.length; ++i) {
					if (bytes[i] < 0) {// 调整异常数据
						bytes[i] += 256;
					}
				}
				//生成JPEG图片输出流，名字，保存路径            
				FileOutputStream out = new FileOutputStream(realPath+imgName);
				out.write(bytes);
				out.flush();
				out.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * 跳转日常
	 * @return
	 */
	@RequestMapping(value="/photoJump")
	public String photoJump(){
		return "photo";
	}
	/**
	 * 绘画日常
	 * @return
	 */
	@RequestMapping(value="/paintingJump")
	public String paintingJump(){
		return "painting";
	}
	
	
	/**
	 * 接收专栏提交数据
	 * @param columnContent
	 * @param title
	 * @param columnType
	 * @param columnClassification
	 * @param columnLanguage
	 * @param inputName
	 * @param radiobutton
	 * @param titlImgContent
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/columnContent",method=RequestMethod.POST)
	public String dd(@RequestParam("columnContent") String columnContent,
			@RequestParam("title") String title,
			@RequestParam("column_type") String columnType,
			@RequestParam("column_classification") String columnClassification,
			@RequestParam("columnLanguage") String columnLanguage,
			@RequestParam("inputName") String inputName,
			@RequestParam("radiobutton") String radiobutton,
			@RequestParam("titlImgContent") String titlImgContent,Map<String,Object> map){
		map.put("content", columnContent);
		map.put("titlImgContent", titlImgContent);
		return "NewFile";
	}
}