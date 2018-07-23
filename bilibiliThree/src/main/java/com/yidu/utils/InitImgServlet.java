/*
 * @(#)InitImgServlet.java V2.0 2018-4-11
 * XXXX	版权所有
 * 
 * 文件描述...
 *
 * @Title: InitImgServlet.java 
 * @Package com.yidu.admin.filter 
 * @author Z·N
 * @date 2018-4-11 下午06:35:47
 * @version V2.0
 * 历史版本：
 * 	1. 【2018-4-11】 创建文件   by Z·N
 */
package com.yidu.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/** 
 * TODO 当系统启动时加载图片
 * 
 * @ClassName: InitImgServlet 
 * @author Z·N
 * @date 2018-4-11 下午06:35:47
 * @version V1.0 
 *  
 */
public class InitImgServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 填写你的文件目录，这个文件改了后不要提交到git上（要不是你们文件目录不统一，也不用这么麻烦了o(≧口≦)o）
	 */
	private String filePath = "E:/Demo6/fileProject";
	@Override  
	public void init() throws ServletException {

		//获取当前项目目录
		String realPath = this.getServletContext().getRealPath("/");
	
		try {
			copyFolder(new File(filePath),new File(realPath));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void copyFolder(File srcFile, File destFile) throws IOException {  

		if(srcFile.isDirectory()){  
			File newFolder=new File(destFile,srcFile.getName());  
			newFolder.mkdirs();  
			File[] fileArray=srcFile.listFiles();  

			for(File file:fileArray){  
				copyFolder(file, newFolder);  
			}  

		}else{  
			File newFile=new File(destFile,srcFile.getName());  
			copyFile(srcFile,newFile);  
		}  

	}  
	/**
	 * 方法描述: 查找对应的的字符位置
	 * 业务逻辑说明: 查找对应的的字符位置
	 * @Title: selectCode 
	 * @date 2018-4-11 下午03:27:01
	 * @author Z·N
	 * @modifier 无
	 * @modifydate 无
	 * @param code
	 * @param coeTwo
	 * @param index
	 * @return 字符的对应位置
	 */
	public static int selectCode(String code,String coeTwo,int index){
		int indexOf = 0;
		int count =0;
		for (int i = 0; i < index; i++) {
			if(i!=0){
				indexOf = count+1;
			}
			count = code.indexOf(coeTwo,indexOf);
		}
		return count;
	}
	private static void copyFile(File srcFile, File newFile) throws IOException{  
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream(srcFile));  
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(newFile));  

		byte[] bys=new byte[1024];  
		int len=0;  
		while((len=bis.read(bys))!=-1){  
			bos.write(bys,0,len);  
		}  
		bos.close();  
		bis.close();  

	}  
}
