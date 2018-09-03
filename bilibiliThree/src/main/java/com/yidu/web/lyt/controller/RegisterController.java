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
public class RegisterController {

	@Autowired(required = true)
	private UserServer userServer;
	
	/**
	 * 装校验错误提示信息的集合
	 */
	Map<String, String> error = new HashMap<String, String>();
	
	/**
	 * 注册
	 * @param user 用户
	 * @return
	 */
	@RequestMapping(value="/additionUser")
	public String additionUser(UserInfo user){
		
		userServer.increaseUser(user);
		return "lyt/userLogin";
	}

	/**
	 * 新增用户
	 * @param user 用户
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/userRegister")
	public Map<String, String> userRegister(HttpServletRequest request){
		
		//用户名
		String userName = request.getParameter("userName");
		//密码
		String userPass = request.getParameter("userPass");

		//判断用户名是否为空
		if (!(userName == null || userName.equals(""))) {
			//判断用户名的长度是否小于2
			if (userName.length() <= 2) {
				error.put("userName", "用户名过短，不允许注册！");
			//判断用户名的长度是否大于16
			}else if(userName.length() > 16){
				error.put("userName", "您的用户名或用户笔名过长，不允许注册！");
			//判断用户名的格式是否正确
			}else if(!(userName.matches("^[a-zA-Z0-9_-]{3,16}$"))){
				error.put("userName", "用户名为系统禁止的标识！");
			}else {
				//查询用户名是否重复
				int selectUser = userServer.selectUser(userName);
				//判断查出的值是否大于1
				if (selectUser >= 1) {
					error.put("userName", "该昵称已被他人使用");
				}else {
					error.put("userName", "");
				}
			}
		}else {
			error.put("userName", "请告诉我您的昵称吧");
		}

		//判断密码是否为空
		if (!(userPass == null || userPass.equals(""))) {
			//判断密码的长度是否小于6
			if (userPass.length() < 6) {
				error.put("userPass", "密码不能小于6个字符");
			//判断密码的长度是否大于16
			}else if(userPass.length() > 16){
				error.put("userPass", "密码不能大于16个字符");
			//判断密码的格式是否正确
			}else if (!(userPass.matches("^[a-zA-Z0-9]{6,16}$"))) {
				error.put("userPass", "密码为系统禁止的标识！");
			}else {
				error.put("userPass", "");
			}
		}else {
			error.put("userPass", "请告诉我您的密码吧");
		}

		return error;

	}

	/**
	 * 检查用户输入的验证码与后台生成的是否一致
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/verifyAuthCode")
	public Map<String, String> verifyAuthCode(HttpServletRequest request){

		//获取来自注册页面的用户输入的验证码
		String parameter = request.getParameter("importAuthCode");
		//获取验证码控制器层生成的验证码
		String attribute = (String) request.getSession().getAttribute("checkCode");
		//手机号
		String userPhone = request.getParameter("userPhone");

		//判断用户输入的验证码与生成的验证码是否一致
		if (parameter.equals(attribute)) {
			//判断联系方式是否为空
			if (!(userPhone == null || userPhone.equals(""))) {
				//判断联系方式的格式是否正确
				if(!(userPhone.matches("^[1][3,4,5,7,8][0-9]{9}$"))){
					error.put("userPhone", "联系方式的格式有误");
				}else {
					//查询手机号是否已注册
					int phoneExist = userServer.isPhoneExist(userPhone);
					//判断查出的值是否大于1
					if (phoneExist >= 1) {
						error.put("userPhone", "手机号已注册");
					}else {
						error.put("userPhone", "");
					}
				}
			}else {
				error.put("userPhone", "请填写手机号");
			}
		//判断用户输入的验证码是否等于生成的验证码或者用户输入的验证码是否为空
		}else if((!parameter.equals(attribute)) || parameter.equals("")){
			//返回错误信息
			error.put("userPhone", "z");
		}
		return error;
	}
}
