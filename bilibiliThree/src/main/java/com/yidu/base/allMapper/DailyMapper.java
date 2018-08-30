package com.yidu.base.allMapper;

import com.yidu.base.allEntity.Daily;
import java.util.List;

public interface DailyMapper {
    int deleteByPrimaryKey(Integer dailyId);

    int insert(Daily record);

    Daily selectByPrimaryKey(Integer dailyId);

    List<Daily> selectAll();

    int updateByPrimaryKey(Daily record);
}