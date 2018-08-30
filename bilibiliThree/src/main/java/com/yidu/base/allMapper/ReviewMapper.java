package com.yidu.base.allMapper;

import com.yidu.base.allEntity.Review;
import java.util.List;

public interface ReviewMapper {
    int deleteByPrimaryKey(Integer reviewId);

    int insert(Review record);

    Review selectByPrimaryKey(Integer reviewId);

    List<Review> selectAll();

    int updateByPrimaryKey(Review record);
}