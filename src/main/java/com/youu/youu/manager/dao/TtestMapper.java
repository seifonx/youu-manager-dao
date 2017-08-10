package com.youu.youu.manager.dao;

import com.github.abel533.mapper.Mapper;
import com.youu.youu.manager.bean.Ttest;
import com.youu.youu.manager.bean.TtestExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TtestMapper extends Mapper<Ttest> {
    long countByExample(TtestExample example);

    int deleteByExample(TtestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ttest record);

    int insertSelective(Ttest record);

    List<Ttest> selectByExample(TtestExample example);

    Ttest selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Ttest record, @Param("example") TtestExample example);

    int updateByExample(@Param("record") Ttest record, @Param("example") TtestExample example);

    int updateByPrimaryKeySelective(Ttest record);

    int updateByPrimaryKey(Ttest record);
}