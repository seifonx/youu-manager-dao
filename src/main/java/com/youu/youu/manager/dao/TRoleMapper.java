package com.youu.youu.manager.dao;

import com.github.abel533.mapper.Mapper;
import com.youu.youu.manager.bean.TRole;

import java.util.HashSet;

public interface TRoleMapper extends Mapper<TRole> {

	HashSet<String> selectRoleByManagerId(String manager);
	
	
	
}