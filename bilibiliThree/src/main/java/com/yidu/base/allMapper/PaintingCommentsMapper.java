package com.yidu.base.allMapper;

import com.yidu.base.allEntity.PaintingComments;
import java.util.List;

public interface PaintingCommentsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PaintingComments record);

    PaintingComments selectByPrimaryKey(Integer id);

    List<PaintingComments> selectAll();

    int updateByPrimaryKey(PaintingComments record);
}