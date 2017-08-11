package com.youu.youu.manager.dao;

import com.youu.youu.manager.bean.TJourneyPlan;
import java.util.List;

public interface TJourneyPlanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TJourneyPlan record);

    TJourneyPlan selectByPrimaryKey(Integer id);

    List<TJourneyPlan> selectAll();

    int updateByPrimaryKey(TJourneyPlan record);
}