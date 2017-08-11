package com.youu.youu.manager.dao;

import com.youu.youu.manager.bean.TJourneySceni;
import java.util.List;

public interface TJourneySceniMapper {
    int insert(TJourneySceni record);

    List<TJourneySceni> selectAll();
}