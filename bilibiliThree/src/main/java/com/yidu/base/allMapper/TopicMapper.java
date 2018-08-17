package com.yidu.base.allMapper;

import com.yidu.base.allEntity.Topic;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface TopicMapper {
    int deleteByPrimaryKey(Integer topicId);

    int insert(Topic record);

    Topic selectByPrimaryKey(Integer topicId);

    List<Topic> selectAll();

    int updateByPrimaryKey(Topic record);
}