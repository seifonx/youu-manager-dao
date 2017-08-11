package com.youu.youu.manager.dao;

import com.youu.youu.manager.bean.TScenicTicket;
import java.util.List;

public interface TScenicTicketMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TScenicTicket record);

    TScenicTicket selectByPrimaryKey(Integer id);

    List<TScenicTicket> selectAll();

    int updateByPrimaryKey(TScenicTicket record);
}