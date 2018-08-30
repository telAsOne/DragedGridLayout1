package com.yidu.base.allMapper;

import com.yidu.base.allEntity.YserRitingCenter;
import java.util.List;

public interface YserRitingCenterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YserRitingCenter record);

    YserRitingCenter selectByPrimaryKey(Integer id);

    List<YserRitingCenter> selectAll();

    int updateByPrimaryKey(YserRitingCenter record);
}