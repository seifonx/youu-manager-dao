package com.youu.youu.manager.dao;

import com.github.abel533.mapper.Mapper;
import com.youu.youu.manager.bean.TManagerRole;

import java.util.List;

public interface TManagerRoleMapper extends Mapper<TManagerRole> {
    int deleteByPrimaryKey(Integer id);

    int insert(TManagerRole record);

    TManagerRole selectByPrimaryKey(Integer id);

    List<TManagerRole> selectAll();

    int updateByPrimaryKey(TManagerRole record);
}