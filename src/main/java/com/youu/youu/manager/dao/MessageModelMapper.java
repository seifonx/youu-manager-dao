package com.youu.youu.manager.dao;

import com.youu.youu.manager.bean.MessageModel;
import java.util.List;

public interface MessageModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MessageModel record);

    MessageModel selectByPrimaryKey(Integer id);

    List<MessageModel> selectAll();

    int updateByPrimaryKey(MessageModel record);
}