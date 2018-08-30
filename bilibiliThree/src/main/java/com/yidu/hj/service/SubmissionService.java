package com.yidu.hj.service;
import com.yidu.base.allEntity.Columns;
import com.yidu.base.allEntity.Draft;
public interface SubmissionService {
	/**
	 * 
	 * 方法描述: 新增专栏
	 * 业务逻辑说明: TODO(总结性的归纳方法业务逻辑) 
	 * 1、处理…………<br/>
	 * 2、处理…………<br/>
	 * 3、处理…………<br/>
	 * @Title: insertColumn 
	 * @date 2018年8月29日 上午11:08:14
	 * @author Administrator
	 * @modifier 无
	 * @modifydate 无
	 * @param columns
	 * @return
	 */
	public int insertColumn(Columns columns);
	
	/**
	 * 
	 * 方法描述: 根据用户id修改专栏内容地址
	 * 业务逻辑说明: TODO(总结性的归纳方法业务逻辑) 
	 * 1、处理…………<br/>
	 * 2、处理…………<br/>
	 * 3、处理…………<br/>
	 * @Title: getIdUpdateContentAddress 
	 * @date 2018年8月29日 下午5:33:26
	 * @author Administrator
	 * @modifier 无
	 * @modifydate 无
	 * @param c
	 */
	public int getIdUpdateContentAddress(Columns c);
	
	/**
	 * 
	 * 方法描述: 新增草稿
	 * 业务逻辑说明: TODO(总结性的归纳方法业务逻辑) 
	 * 1、处理…………<br/>
	 * 2、处理…………<br/>
	 * 3、处理…………<br/>
	 * @Title: insertDraft 
	 * @date 2018年8月30日 下午4:41:05
	 * @author Administrator
	 * @modifier 无
	 * @modifydate 无
	 * @param draft
	 * @return
	 */
	public int insertDraft(Draft draft);
}
