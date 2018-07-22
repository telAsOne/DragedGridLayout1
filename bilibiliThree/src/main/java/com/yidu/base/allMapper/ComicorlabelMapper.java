package com.yidu.base.allMapper;

import com.yidu.base.allEntity.Comicorlabel;
import java.util.List;

public interface ComicorlabelMapper {
    int deleteByPrimaryKey(Integer colId);

    int insert(Comicorlabel record);

    Comicorlabel selectByPrimaryKey(Integer colId);

    List<Comicorlabel> selectAll();

    int updateByPrimaryKey(Comicorlabel record);
}