package com.yidu.web.zch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.yidu.base.allEntity.UserInfo;
import com.yidu.base.allEntity.Video;
import com.yidu.web.hj.PagesController;
import com.yidu.zch.service.VideoService;

/**
 * 视频上传控制类
 * @author 朱辞涵
 *
 */
@Controller
public class UploadingVideo {
	private static Logger LOGGER = LoggerFactory.getLogger(UploadingVideo.class);
	@Autowired
	private VideoService videoService;

	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式

	/**
	 *采用spring提供的上传文件的方法
	 */
	@RequestMapping("springUpload")
	public String springUpload(HttpServletRequest request) throws IllegalStateException, IOException
	{
		long startTime = System.currentTimeMillis();
		//将当前上下文初始化给  CommonsMutipartResolver （多部分解析器）
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());

		//检查form中是否有enctype="multipart/form-data"
		if(multipartResolver.isMultipart(request))
		{
			//将request变成多部分request
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest)request;
			//获取multiRequest 中所有的文件名
			Iterator iter = multiRequest.getFileNames();

			while(iter.hasNext())
			{
				//一次遍历所有文件
				MultipartFile file = multiRequest.getFile(iter.next().toString());
				if(file!=null)
				{
					//文件位置
					String path="D:/springUpload"+file.getOriginalFilename();
					//上传
					file.transferTo(new File(path));
				}
			}

		}
		long endTime=System.currentTimeMillis();

		System.out.println("文件传输运行时间："+String.valueOf(endTime-startTime)+"ms");
		return "/videoInfo"; 
	}

	/**
	 * 查询所有视频
	 */
	@RequestMapping(value="/selectVideo/{videoState}", method=RequestMethod.GET)
	public String selectAllVideo(@PathVariable("videoState") Integer id, Map<String, Object> videoMap, HttpServletRequest req){
		//获取当前登录用户id
		UserInfo user = (UserInfo)req.getSession().getAttribute("userInfo");
		
		Map<String, Object> selectAllVideo = videoService.selectAllVideo(0, id);
		videoMap.putAll(selectAllVideo);
		
		
		return "/allVideo";
		
	}
	
	/**
	 * 保存视频信息
	 */
	@RequestMapping(value="/addVideo")
	public String  uploadVideo(@RequestParam("imgFile")MultipartFile imgFile, Video video, HttpServletRequest request){

		//获取编译后服务器地址
		String pathVal = request.getSession().getServletContext().getRealPath("/");
		//根据配置文件获取服务器图片存放路径
		String newFileName = String.valueOf(System.currentTimeMillis());
		String saveFilePath = "/zch/images/";

		//构建文件目录
		File fileDir = new File(pathVal + saveFilePath);
		if (!fileDir.exists()) {
			fileDir.mkdirs();
		}

		//上传的文件名
		String fileName = imgFile.getOriginalFilename();
		//文件的扩张名
		String longName = fileName.substring(fileName.lastIndexOf(".") + 1);

		try {
			String imgPath = saveFilePath + newFileName + "." + longName;
			FileOutputStream out = new FileOutputStream(pathVal + imgPath);

			//写入文件
			out.write(imgFile.getBytes());
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		video.setVideoImage(newFileName + "." + longName);
		video.setVideoUpofuser(0);
		video.setVideoImage("null");
//		String format = df.format(new Date());
		video.setVideoUptime(11);

		video.setVideoImage(newFileName + "." + longName);

		videoService.uploadVideo(video);
		
		return "redirect:/selectVideo/10";
	}

	/**
	 * 删除视频信息
	 */
	@RequestMapping(value="/delVideo/{videoId}", method=RequestMethod.DELETE)
	public String delVideo(@PathVariable("videoId") int videoId){

		videoService.delVideo(videoId);

		return "redirect:/selectVideo/10";
	}

	/**
	 * 根据视频id查询视频信息
	 */
	@RequestMapping(value="/selectById/{videoId}", method=RequestMethod.GET)
	public String selectVideoById(@PathVariable("videoId") int id, Map<String, Object> videoMap){

		Video videoById = videoService.selectVideoById(id);
		videoMap.put("videoById", videoById);
		//		System.out.println("根据视频id查询:" + videoById);

		return "/videoInfo";
	}

	/**
	 * 修改视频信息
	 */
	@RequestMapping(value="/updateVideo")
	public String updateVideo(@RequestParam("imgFile")MultipartFile imgFile, Video video, HttpServletRequest request){
		//获取编译后服务器地址
		String pathVal = request.getSession().getServletContext().getRealPath("/");
		System.out.println(pathVal);
		//根据配置文件获取服务器图片存放路径
		String newFileName = String.valueOf(System.currentTimeMillis());
		System.out.println(newFileName);
		String saveFilePath = "/zch/images/";

		//构建文件目录
		File fileDir = new File(pathVal + saveFilePath);
		if (!fileDir.exists()) {
			fileDir.mkdirs();
		}

		//上传的文件名
		String fileName = imgFile.getOriginalFilename();
		//文件的扩张名
		String longName = fileName.substring(fileName.lastIndexOf(".") + 1);

		try {
			String imgPath = saveFilePath + newFileName + "." + longName;
			FileOutputStream out = new FileOutputStream(pathVal + imgPath);

			//写入文件
			out.write(imgFile.getBytes());
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		video.setVideoImage(newFileName + "." + longName);

		int i = videoService.updateVideo(video);

		return "redirect:/selectVideo/10";
	}

}
