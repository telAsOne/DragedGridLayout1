package com.yidu.base.allMapper;

import com.yidu.base.allEntity.Painting;
import java.util.List;

public interface PaintingMapper {
    int deleteByPrimaryKey(Integer paintingId);

    int insert(Painting record);

    Painting selectByPrimaryKey(Integer paintingId);

    List<Painting> selectAll();

    int updateByPrimaryKey(Painting record);
}