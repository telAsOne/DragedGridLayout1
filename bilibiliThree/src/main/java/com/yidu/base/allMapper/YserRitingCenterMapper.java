package com.yidu.base.allMapper;

import com.yidu.base.allEntity.YserRitingCenter;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface YserRitingCenterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YserRitingCenter record);

    YserRitingCenter selectByPrimaryKey(Integer id);

    List<YserRitingCenter> selectAll();

    int updateByPrimaryKey(YserRitingCenter record);
}