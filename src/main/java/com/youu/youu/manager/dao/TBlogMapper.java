package com.youu.youu.manager.dao;

import com.youu.youu.manager.bean.TBlog;
import java.util.List;

public interface TBlogMapper {
    int deleteByPrimaryKey(Integer blogId);

    int insert(TBlog record);

    TBlog selectByPrimaryKey(Integer blogId);

    List<TBlog> selectAll();

    int updateByPrimaryKey(TBlog record);
}