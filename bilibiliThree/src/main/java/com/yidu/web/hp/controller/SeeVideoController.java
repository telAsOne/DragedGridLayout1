package com.yidu.web.hp.controller;

import javax.servlet.http.HttpServletRequest;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SeeVideoController {
	@RequestMapping(value="/video")
	public ModelAndView testVideo(HttpServletRequest request){
		request.getSession().setAttribute("uid", "1");
		request.getSession().setAttribute("name", "张三");
		return new ModelAndView("redirect:videoTest");
	}
	@RequestMapping(value = "videoTest")
	public ModelAndView videoTest() {
		return new ModelAndView("SeeVideo");
	}
	@RequestMapping(value="/seeVideoPage")
	public String SeeVideoPage(){
		return "SeeVideo";
	}
	@RequestMapping(value="/gaofa")
	public ModelAndView goGaoFa(HttpServletRequest request){
		request.getSession().setAttribute("uid", "1");
		request.getSession().setAttribute("name", "张三");
		return new ModelAndView("GaoFaDanMu");
	}
	
}
