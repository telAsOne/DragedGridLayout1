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
			LOGGER.info("pjax request");
			req.getSession().setAttribute("iframeSrc", iframeSrc);
			return "NewFiles";
		}
		req.getSession().setAttribute("iframeSrc", iframeSrc);
		LOGGER.info("normal request");
		return "uploading";
	}
	
}
