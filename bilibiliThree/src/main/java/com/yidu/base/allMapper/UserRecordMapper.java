package com.yidu.base.allMapper;

import com.yidu.base.allEntity.UserRecord;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface UserRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRecord record);

    UserRecord selectByPrimaryKey(Integer id);

    List<UserRecord> selectAll();

    int updateByPrimaryKey(UserRecord record);
}