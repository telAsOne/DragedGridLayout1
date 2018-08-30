package com.yidu.base.allMapper;

import com.yidu.base.allEntity.UserChatDetails;
import java.util.List;

public interface UserChatDetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserChatDetails record);

    UserChatDetails selectByPrimaryKey(Integer id);

    List<UserChatDetails> selectAll();

    int updateByPrimaryKey(UserChatDetails record);
}