package com.yidu.testMybatis;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yidu.jt.mapper.Daoa;
import com.yidu.jyz.entity.Menu;
import com.yidu.jyz.mapper.Dao;


public class Tets {
	
ApplicationContext ctx;
	
	@Before
	public void init(){
		//获取IOC容器
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	@After
	public void destory(){
		System.out.println("done..");
	}
	
	@Test
	public void test(){
		Dao e = (Dao)ctx.getBean("dao");
		List<Menu> createMenu = e.getCreateMenu();
		System.out.println(createMenu);
	}
	@Test
	public void test1(){
		Daoa e = (Daoa)ctx.getBean("daoa");
		List<Menu> createMenu = e.getCreateMenu();
		System.out.println(createMenu);
	}
}
