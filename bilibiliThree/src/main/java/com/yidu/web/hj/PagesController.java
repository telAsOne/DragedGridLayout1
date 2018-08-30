package com.yidu.web.hj;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PagesController {
	private static Logger LOGGER = LoggerFactory.getLogger(PagesController.class);
	@RequestMapping(value="/index/bi",method=RequestMethod.GET)
	public String zchHtml(@RequestParam(value="iframeSrc") String iframeSrc,
						  HttpServletRequest req,
						  Map<String, String> map){
		if (req.getHeader("X-PJAX") != null) {
			LOGGER.info("pjax request");
			return String.format("forward:/upOne?%s", iframeSrc);
		}
		map.put("iframeSrc", iframeSrc);
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
