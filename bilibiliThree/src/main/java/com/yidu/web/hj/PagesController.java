package com.yidu.web.hj;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PagesController {
	
	private static Logger LOGGER = LoggerFactory.getLogger(PagesController.class);
	@RequestMapping(value="/zchMenu",method=RequestMethod.GET)
	public String zchHtml(@RequestParam(value="iframeSrc") String iframeSrc,
						  HttpServletRequest req){
		if (req.getHeader("X-PJAX") != null) {
			System.out.println("局部");
			LOGGER.info("pjax request");
			return String.format("forward:/upOne?%s", iframeSrc);
		}
		req.getSession().setAttribute("iframeSrc", iframeSrc);
		LOGGER.info("normal request");
		return "uploading";
	}
	
	/**
	 * iframe页面
	 */
	@RequestMapping(value="/upOne",method=RequestMethod.GET)
	public String getIframePage(@RequestParam("iframeSrc") String iframeSrc){
		String iframe = 
				"<iframe id='iframe' scrolling='no' src='"+iframeSrc+"' frameborder='0' height='1400px' width='960px'>"
				 + "</iframe>";
		return iframe;
	}
	
	
	
}
