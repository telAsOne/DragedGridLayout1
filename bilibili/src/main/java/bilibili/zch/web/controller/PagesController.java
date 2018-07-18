package bilibili.zch.web.controller;
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
public class PagesController {

	//	@Autowired
	//	private PagesService pagesService;
	
	private static Logger LOGGER = LoggerFactory.getLogger(PagesController.class);

	@RequestMapping(value="/bi",method=RequestMethod.GET)
	public String zchHtml(@RequestParam(value="iframeSrc") String iframeSrc,
						  @RequestParam(value="src") String src,
						  HttpServletRequest req,
						  Map<String, String> map){
		
		System.out.println("菜单栏。。");
		
		if (req.getHeader("X-PJAX") != null) {
			LOGGER.info("pjax request");
			return String.format("forward:/upOne/%s", iframeSrc);
		}
		
		map.put("iframeSrc", iframeSrc);
		LOGGER.info("normal request");
		
		return src;		
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
	
}
