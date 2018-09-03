package com.yidu.web.zch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yidu.zch.entity.CreateMenu;
import com.yidu.zch.service.MenuService;

/**
 * 获取菜单控制类
 * @author 朱辞涵
 * @date 2018年7月18日
 */
@Controller
public class CreateMenuController {

	@Autowired
	private MenuService menuService;
	
	/**
	 * 获取菜单
	 */
	@ResponseBody
	@RequestMapping(value="/zch/menus",method=RequestMethod.GET)
	public List<CreateMenu> getCreateMenuOne(){
		
		List<CreateMenu> createMenu = menuService.getCreateMenuOne();
		
		return createMenu;
	}
	
}
