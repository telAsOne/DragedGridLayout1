package com.yidu.base.allMapper;

import com.yidu.base.allEntity.AdminInfo;
import java.util.List;

public interface AdminInfoMapper {
    int deleteByPrimaryKey(Integer adminId);

    int insert(AdminInfo record);

    AdminInfo selectByPrimaryKey(Integer adminId);

    List<AdminInfo> selectAll();

    int updateByPrimaryKey(AdminInfo record);
}