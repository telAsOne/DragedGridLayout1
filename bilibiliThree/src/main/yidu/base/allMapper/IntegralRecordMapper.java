package com.yidu.base.allMapper;

import com.yidu.base.allEntity.IntegralRecord;
import java.util.List;

public interface IntegralRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IntegralRecord record);

    IntegralRecord selectByPrimaryKey(Integer id);

    List<IntegralRecord> selectAll();

    int updateByPrimaryKey(IntegralRecord record);
}