package com.youu.youu.manager.dao;

import com.youu.youu.manager.bean.TScenicdetails;
import java.util.List;

public interface TScenicdetailsMapper {
    int deleteByPrimaryKey(Integer scenicId);

    int insert(TScenicdetails record);

    TScenicdetails selectByPrimaryKey(Integer scenicId);

    List<TScenicdetails> selectAll();

    int updateByPrimaryKey(TScenicdetails record);
}