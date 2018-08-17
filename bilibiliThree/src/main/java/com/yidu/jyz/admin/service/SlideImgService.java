package com.yidu.jyz.admin.service;

import java.util.List;

import com.yidu.base.allEntity.SlideImg;

public interface SlideImgService {
	public int insert(SlideImg record);

	public SlideImg selectByPrimaryKey(Integer slideId);

	public List<SlideImg> selectAll();
	
	int deleteByPrimaryKey(Integer slideId);
	
    int updateByPrimaryKey(SlideImg record);
    

    
    List<SlideImg> selectLookImg();
}
