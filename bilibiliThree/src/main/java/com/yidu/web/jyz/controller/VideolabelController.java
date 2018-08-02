/**
 * 
 */
package com.yidu.web.jyz.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yidu.base.allEntity.SlideImg;
import com.yidu.base.allEntity.Videolabel;
import com.yidu.jyz.admin.service.SlideImgService;
import com.yidu.jyz.service.VideolabelService;

/**
 * @author 逍遥
 *
 */
@Controller
@RequestMapping("/index")
public class VideolabelController {
	@Autowired
	public VideolabelService videoLabel;
	
	@Autowired
	public SlideImgService slideImg;
	
	@RequestMapping("/label")
	public String getIndex(Map<String, Object> map){
		//查询视频分类
		List<Videolabel> videolable = videoLabel.getVideolable();
		//添加
		map.put("label", videolable);
		
		//查询首页话题
		List<SlideImg> selectLookImg = slideImg.selectLookImg();
		//添加
		map.put("slideImg", selectLookImg);
		
		return "bilibiliIndex";
	}
	
}
