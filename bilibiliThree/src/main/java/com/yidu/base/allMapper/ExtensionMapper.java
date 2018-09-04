package com.yidu.base.allMapper;

import com.yidu.base.allEntity.Extension;
import java.util.List;

public interface ExtensionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Extension record);

    Extension selectByPrimaryKey(Integer id);

    List<Extension> selectAll();

    int updateByPrimaryKey(Extension record);
}