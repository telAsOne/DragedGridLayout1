/**
 * 
 */
package com.yidu.web.jyz.controller;

import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yidu.base.allEntity.Videolabel;
import com.yidu.jyz.service.VideolabelService;

/**
 * @author 逍遥
 *
 */
@Controller
@RequestMapping("/index")
public class VideolabelController {
	@Autowired
	public VideolabelService service;
	@RequestMapping("/label")
	public String getIndex(Map<String, Object> map){
		//查询视频分类
		List<Videolabel> videolable = service.getVideolable();
		//添加
		map.put("label", videolable);
		System.out.println(videolable);
		return "bilibiliIndex";
	}
	
}
