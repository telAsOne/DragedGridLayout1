package com.yidu.jyz.mapper;

import java.util.List;

import com.yidu.jyz.entity.Menu;



public interface Dao {
	/**
	 * 查询一级菜单
	 * @param menu
	 */
	public List<Menu> getCreateMenu();

}
