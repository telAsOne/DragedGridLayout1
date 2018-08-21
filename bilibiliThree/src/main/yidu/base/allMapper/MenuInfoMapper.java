package com.yidu.base.allMapper;

import com.yidu.base.allEntity.MenuInfo;
import java.util.List;

public interface MenuInfoMapper {
    int deleteByPrimaryKey(Integer menuId);

    int insert(MenuInfo record);

    MenuInfo selectByPrimaryKey(Integer menuId);

    List<MenuInfo> selectAll();

    int updateByPrimaryKey(MenuInfo record);
}