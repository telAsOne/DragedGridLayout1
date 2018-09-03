package com.yidu.web.lyt.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 短信验证码
 * @author TING
 */
@Controller
public class NoteVerifyController {
	
	/**
	 * 得到用户输入的短信验证码
	 */
	String note;
	
	/**
	 * 得到随机验证码
	 */
	int phone_code = 2564;

	@ResponseBody
	@RequestMapping(value="/noteVerifyController")
	public int noteVerify(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

		/*// 设置响应编码
		response.setCharacterEncoding("UTF-8");
		// 得到用户注册的手机号码
		String phone = request.getParameter("phoneNumber");
		//得到用户输入的短信验证码
		note = request.getParameter("noteVerify");
		// 得到随机验证码
		phone_code = (int) ((Math.random() * 9 + 1) * 100000);
		// 访问发送验证码的网址
		String str = "http://106.ihuyi.com/webservice/sms.php?method=Submit&account=C55971897&password=00662bf775998dcc63991eed94e82b51&mobile=" + phone + "&content=";
		// 拼接发送内容
		str = str + "您的验证码是：" + phone_code + "。请不要把验证码泄露给其他人。";
		// 得到URL
		URL url = new URL(str);
		System.out.println(phone_code);
		// 得到URL连接
		URLConnection connection = url.openConnection();
		// 得到发送验证码
		connection.getInputStream();*/
		// 响应给JSON
		return phone_code;
		
	}
	
	@ResponseBody
	@RequestMapping(value="/messageVerify")
	public Map<String, String> messageVerify(HttpServletRequest request){
		
		Map<String, String> map = new HashMap<String, String>();
		//获取用户输入的短信验证码
		String noteVerify = request.getParameter("noteVerify");
		//将生成的短信验证码转成String类型
		String phoneCode = String.valueOf(phone_code);
		//判断用户输入的短信验证码和生成的是否一致
		if (phoneCode.equals(noteVerify)) {
			map.put("noteVerify", "");
		}else {
			map.put("noteVerify", "您输入的短信验证码有误");
		}
		
		return map;
	}

}
