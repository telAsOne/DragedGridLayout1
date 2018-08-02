package com.yidu.base.allMapper;

import com.yidu.base.allEntity.SystemMessage;
import java.util.List;

public interface SystemMessageMapper {
    int deleteByPrimaryKey(Integer stmId);

    int insert(SystemMessage record);

    SystemMessage selectByPrimaryKey(Integer stmId);

    List<SystemMessage> selectAll();

    int updateByPrimaryKey(SystemMessage record);
}