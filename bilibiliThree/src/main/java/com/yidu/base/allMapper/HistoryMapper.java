package com.yidu.base.allMapper;

import com.yidu.base.allEntity.History;
import java.util.List;

public interface HistoryMapper {
    int deleteByPrimaryKey(Integer hId);

    int insert(History record);

    History selectByPrimaryKey(Integer hId);

    List<History> selectAll();

    int updateByPrimaryKey(History record);
}