/*
 * @(#)ExtensionService.java V2.0 2018年8月30日
 * XXXX	版权所有
 * 
 * 文件描述...
 *
 * @Title: ExtensionService.java 
 * @Package com.yidu.jyz.service 
 * @author 逍遥
 * @date 2018年8月30日 下午4:08:39
 * @version V2.0
 * 历史版本：
 * 	1. 【2018年8月30日】 创建文件   by 逍遥
 */
package com.yidu.jyz.service;

import java.util.List;

import com.yidu.base.allEntity.Extension;

public interface ExtensionService {

    int deleteByPrimaryKey(Integer id);

    int insert(Extension record);

    Extension selectByPrimaryKey(Integer id);

    List<Extension> selectAll();

    int updateByPrimaryKey(Extension record);

}
