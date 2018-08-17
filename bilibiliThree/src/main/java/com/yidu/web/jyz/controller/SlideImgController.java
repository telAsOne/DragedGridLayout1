package com.yidu.web.jyz.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sun.misc.BASE64Decoder;

import com.yidu.base.allEntity.SlideImg;
import com.yidu.jyz.admin.service.SlideImgService;
import com.yidu.utils.InitImgServlet;

@Controller
@RequestMapping("/admin/index/slide")
public class SlideImgController {

	@Autowired
	public SlideImgService service;

	@RequestMapping("/ui")
	public String slideUrl(){
		return "slide";
	}

	@ResponseBody
	@RequestMapping(value="/insertSlideImg",method=RequestMethod.POST)
	public Integer insertSlideImg(SlideImg img,HttpServletRequest request,
			@RequestParam(value="file") String file){
		
		//插入错误数据。。。防止数据库出现异常
		img.setImageurl("/bilibiliThree/fileProject/");
		//插入数据
		int insert = service.insert(img);
		if(insert>0 && img.getSlideId()>0){
			
			//获取外部图片路径
			String path = "/jyz/images/slide/slide" + img.getSlideId() + ".png";
			
			//获取外部文件夹
			String realPath =InitImgServlet.filePath + path;
			//获取当前项目目录
			String courseFile =request.getServletContext().getRealPath("/");
			String realPathTomact = courseFile +"\\fileProject"+ path;
			
			BASE64Decoder decoder  = new BASE64Decoder();
			//将头部截取出来
			String imagebasefile = file.substring(23);
			try {
				// Base64解码
				byte[] bytes = decoder.decodeBuffer(imagebasefile);
				for (int i = 0; i < bytes.length; ++i) {
					if (bytes[i] < 0) {// 调整异常数据
						bytes[i] += 256;
					}
				}
				//生成JPEG图片输出流，名字，保存路径            
				FileOutputStream out = new FileOutputStream(realPath);
				FileOutputStream outTomact = new FileOutputStream(realPathTomact);
				outTomact.write(bytes);
				out.write(bytes);
				outTomact.flush();
				out.flush();
				out.close();
				outTomact.close();
				
				//修改正确imgageUrl的值
				img.setImageurl("/bilibiliThree/fileProject/"+path);
				service.updateByPrimaryKey(img);
			}catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}
		return insert;
	}

	@ResponseBody
	@RequestMapping(value="/allImg")
	public List<SlideImg> getSlideAllImg(){
		List<SlideImg> selectAll = service.selectAll();
		return selectAll;
	}

