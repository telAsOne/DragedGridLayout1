package com.yidu.wby.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yidu.wby.dao.AdminDao;
import com.yidu.wby.entity.Menu;
import com.yidu.wby.service.AdminService;

/**
 * 菜单逻辑实现类
 * @author wby
 * 2018年7月12日
 */
@Service
public class AdminServiceImpl implements AdminService{
	@Autowired(required=true)
	private AdminDao dao;
	
	public List<Menu> getMenuList(Menu menu) {
		List<Menu> menuList = dao.getMenuList(menu);
		return menuList;
	}

	public List<Menu> getSecondMenu(int pid) {
		List<Menu> secondMenu = dao.getSecondMenu(pid);
		return secondMenu;
	}

}
