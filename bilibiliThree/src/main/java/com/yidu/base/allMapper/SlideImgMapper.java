package com.yidu.base.allMapper;

import com.yidu.base.allEntity.SlideImg;
import java.util.List;

public interface SlideImgMapper {
    int deleteByPrimaryKey(Integer slideId);

    int insert(SlideImg record);

    SlideImg selectByPrimaryKey(Integer slideId);

    List<SlideImg> selectAll();

    int updateByPrimaryKey(SlideImg record);
    
    List<SlideImg> selectLookImg();
}