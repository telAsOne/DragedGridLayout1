package com.yidu.web.lyt.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yidu.base.allEntity.UserInfo;
import com.yidu.lyt.service.UserServer;

@Controller
public class LoginController {

	@Autowired
	private UserServer userServer;

	/**
	 * 用户登录
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/userLogin")
	public Map<String, String> userLogin(HttpServletRequest request){

		Map<String, String> map = new HashMap<String, String>();

		//获取用户输入的手机号
		String userPhone = request.getParameter("userPhone");
		//获取用户输入的密码
		String userPass = request.getParameter("userPass");
		
		//判断手机号和密码是否都为空
		if ((userPhone == null || userPhone == "") && (userPass == null || userPass == "")){
			map.put("phoneAndPass", "账号或密码错误");
		//判断手机号是否为空
		}else if (userPhone == null || userPhone == "") {
			map.put("userPhone", "请输入注册时用的邮箱或者手机号呀");
		//判断密码是否为空
		}else if (userPass == null || userPass == "") {
			map.put("userPass", "喵，你没输入密码么？");
		}else {
			//查询手机号是否存在
			int phoneExist = userServer.isPhoneExist(userPhone);
			//判断查询的值是否小于等于0并且手机号不为空
			if (phoneExist <= 0 && (userPhone != null || userPhone != "")) {
				map.put("phoneAndPass", "账号或密码错误");
			}else{
				//根据手机号查询用户信息
				UserInfo selectListUser = userServer.selectListUser(userPhone);
				//根据查询到的用户信息获取用户密码
				String pass = selectListUser.getUserPsw();
				//判断用户输入的密码和查询到的是否一致
				if (!userPass.equals(pass)) {
					map.put("phoneAndPass", "账号或密码错误");
				}else {
					map.put("skip", "1");
					request.getSession().setAttribute("userMessage", selectListUser);
				}
			}
		}

		return map;
	}

}