	@ResponseBody
	@RequestMapping(value="/oneImg/{slideId}")
	public List<SlideImg> getSlideImg(@PathVariable("slideId") Integer slideId,HttpServletRequest request){
		SlideImg selectByPrimaryKey = service.selectByPrimaryKey(slideId);
		List<SlideImg> list = new  ArrayList<SlideImg>();
		list.add(selectByPrimaryKey);
		return list;
	}
	/**
	 * 
	 * 方法描述: 
	 * 业务逻辑说明: TODO(总结性的归纳方法业务逻辑) 
	 * 1、处理…………<br/>
	 * 2、处理…………<br/>
	 * 3、处理…………<br/>
	 * @Title: updateSlideImg 
	 * @date 2018年7月25日 下午11:34:08
	 * @author 逍遥
	 * @modifier 无
	 * @modifydate 无
	 * @param record
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/updateImg")
	public Integer updateSlideImg(SlideImg record,HttpServletRequest request,
			@RequestParam(value="file") String file){
		//获取外部图片路径
		String path = "/jyz/images/slide/slide" + record.getSlideId() + ".jpg";
		//判断用户是否修改了图片
		if(file.length()>100){
			String realPath =InitImgServlet.filePath + path;
			//获取当前项目目录
			String courseFile =request.getServletContext().getRealPath("/");
			String realPathTomact = courseFile +"\\fileProject"+ path;

			BASE64Decoder decoder  = new BASE64Decoder();

			String imagebasefile = file.substring(23);
			try {
				// Base64解码
				byte[] bytes = decoder.decodeBuffer(imagebasefile);
				for (int i = 0; i < bytes.length; ++i) {
					if (bytes[i] < 0) {// 调整异常数据
						bytes[i] += 256;
					}
				}
				//生成JPEG图片输出流，名字，保存路径            
				FileOutputStream out = new FileOutputStream(realPath);
				FileOutputStream outTomact = new FileOutputStream(realPathTomact);
				outTomact.write(bytes);
				out.write(bytes);
				outTomact.flush();
				out.flush();
				out.close();
				outTomact.close();

			}catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}
		record.setImageurl("/bilibiliThree/fileProject/"+path);
		int updateByPrimaryKey = service.updateByPrimaryKey(record);
		return updateByPrimaryKey;
	}

	@ResponseBody
	@RequestMapping(value="/deleteImg")
	public String updateSlideImg(@RequestParam(value="id") String [] ids,HttpServletRequest request){
		//获取文件夹
		String path = "/jyz/images/slide/";
		String filePath = InitImgServlet.filePath+path;
		//获取当前项目目录
		String courseFile =request.getServletContext().getRealPath("/");
		String realPathTomact = courseFile +"\\fileProject"+ path;

		String returnMsg = "编号为：";
		for (int i = 0; i < ids.length; i++) {

			int updateByPrimaryKey = service.deleteByPrimaryKey(Integer.parseInt(ids[i]));
			if(updateByPrimaryKey >0){
				//图片名称
				String imgName = "slide"+ids[i]+".jpg";
				//在文件夹中删除图片
				getPath(filePath, imgName);
				//在tomat部署项目中删除图片
				getPath(realPathTomact,imgName);
			}else{
				returnMsg += ids[i]+"、";
			}

		}
		if(returnMsg.equals("编号为：")){
			returnMsg = "0";
		}else{
			returnMsg+="等话题删除失败!";
		}
		//删除此话题
		//
		return returnMsg;
	}
	public void getPath(String path,String name){

		File folder = new File(path);
		File[] files = folder.listFiles();
		for(File file:files){
			if(file.getName().equals(name)){
				file.delete();
			}
		}
	}
	@ResponseBody
	@RequestMapping(value="/uploadImg/{slideId}")
	public String uploadImg(@PathVariable("slideId") Integer slideId,HttpServletRequest request,
			@RequestParam(value="file") String file) throws IOException{
		//获取外部图片路径
		String path = "/jyz/images/slide/slide" + slideId + ".jpg";
		String realPath =InitImgServlet.filePath + path;
		//获取当前项目目录
		String courseFile =request.getServletContext().getRealPath("/");
		String realPathTomact = courseFile +"\\fileProject"+ path;

		BASE64Decoder decoder  = new BASE64Decoder();

		String imagebasefile = file.substring(23);
		try {
			// Base64解码
			byte[] bytes = decoder.decodeBuffer(imagebasefile);
			for (int i = 0; i < bytes.length; ++i) {
				if (bytes[i] < 0) {// 调整异常数据
					bytes[i] += 256;
				}
			}
			//生成JPEG图片输出流，名字，保存路径            
			FileOutputStream out = new FileOutputStream(realPath);
			FileOutputStream outTomact = new FileOutputStream(realPathTomact);
			outTomact.write(bytes);
			out.write(bytes);
			outTomact.flush();
			out.flush();
			out.close();
			outTomact.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "/bilibiliThree/fileProject/"+path;
	}

	public void upload(String srcPath, String destPath) throws IOException {

		// 打开输入流
		FileInputStream fis = new FileInputStream(srcPath);
		// 打开输出流
		FileOutputStream fos = new FileOutputStream(destPath);

		// 读取和写入信息
		int len = 0;
		// 创建一个字节数组，当做缓冲区
		byte[] b = new byte[1024];
		while ((len = fis.read(b)) != -1) {
			fos.write(b, 0, len);
		}

		// 关闭流  先开后关  后开先关
		fos.close(); // 后开先关
		fis.close(); // 先开后关
	}


}
