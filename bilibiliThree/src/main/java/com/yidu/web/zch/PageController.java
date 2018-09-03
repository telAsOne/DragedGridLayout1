package com.yidu.web.zch;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 网页页面显示控制
 * @author Z
 *
 */
@Controller
public class PageController {
	
	private static Logger LOGGER = LoggerFactory.getLogger(PageController.class);

	@RequestMapping(value="/bi",method=RequestMethod.GET)
	public String zchHtml(@RequestParam(value="iframeSrc") String iframeSrc,
						  @RequestParam(value="src") String src,
						  HttpServletRequest req,
						  Map<String, String> map){
		
		if (req.getHeader("X-PJAX") != null) {
			LOGGER.info("pjax request");
			return String.format("forward:/upOne/%s", iframeSrc);
		}
		
		map.put("iframeSrc", iframeSrc);
		LOGGER.info("normal request"); 	
		
		return String.format("forward:/upOne/%s", iframeSrc);		
	}

	/**
	 * iframe页面
	 */
	@ResponseBody
	@RequestMapping(value="/upOne/{iframeSrc}",method=RequestMethod.GET)
	public String getIframePage(@PathVariable("iframeSrc") String iframeSrc){
		String iframe = 
				"<iframe id='iframe' scrolling='no' src='"+iframeSrc+"' frameborder='0' height='900px' width='1030px'>"
				 + "</iframe>";
		return iframe;
	}
	
	/**
	 * 顶部菜单栏
	 */
	@ResponseBody
	@RequestMapping(value="/topOne/{topSrc}",method=RequestMethod.GET)
	public String getIframeTop(@PathVariable("topSrc") String topSrc){
		String topIframe = 
				"<iframe id='iframe' scrolling='no' src='"+topSrc+"' frameborder='0' height='768px' width='1030px'>"
				 + "</iframe>";
		return topIframe;
	}
	
}
