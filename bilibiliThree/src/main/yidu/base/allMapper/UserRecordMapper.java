package com.yidu.base.allMapper;

import com.yidu.base.allEntity.UserRecord;
import java.util.List;

public interface UserRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRecord record);

    UserRecord selectByPrimaryKey(Integer id);

    List<UserRecord> selectAll();

    int updateByPrimaryKey(UserRecord record);
}