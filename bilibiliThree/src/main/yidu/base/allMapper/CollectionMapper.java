package com.yidu.base.allMapper;

import com.yidu.base.allEntity.Collection;
import java.util.List;

public interface CollectionMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(Collection record);

    Collection selectByPrimaryKey(Integer cId);

    List<Collection> selectAll();

    int updateByPrimaryKey(Collection record);
}