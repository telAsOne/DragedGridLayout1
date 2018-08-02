package com.yidu.jyz.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yidu.base.allEntity.SlideImg;
import com.yidu.base.allMapper.SlideImgMapper;
import com.yidu.jyz.admin.service.SlideImgService;

@Service
public class SlideImgServiceImpl implements SlideImgService{
	
	@Autowired
	public SlideImgMapper mapper;
	
	public int insert(SlideImg record) {
		int insert = mapper.insert(record);
		return insert;
	}

	public SlideImg selectByPrimaryKey(Integer slideId) {
		SlideImg selectByPrimaryKey = mapper.selectByPrimaryKey(slideId);
		return selectByPrimaryKey;
	}

	public List<SlideImg> selectAll() {
		List<SlideImg> selectAll = mapper.selectAll();
		return selectAll;
	}

	public int deleteByPrimaryKey(Integer slideId) {
		int deleteByPrimaryKey = mapper.deleteByPrimaryKey(slideId);
		return deleteByPrimaryKey;
	}

	public int updateByPrimaryKey(SlideImg record) {
		int updateByPrimaryKey = mapper.updateByPrimaryKey(record);
		
		return updateByPrimaryKey;
	}

	public List<SlideImg> selectLookImg() {
		List<SlideImg> selectLookImg = mapper.selectLookImg();
		return selectLookImg;
	}

}
