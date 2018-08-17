package com.yidu.base.allMapper;

import com.yidu.base.allEntity.Comicoreview;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface ComicoreviewMapper {
    int deleteByPrimaryKey(Integer crId);

    int insert(Comicoreview record);

    Comicoreview selectByPrimaryKey(Integer crId);

    List<Comicoreview> selectAll();

    int updateByPrimaryKey(Comicoreview record);
}