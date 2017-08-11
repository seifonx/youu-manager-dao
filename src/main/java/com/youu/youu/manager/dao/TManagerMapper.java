package com.youu.youu.manager.dao;

import com.youu.youu.manager.bean.TManager;
import java.util.List;

public interface TManagerMapper {
    int deleteByPrimaryKey(Integer phoneNum);

    int insert(TManager record);

    TManager selectByPrimaryKey(Integer phoneNum);

    List<TManager> selectAll();

    int updateByPrimaryKey(TManager record);
}