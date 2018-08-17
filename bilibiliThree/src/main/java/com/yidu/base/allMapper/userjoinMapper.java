package com.yidu.base.allMapper;

import com.yidu.base.allEntity.userjoin;
import java.util.List;

public interface userjoinMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(userjoin record);

    userjoin selectByPrimaryKey(Integer id);

    List<userjoin> selectAll();

    int updateByPrimaryKey(userjoin record);
}