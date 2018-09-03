package com.yidu.zch.service;

import java.util.List;

import com.yidu.zch.entity.CreateMenu;

/**
 * 创造中心菜单查询
 * @author 朱辞涵
 * @date 2018年7月12日
 */
public interface MenuService {
	
	/**
	 * 获取一级菜单
	 */
	public List<CreateMenu> getCreateMenuOne();
	
}
