package com.youu.youu.manager.dao;

import com.youu.youu.manager.bean.TPermiss;
import java.util.List;

public interface TPermissMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TPermiss record);

    TPermiss selectByPrimaryKey(Integer id);

    List<TPermiss> selectAll();

    int updateByPrimaryKey(TPermiss record);
}