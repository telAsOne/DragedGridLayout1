package com.yidu.jyz.service;

import java.util.List;
import java.util.Map;

import com.yidu.base.allEntity.Video;
import com.yidu.jyz.fromBean.VideoAllFromBean;
import com.yidu.jyz.fromBean.VideoFormBean;

public interface VideoService {
	int deleteByPrimaryKey(Integer videoId);

	int insert(Video record);

	Video selectByPrimaryKey(Integer videoId);

	List<Video> selectAll();

	int updateByPrimaryKey(Video record);

	public List<VideoAllFromBean> queryLabelAll();

	public List<VideoFormBean> getVideoByLabelId(Map<Object, Object> id);
}
