package com.qilinxx.shareAct.service;


import com.qilinxx.shareAct.domain.model.vo.ActivityVO;

import java.util.List;

public interface ActivityServie {
    /** 查找所有的活动 vo*/
    List<ActivityVO> selectAll();
    /** 审核通过该活动*/
    String startActivity(String aId);
    /** 取消该活动*/
    String stopActivity(String aId);
    /** 完成该活动*/
    String successActivity(String aId);
    /** 重新审核该活动*/
    String examineActivity(String aId);
}
