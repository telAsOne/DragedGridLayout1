package com.yidu.base.allMapper;

import com.yidu.base.allEntity.Video;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface VideoMapper {
    int deleteByPrimaryKey(Integer videoId);

    int insert(Video record);

    Video selectByPrimaryKey(Integer videoId);

    List<Video> selectAll();

    int updateByPrimaryKey(Video record);
}