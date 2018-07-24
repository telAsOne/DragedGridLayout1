package com.yidu.base.allMapper;

import com.yidu.base.allEntity.UserInfo;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserInfo record);

    UserInfo selectByPrimaryKey(Integer userId);

    List<UserInfo> selectAll();

    int updateByPrimaryKey(UserInfo record);
}