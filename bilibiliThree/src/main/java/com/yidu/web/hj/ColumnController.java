package com.yidu.web.hj;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yidu.hj.entity.Columns;
import com.yidu.hj.service.SubmissionService;
import com.yidu.utils.CharacterToByte;
import com.yidu.utils.InitImgServlet;
@Controller
public class ColumnController {
	@Autowired
	private SubmissionService ss;
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
			,@RequestParam("inputName") String inputName,
			@RequestParam("content") String content) {
		
		System.out.println("inputName\t"+inputName);
		System.out.println("content\t"+content);
		String ds = request.getParameter("ds"); 
		JSONArray json=JSONArray.fromObject(ds);
		//获取外部文件夹
		String realPath=InitImgServlet.filePath+"hj/images/user/column/daily/dailyId/";
		File a = new File(realPath);
		if (!a.exists()) {//判断文件目录的存在
			a.mkdirs();
		}
		for (int j = 0; j <json.size(); j++) {
			JSONObject jsonOne = json.getJSONObject(j); 
			String imgName = (String) jsonOne.get("name");
			imgName="daily"+"_"+(j+1)+imgName.substring(imgName.lastIndexOf("."));
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
	 * 
	 * 方法描述: 接收绘画提交数据
	 * 业务逻辑说明: TODO(总结性的归纳方法业务逻辑) 
	 * 1、处理…………<br/>
	 * 2、处理…………<br/>
	 * 3、处理…………<br/>
	 * @Title: paintingData 
	 * @date 2018年8月29日 下午12:02:00
	 * @author Administrator
	 * @modifier 无
	 * @modifydate 无
	 * @param request
	 * @param attribute
	 * @param classification
	 * @param title
	 * @param introduction
	 * @param sourceLabel
	 * @param otherLabel
	 * @param reprinted
	 */
	@ResponseBody
	@RequestMapping(value="/paintingData",method=RequestMethod.POST)
	public void  paintingData(HttpServletRequest request,
			@RequestParam("attribute") String attribute,
			@RequestParam("classification") String classification,
			@RequestParam("title") String title,
			@RequestParam("introduction") String introduction,
			@RequestParam("sourceLabel") String sourceLabel,
			@RequestParam("otherLabel") String otherLabel,
			@RequestParam("reprinted") String reprinted){
		
		System.out.println("属性\t"+attribute);
		System.out.println("分类\t"+classification);
		System.out.println("标签\t"+title);
		System.out.println("作品简介\t"+introduction);
		System.out.println("资源标签\t"+sourceLabel);
		System.out.println("其他标签\t"+otherLabel);
		System.out.println("是否转载\t"+reprinted);
		
		
		
		String ds = request.getParameter("ds"); 
		JSONArray json=JSONArray.fromObject(ds);
		//获取外部文件夹
		String realPath =InitImgServlet.filePath+"hj/images/user/column/painting/paintingId/";

		File a = new File(realPath);
		if (!a.exists()) {//判断文件目录的存在
			a.mkdirs();
		}
		System.out.println(json.size());
		for (int j = 0; j <json.size(); j++) {
			JSONObject jsonOne = json.getJSONObject(j); 
			String imgName = (String) jsonOne.get("name");
			imgName="painting"+"_"+(j+1)+imgName.substring(imgName.lastIndexOf("."));
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
	 * @throws FileNotFoundException
	 */ 
/*	@ResponseBody
	@RequestMapping(value="/columnContent",method=RequestMethod.POST)
	public void column(@RequestParam("columnContent") String columnContent,
			@RequestParam("title") String title,
			@RequestParam("columnType") String columnType,
			@RequestParam("columnClassification") String columnClassification,
			@RequestParam("columnLanguage") String columnLanguage,
			@RequestParam("label") String label,
			@RequestParam("columnWhetherforwarded") String columnWhetherforwarded,
			@RequestParam("columnImgtitle") String columnImgtitle,Map<String,Object> map) throws FileNotFoundException{
		*/
	@ResponseBody
	@RequestMapping(value="/columnContent",method=RequestMethod.POST)
	public void column(Columns columns,@RequestParam("columnContent") String columnContent
			) throws FileNotFoundException{
	
		String path=InitImgServlet.filePath+"hj/columnContent/userId/"+1+".txt";
		File file=new File(path);
			if(!file.exists()){
				try {
					file.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				PrintWriter pw = new PrintWriter(new FileWriter(file));
				pw.print(columnContent);
				pw.flush();
				pw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		/*	System.out.println("所有\t"+columns.toString());
			System.out.println(columns.getAudit());
			System.out.println(columns.getColumnClassification());
			columns.setColumnContentAddress(path);
			System.out.println(columns.getColumnContentAddress());
			System.out.println(columns.getColumnTitle());
			System.out.println(columns.getColumnType());
			System.out.println(columns.getColumnWhetherforwarded());
			System.out.println("标签\t"+columns.getLabel());
			System.out.println(columns.getCollectionNumber());
			System.out.println(columns.getColumnId());
			System.out.println(columns.getCommentsNumber());
			System.out.println(columns.getFavoritesClassification());*/
			
			
			
			columns.setColumnContentAddress(path);
			int insertColumn = ss.insertColumn(columns);
			System.out.println(insertColumn);
	}
}