package com.yidu.web.cr.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yidu.base.allEntity.UserInfo;
import com.yidu.base.allMapper.UserInfoMapper;

@Controller
@RequestMapping("/cr")
public class UserHome {
	
	@Autowired
	private UserInfoMapper mapper;
	
	@RequestMapping("/goHomePage")
	public String homepage(HttpSession session){
		// TODO 正常情况下，应该是判断是否登录，跳转到个人中心
		
		// 假的情况，人为的值session里面塞入userInfo对象，冒充已经登录
		UserInfo userInfo = mapper.selectByPrimaryKey(1);
		session.setAttribute("userinfo", userInfo);
		return "cr/homepage";
	} 
	
	@RequestMapping("/goDoti")
	public String doti(){
		return "cr/Doti";
	}
	
	@RequestMapping("/godongtai")
	public String dongtai(){
		return "cr/dongtai";
	}
	
	@RequestMapping("/goxinxi")
	public String xinxi(){
		return "cr/xinxi";
	}
	
	@RequestMapping("/goxiu")
	public String xiu(){
		return "cr/xiu";
	}
	
}
