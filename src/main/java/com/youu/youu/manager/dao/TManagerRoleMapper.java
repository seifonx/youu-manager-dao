package com.youu.youu.manager.dao;

import com.youu.youu.manager.bean.TManagerRole;
import java.util.List;

public interface TManagerRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TManagerRole record);

    TManagerRole selectByPrimaryKey(Integer id);

    List<TManagerRole> selectAll();

    int updateByPrimaryKey(TManagerRole record);
}