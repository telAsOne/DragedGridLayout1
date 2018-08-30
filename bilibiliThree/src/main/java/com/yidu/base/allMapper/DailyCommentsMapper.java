package com.yidu.base.allMapper;

import com.yidu.base.allEntity.DailyComments;
import java.util.List;

public interface DailyCommentsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DailyComments record);

    DailyComments selectByPrimaryKey(Integer id);

    List<DailyComments> selectAll();

    int updateByPrimaryKey(DailyComments record);
}