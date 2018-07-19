package com.yidu.web.wby.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yidu.wby.entity.Role;
import com.yidu.wby.entity.User;
import com.yidu.wby.service.UserService;

/**
 * 用户控制器类
 * @author Administrator
 */
@Controller
public class UserController {
	@Autowired
	private UserService service;

	/**
	 * 查询所有用户
	 * @param adminName 用户名
	 * @return 用户集合
	 */
	@ResponseBody
	@RequestMapping(value="/users")
	public List<User> getAllUser(@RequestParam("adminName") String adminName){
		//创建用户对象
		User user=new User();
		//判断用户名是否为空
		if(adminName.equals("null")) adminName=null;
		//调用查询所有用户方法
		List<User> allUser=service.getAllUser(user);
		return allUser;
	}

	/**
	 * 查询角色
	 * @param roleName 角色名称
	 * @return  所有角色
	 */
	@ResponseBody
	@RequestMapping(value="/roles")
	public List<Map<String, String>> getAllRoleList(@RequestParam("roleName") String roleName){
		//创建角色对象
		Role role=new Role();
		//判断角色名是否为空
		if(roleName.equals("null")) roleName=null;
		//调用查询角色的方法
		List<Role> roleList = service.getRoleList(role);
		//创建一个集合装map
		List<Map<String, String>> List=new ArrayList<Map<String,String>>();
		//循环遍历
		for (Role r : roleList) {
			//创建map对象
			Map<String, String> map=new HashMap<String, String>();
			map.put("id", r.getRoleId()+"");
			map.put("text", r.getRoleName());
			List.add(map);
		}
		return List;
	}

	/**
	 * 新增用户
	 * @param user 用户
	 * @return 新增是否成功
	 */
	@ResponseBody
	@RequestMapping(value="/addUser")
	public int addUser(@Valid User user){
		//创建角色对象
		Role role=new Role();
		//调用查询角色的方法
		List<Role> roleList = service.getRoleList(role);
		//判断用户里的角色是否等于集合里第一元素的角色名
		if(user.getRole().equals(roleList.get(0).getRoleName())){
			//设置角色ID为1
			user.setRoleId(1);
		}else{
			user.setRoleId(Integer.parseInt(user.getRole()));
		}
		//调用增加用户的方法
		int addUser = service.addUser(user);
		//调用增加用户角色的方法
		service.addAdminRole(user.getRoleId(), user.getAdminId());
		System.out.println("..."+user);
		return addUser;
	}

	/**
	 * 查询用户所属角色 
	 * @param adminId 用户ID
	 * @return 用户角色
	 */
	@ResponseBody
	@RequestMapping(value="/getRoleNameById")
	public Map<String, String> getUserById(@RequestParam("adminId") int adminId){
		String roleName = service.getRoleName(adminId);
		Map<String, String> map=new HashMap<String, String>();
		map.put("roleName", roleName);
		return map;
	}

	/**
	 * 根据用户ID修改用户信息
	 * @param adminId 用户ID
	 * @return 修改是否成功
	 */
	@ResponseBody
	@RequestMapping(value="/updateUserById")
	public void updateUser(@Valid User user,HttpServletResponse response){
		//创建角色对象
		Role role=new Role();
		//调用查询角色的方法
		List<Role> roleList = service.getRoleList(role);
		//设置一个布尔值变量
		boolean t=false;
		//循环遍历
		for (int i = 0; i < roleList.size(); i++) {
			//判断集合里的角色名是否与用户里的角色相等
			if(roleList.get(i).getRoleName().equals(user.getRole())){
				//重置用户里的角色ID
				user.setRoleId(roleList.get(i).getRoleId());
				//设置布尔值为真
				t=true;
				break;
			}
		}
		if(!t){
			user.setRoleId(Integer.parseInt(user.getRole()));
		}
		switch (Integer.parseInt(user.getAdminState())) {
		case 0:
			user.setAdminState("在职");
			break;
		case 1:
			user.setAdminState("停职");
			break;
		case 2:
			user.setAdminState("离职");
			break;
		}
		int updateUserById = service.updateUserById(user);
		int updateAdminRoleById = service.updateAdminRoleById(user);
		int temp=0;
		System.out.println(updateUserById+""+updateAdminRoleById);
		if(updateUserById>0&&updateAdminRoleById>0){
			temp=1;
		}
		try {
			response.getWriter().write(temp+"");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}



}
