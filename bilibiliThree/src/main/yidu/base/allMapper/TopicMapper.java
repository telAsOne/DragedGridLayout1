package com.yidu.base.allMapper;

import com.yidu.base.allEntity.Topic;
import java.util.List;

public interface TopicMapper {
    int deleteByPrimaryKey(Integer topicId);

    int insert(Topic record);

    Topic selectByPrimaryKey(Integer topicId);

    List<Topic> selectAll();

    int updateByPrimaryKey(Topic record);
}