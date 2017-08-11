package com.youu.youu.manager.dao;

import com.github.abel533.mapper.Mapper;
import com.youu.youu.manager.bean.TUser;

import java.util.List;

import javax.persistence.Table;

public interface TUserMapper extends Mapper<TUser>{
    int deleteByPrimaryKey(Integer id);

    int insert(TUser record);

    TUser selectByPrimaryKey(Integer id);

    List<TUser> selectAll();

    int updateByPrimaryKey(TUser record);
}