package com.yidu.wby.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yidu.wby.entity.Menu;

/**
 * 菜单接口类
 * @author wby
 * 2018年7月12日
 */
@Repository
public interface AdminDao {
	/**
	 * 查询一级菜单
	 * @param menu 菜单
	 * @return 一级菜单集合
	 */
	public List<Menu> getMenuList(Menu menu);
	
	/**
	 * 根据上级ID查询二级菜单
	 * @param pid 上级ID
	 * @return 二级菜单集合
	 */
	public List<Menu> getSecondMenu(int pid);
	
	
}
