package com.yidu.base.allMapper;

import com.yidu.base.allEntity.Video;
import com.yidu.jyz.fromBean.VideoAllFromBean;
import com.yidu.jyz.fromBean.VideoFormBean;

import java.util.List;
import java.util.Map;

public interface VideoMapper {
    int deleteByPrimaryKey(Integer videoId);

    int insert(Video record);

    Video selectByPrimaryKey(Integer videoId);

    List<Video> selectAll();

    int updateByPrimaryKey(Video record);
    
    public List<VideoAllFromBean> queryLabelAll();
    
    public List<VideoFormBean> getVideoByLabelId(Map<Object, Object> id);
}