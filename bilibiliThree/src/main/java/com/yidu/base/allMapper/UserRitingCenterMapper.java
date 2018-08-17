package com.yidu.base.allMapper;

import com.yidu.base.allEntity.UserRitingCenter;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface UserRitingCenterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRitingCenter record);

    UserRitingCenter selectByPrimaryKey(Integer id);

    List<UserRitingCenter> selectAll();

    int updateByPrimaryKey(UserRitingCenter record);
}