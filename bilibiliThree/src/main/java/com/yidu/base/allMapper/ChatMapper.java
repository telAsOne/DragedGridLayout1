package com.yidu.base.allMapper;

import com.yidu.base.allEntity.Chat;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface ChatMapper {
    int deleteByPrimaryKey(Integer chatId);

    int insert(Chat record);

    Chat selectByPrimaryKey(Integer chatId);

    List<Chat> selectAll();

    int updateByPrimaryKey(Chat record);
}