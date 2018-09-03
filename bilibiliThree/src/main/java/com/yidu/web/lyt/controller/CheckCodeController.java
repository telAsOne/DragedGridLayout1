package com.yidu.web.lyt.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 验证码
 * @author TING
 *
 */
@Controller
public class CheckCodeController{

	private int width = 120;
	private int height = 60;
	
	/**
	 * 跳转至注册页面
	 * @return
	 */
	@RequestMapping(value="register")
	public String register(){
		// 真正跳转的网页是:WEB-INF/pages/lyt/userRegister.jsp
		return "lyt/userRegister";
	}
	
	/**
	 * 跳转至登录页面
	 * @return
	 */
	@RequestMapping(value="login")
	public String login(){
		return "lyt/userLogin";
	}
	
	/**
	 * 获取验证码
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value="/checkCodeController")
	@ResponseBody
	public void checkCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		//创建验证码图片
		BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		//创建背景
		Graphics gs = bufferedImage.getGraphics();
		setBackground(gs);
		//设置边框
		setBorder(gs);
		//绘制地图
		String checkCode = setRandomNumber((Graphics2D)gs);
		request.getSession().setAttribute("checkCode", checkCode);
		//设置干扰线
		setRandomLine(gs);
		//输出验证码
		response.setContentType("image/jpeg");
		OutputStream os = response.getOutputStream();
		ImageIO.write(bufferedImage, "jpg", os);
		//刷新
		os.flush();
		//关闭
		os.close();
	}
	
	/**
	 * 随机绘画字符
	 * @param gs
	 */
	private String setRandomNumber(Graphics2D gs) {
		String checkCode = "";
		int x = 5;
		int y = 27;
		gs.setColor(Color.BLACK);
		gs.setFont(new Font("微软雅黑", Font.BOLD , 28));
		String chars = "1234567890QWERTYUIOPASDFGHJKLZXCVBNM";
		for (int i = 0; i < 4; i++) {
			String value = chars.charAt(r.nextInt(chars.length())) + "";
			chars = chars.replace(value, "");
			checkCode += value;
			double angle = r.nextInt()%30 * Math.PI/180;
			gs.rotate(angle, x, y);
			gs.drawString(value, x, y);
			gs.rotate(-angle, x, y);
			x += 30;
		}
		return checkCode;
	}

	/**
	 * 设置干扰线
	 * @param gs
	 */
	private Random r = new Random();

	private void setRandomLine(Graphics gs) {
		for (int i = 0; i <7; i++) {
			int x1 =  r.nextInt(width);
			int y1 = r.nextInt(height);
			int x2 = r.nextInt(width);
			int y2 = r.nextInt(height);
			gs.drawLine(x1, y1, x2, y2);
		}
	}

	private void setBorder(Graphics gs) {
		gs.setColor(Color.WHITE);
		gs.drawRect(1, 1, width-2, height-2);
	}

	private void setBackground(Graphics gs) {
		gs.setColor(Color.WHITE);
		gs.fillRect(0, 0, width, height);
	}
}
