package com.yidu.wby.service;

import java.util.List;

import com.yidu.wby.entity.Menu;

/**
 * 菜单逻辑层接口
 * @author wby
 * 2018年7月12日
 */
public interface AdminService {
	
	public List<Menu> getMenuList(Menu menu);
	
	
	public List<Menu> getSecondMenu(int pid);
	
}
