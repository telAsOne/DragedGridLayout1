package com.yidu.web.hj;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.yidu.utils.CharacterToByte;
@Controller
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
	public void  photoData(HttpServletRequest request,
			Map<String,Object> map
			,@RequestParam("inputName") String inputName) {
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
		System.out.println(json.size());
		for (int j = 0; j <json.size(); j++) {
			JSONObject jsonOne = json.getJSONObject(j); 
			String imgName = (String) jsonOne.get("name");
			imgName="everydayId"+"_"+(j+1)+imgName.substring(imgName.lastIndexOf("."));
			String file = (String) jsonOne.get("base64");
			try {
				CharacterToByte.byteImg(imgName, file, realPath+imgName);
			} catch (IOException e) {
				// TODO Auto-generated catch block
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
		System.out.println("进入日常jsp");
		return "photo";
	}
	/**
	 * 绘画日常
	 * @return
	 */
	@RequestMapping(value="/paintingJump")
	public String paintingJump(){
		System.out.println("进入绘画jsp");
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