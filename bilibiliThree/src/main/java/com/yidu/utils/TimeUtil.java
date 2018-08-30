package com.yidu.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * TODO 对该类总结性的描述
 * 获得当前类
 * @ClassName: TileUtil 
 * @author 黄杰
 * @date 2018年8月30日 下午2:41:05
 * @version V1.0 
 *
 */
public class TimeUtil {
	private TimeUtil(){}
	private static Date date=null;
	/**
	 * 
	 * 方法描述: 得到当前时间
	 * 业务逻辑说明: TODO(总结性的归纳方法业务逻辑) 
	 * 1、处理…………<br/>
	 * 2、处理…………<br/>
	 * 3、处理…………<br/>
	 * @Title: Time 
	 * @date 2018年8月30日 下午3:29:42
	 * @author Administrator
	 * @modifier 无
	 * @modifydate 无
	 * @return date
	 */
	public static Date Time(){
		date=new Date(System.currentTimeMillis());
		return date;
	}
}
