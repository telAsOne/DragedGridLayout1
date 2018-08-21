package com.yidu.base.allMapper;

import com.yidu.base.allEntity.Videoreview;
import java.util.List;

public interface VideoreviewMapper {
    int deleteByPrimaryKey(Integer vrId);

    int insert(Videoreview record);

    Videoreview selectByPrimaryKey(Integer vrId);

    List<Videoreview> selectAll();

    int updateByPrimaryKey(Videoreview record);
}