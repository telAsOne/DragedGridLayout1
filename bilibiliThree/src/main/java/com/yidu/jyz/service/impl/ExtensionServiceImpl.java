/*
 * @(#)ExtensionServiceImpl.java V2.0 2018骞�8鏈�30鏃�
 * XXXX	鐗堟潈鎵�鏈�
 * 
 * 鏂囦欢鎻忚堪...
 *
 * @Title: ExtensionServiceImpl.java 
 * @Package com.yidu.jyz.service.impl 
 * @author 閫嶉仴
 * @date 2018骞�8鏈�30鏃� 涓嬪崍5:28:47
 * @version V2.0
 * 鍘嗗彶鐗堟湰锛�
 * 	1. 銆�2018骞�8鏈�30鏃ャ�� 鍒涘缓鏂囦欢   by 閫嶉仴
 */
package com.yidu.jyz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yidu.base.allEntity.Extension;
import com.yidu.base.allMapper.ExtensionMapper;
import com.yidu.jyz.service.ExtensionService;

/** 
 * TODO 鎺ㄥ箍妯″潡涓氬姟绫�
 * 
 * @ClassName: ExtensionServiceImpl 
 * @author 姹熸壃姝�
 * @date 2018骞�8鏈�30鏃� 涓嬪崍5:28:47
 * @version V1.0 
 *  
 */
@Service
public class ExtensionServiceImpl implements ExtensionService{
	
	@Autowired
	private ExtensionMapper mapper;
	
	public int deleteByPrimaryKey(Integer id) {
		int deleteByPrimaryKey = mapper.deleteByPrimaryKey(id);
		return deleteByPrimaryKey;
	}

	public int insert(Extension record) {
		int insert = mapper.insert(record);
		return insert;
	}

	public Extension selectByPrimaryKey(Integer id) {
		Extension selectByPrimaryKey = mapper.selectByPrimaryKey(id);
		return selectByPrimaryKey;
	}

	public List<Extension> selectAll() {
		List<Extension> selectAll = mapper.selectAll();
		return selectAll;
	}

	public int updateByPrimaryKey(Extension record) {
		int updateByPrimaryKey = mapper.updateByPrimaryKey(record);
		return updateByPrimaryKey;
	}

}
