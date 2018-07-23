package com.yidu.base.allMapper;

import com.yidu.base.allEntity.UserChat;
import java.util.List;

public interface UserChatMapper {
    int deleteByPrimaryKey(Integer userchatId);

    int insert(UserChat record);

    UserChat selectByPrimaryKey(Integer userchatId);

    List<UserChat> selectAll();

    int updateByPrimaryKey(UserChat record);
}