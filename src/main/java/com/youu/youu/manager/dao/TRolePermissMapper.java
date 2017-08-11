package com.youu.youu.manager.dao;

import com.youu.youu.manager.bean.TRolePermiss;
import java.util.List;

public interface TRolePermissMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TRolePermiss record);

    TRolePermiss selectByPrimaryKey(Integer id);

    List<TRolePermiss> selectAll();

    int updateByPrimaryKey(TRolePermiss record);
}