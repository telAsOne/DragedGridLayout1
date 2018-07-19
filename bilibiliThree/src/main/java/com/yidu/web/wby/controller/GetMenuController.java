package com.yidu.web.wby.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yidu.wby.entity.Menu;
import com.yidu.wby.service.AdminService;


/**
 * 菜单控制器类
 * @author Administrator
 */
@Controller
public class GetMenuController {
	@Autowired
	private AdminService service;
	
	/**
	 * 查询所有一级菜单
	 * @param session 拿到用户信息
	 * @return 返回到主页
	 */
	@RequestMapping(value="/menu",method=RequestMethod.GET)
	public String getMenuList(HttpSession session){
		System.out.println(123);
		session.getAttribute("userInfo");
		Menu menu=new Menu();
		menu.setAdminId(1);
		List<Menu> menuList = service.getMenuList(menu);
		session.setAttribute("menuList", menuList);
		 return "index";
	}
	
	/**
	 * 查询二级菜单
	 * @param pid 上级ID
	 * @return 二级菜单集合
	 */
	@ResponseBody
	@RequestMapping(value="/menu/{pid}")
	public List<Menu> getSecongMenu(@PathVariable("pid") int pid){
		List<Menu> secondMenu = service.getSecondMenu(pid);
		return secondMenu;
	}
	
}
