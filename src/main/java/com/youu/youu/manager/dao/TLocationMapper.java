package com.youu.youu.manager.dao;

import com.youu.youu.manager.bean.TLocation;
import java.util.List;

public interface TLocationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TLocation record);

    TLocation selectByPrimaryKey(Integer id);

    List<TLocation> selectAll();

    int updateByPrimaryKey(TLocation record);
}