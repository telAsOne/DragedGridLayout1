package com.yidu.jyz.service.impl;

import java.util.List;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yidu.base.allEntity.Video;
import com.yidu.base.allMapper.VideoMapper;
import com.yidu.jyz.fromBean.VideoAllFromBean;
import com.yidu.jyz.fromBean.VideoFormBean;
import com.yidu.jyz.service.VideoService;

@Service
public class VideoServiceImpl implements VideoService{
	
	@Autowired
	private VideoMapper mapper;
	
	public int deleteByPrimaryKey(Integer id) {
		int deleteByPrimaryKey = mapper.deleteByPrimaryKey(id);
		return deleteByPrimaryKey;
	}

	public int insert(Video record) {
		int insert = mapper.insert(record);
		return insert;
	}

	public Video selectByPrimaryKey(Integer id) {
		Video selectByPrimaryKey = mapper.selectByPrimaryKey(id);
		return selectByPrimaryKey;
	}

	public List<Video> selectAll() {
		List<Video> selectAll = mapper.selectAll();
		return selectAll;
	}

	public int updateByPrimaryKey(Video record) {
		int updateByPrimaryKey = mapper.updateByPrimaryKey(record);
		return updateByPrimaryKey;
	}

	public List<VideoAllFromBean> queryLabelAll() {
		List<VideoAllFromBean> queryLabelAll = mapper.queryLabelAll();
		return queryLabelAll;
	}

	public List<VideoFormBean> getVideoByLabelId(Map<Object, Object> id) {
		List<VideoFormBean> videoByLabelId = mapper.getVideoByLabelId( id);
		return videoByLabelId;
	}

}
