package com.qilinxx.shareAct.service;


import com.qilinxx.shareAct.domain.model.Activity;
import com.qilinxx.shareAct.domain.model.vo.ActivityVO;

import java.util.List;

public interface ActivityService {
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
    /** 根据id查询活动对象*/
    ActivityVO selectById(String aId);
    /** 编辑更新活动内容*/
    String  updateActivity(Activity activity);
    /** 增加活动*/
    String  insertActivity(Activity activity);
}
