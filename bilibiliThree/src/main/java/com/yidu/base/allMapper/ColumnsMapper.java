package com.yidu.base.allMapper;

import com.yidu.base.allEntity.Columns;
import java.util.List;

public interface ColumnsMapper {
    int deleteByPrimaryKey(Integer columnId);

    int insert(Columns record);

    Columns selectByPrimaryKey(Integer columnId);

    List<Columns> selectAll();

    int updateByPrimaryKey(Columns record);
}