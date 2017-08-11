package com.youu.youu.manager.dao;

import com.youu.youu.manager.bean.TCoupon;
import java.util.List;

public interface TCouponMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TCoupon record);

    TCoupon selectByPrimaryKey(Integer id);

    List<TCoupon> selectAll();

    int updateByPrimaryKey(TCoupon record);
}