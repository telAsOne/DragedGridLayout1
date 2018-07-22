package com.yidu.base.allMapper;

import com.yidu.base.allEntity.adminorrole;
import java.util.List;

public interface adminorroleMapper {
    int deleteByPrimaryKey(Integer arId);

    int insert(adminorrole record);

    adminorrole selectByPrimaryKey(Integer arId);

    List<adminorrole> selectAll();

    int updateByPrimaryKey(adminorrole record);
}