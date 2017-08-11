package com.youu.youu.manager.dao;

import com.youu.youu.manager.bean.TScenicreview;
import java.util.List;

public interface TScenicreviewMapper {
    int insert(TScenicreview record);

    List<TScenicreview> selectAll();
}