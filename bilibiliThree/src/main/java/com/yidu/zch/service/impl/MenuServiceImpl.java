package com.yidu.zch.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yidu.zch.dao.MenuDao;
import com.yidu.zch.entity.CreateMenu;
import com.yidu.zch.service.MenuService;

/**
 * 创造中心菜单查询实现类
 * @author Z
 *
 */
@Service("menuService")
public class MenuServiceImpl implements MenuService{
	
	@Autowired
	private MenuDao menuDao;

	/**
	 * 获取一级菜单
	 */
	@Override
	public List<CreateMenu> getCreateMenuOne() {
		List<CreateMenu> menuList = menuDao.getCreateMenuOne();
		return menuList;
	}

}

