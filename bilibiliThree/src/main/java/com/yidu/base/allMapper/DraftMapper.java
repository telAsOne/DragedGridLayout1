package com.yidu.base.allMapper;

import com.yidu.base.allEntity.Draft;
import java.util.List;

public interface DraftMapper {
    int deleteByPrimaryKey(Integer draftId);

    int insert(Draft record);

    Draft selectByPrimaryKey(Integer draftId);

    List<Draft> selectAll();

    int updateByPrimaryKey(Draft record);
}