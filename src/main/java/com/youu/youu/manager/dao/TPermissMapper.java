package com.youu.youu.manager.dao;

import com.github.abel533.mapper.Mapper;
import com.youu.youu.manager.bean.TPermiss;

import java.util.List;

public interface TPermissMapper extends Mapper<TPermiss> {
    int deleteByPrimaryKey(Integer id);

    int insert(TPermiss record);

    TPermiss selectByPrimaryKey(Integer id);

    List<TPermiss> selectAll();

    int updateByPrimaryKey(TPermiss record);
}