package com.yidu.base.allMapper;

import com.yidu.base.allEntity.Videolabel;
import java.util.List;

public interface VideolabelMapper {
    int deleteByPrimaryKey(Integer vlId);

    int insert(Videolabel record);

    Videolabel selectByPrimaryKey(Integer vlId);

    List<Videolabel> selectAll();

    int updateByPrimaryKey(Videolabel record);
}