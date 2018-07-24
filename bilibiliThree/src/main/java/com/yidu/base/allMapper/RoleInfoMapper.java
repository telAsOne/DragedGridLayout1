package com.yidu.base.allMapper;

import com.yidu.base.allEntity.RoleInfo;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface RoleInfoMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(RoleInfo record);

    RoleInfo selectByPrimaryKey(Integer roleId);

    List<RoleInfo> selectAll();

    int updateByPrimaryKey(RoleInfo record);
}