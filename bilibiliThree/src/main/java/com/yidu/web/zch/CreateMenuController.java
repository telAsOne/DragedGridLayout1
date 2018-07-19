package com.yidu.web.zch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yidu.zch.entity.CreateMenu;
import com.yidu.zch.service.MenuService;

/**
 * 获取菜单控制类
 * @author 朱辞涵
 * @date 2018年7月18日
 */
@Controller
public class CreateMenuController {

//	@Autowired
//	private MenuService menuService;
//	
//	/**
//	 * 获取一级菜单
//	 * @return
//	 */
//	@RequestMapping(value="/menu",method=RequestMethod.GET)
//	public String getCreateMenu(CreateMenu menu){
//		
//		List<CreateMenu> createMenu = menuService.getCreateMenu(menu);
//		System.out.println("菜单" + createMenu);
//		return "";
//	}
	
}
