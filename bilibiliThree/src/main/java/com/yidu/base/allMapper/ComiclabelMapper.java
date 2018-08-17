package com.yidu.base.allMapper;

import com.yidu.base.allEntity.Comiclabel;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface ComiclabelMapper {
    int deleteByPrimaryKey(Integer clId);

    int insert(Comiclabel record);

    Comiclabel selectByPrimaryKey(Integer clId);

    List<Comiclabel> selectAll();

    int updateByPrimaryKey(Comiclabel record);
}