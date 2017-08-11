package com.youu.youu.manager.dao;

import com.youu.youu.manager.bean.TAdpic;
import java.util.List;

public interface TAdpicMapper {
    int insert(TAdpic record);

    List<TAdpic> selectAll();
}