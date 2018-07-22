package com.yidu.base.allMapper;

import com.yidu.base.allEntity.Comicchapter;
import java.util.List;

public interface ComicchapterMapper {
    int deleteByPrimaryKey(Integer ccId);

    int insert(Comicchapter record);

    Comicchapter selectByPrimaryKey(Integer ccId);

    List<Comicchapter> selectAll();

    int updateByPrimaryKey(Comicchapter record);
}