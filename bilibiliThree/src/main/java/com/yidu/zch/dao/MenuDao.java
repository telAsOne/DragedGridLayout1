package com.yidu.zch.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yidu.zch.entity.CreateMenu;

/**
 * 创造中心菜单查询
 * @author Z
 *
 */
@Repository
public interface MenuDao {
	
	/**
	 * 查询一级菜单
	 * @param menu
	 */
	public List<CreateMenu> getCreateMenu(CreateMenu menu);
}