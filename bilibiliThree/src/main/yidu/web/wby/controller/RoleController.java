package com.yidu.web.wby.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yidu.wby.entity.Role;
import com.yidu.wby.service.RoleService;

/**
 * 角色控制器类
 * @author wby
 * 2018年7月19日
 */
@Controller
public class RoleController {
	@Autowired
	private RoleService service;
	/**
	 * 查询所有角色
	 * @param roleName 角色名称
	 * @return 角色集合
	 */
	@ResponseBody
	@RequestMapping(value="/getRoles")
	public List<Role> getAllRole(@RequestParam("roleName") String roleName){
		Role role=new Role();
		System.out.println("role:"+role);
		if(roleName.equals("null")) roleName=null;
		List<Role> allRole = service.getAllRole(role);
		System.out.println(allRole);
		return allRole;
	}
}
