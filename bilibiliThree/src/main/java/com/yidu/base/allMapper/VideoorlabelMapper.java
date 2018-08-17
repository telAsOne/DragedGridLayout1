package com.yidu.base.allMapper;

import com.yidu.base.allEntity.Videoorlabel;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface VideoorlabelMapper {
    int deleteByPrimaryKey(Integer volId);

    int insert(Videoorlabel record);

    Videoorlabel selectByPrimaryKey(Integer volId);

    List<Videoorlabel> selectAll();

    int updateByPrimaryKey(Videoorlabel record);
}