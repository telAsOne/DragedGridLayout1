package com.yidu.springUtils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtil {
	private SpringUtil(){};
	private static ApplicationContext ctx;
	static{
		ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	public static <T> T vessel(Class<T> clazz){
		T bean = ctx.getBean(clazz);
		return bean;
	}
	
	public static <T> T vessel(String bean){
		T bean2 = (T) ctx.getBean(bean);
		return bean2;
	}
}
