package com.yidu.base.allMapper;

import com.yidu.base.allEntity.Reply;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface ReplyMapper {
    int deleteByPrimaryKey(Integer replyId);

    int insert(Reply record);

    Reply selectByPrimaryKey(Integer replyId);

    List<Reply> selectAll();

    int updateByPrimaryKey(Reply record);
}