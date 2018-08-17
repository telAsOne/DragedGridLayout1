package com.yidu.base.allMapper;

import com.yidu.base.allEntity.Attention;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface AttentionMapper {
    int deleteByPrimaryKey(Integer aId);

    int insert(Attention record);

    Attention selectByPrimaryKey(Integer aId);

    List<Attention> selectAll();

    int updateByPrimaryKey(Attention record);
}