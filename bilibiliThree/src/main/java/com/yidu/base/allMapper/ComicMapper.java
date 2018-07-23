package com.yidu.base.allMapper;

import com.yidu.base.allEntity.Comic;
import java.util.List;

public interface ComicMapper {
    int deleteByPrimaryKey(Integer comicId);

    int insert(Comic record);

    Comic selectByPrimaryKey(Integer comicId);

    List<Comic> selectAll();

    int updateByPrimaryKey(Comic record);
}