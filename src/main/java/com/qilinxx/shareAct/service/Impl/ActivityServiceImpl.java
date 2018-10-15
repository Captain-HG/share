package com.qilinxx.shareAct.service.Impl;

import com.qilinxx.shareAct.domain.mapper.ActivityMapper;
import com.qilinxx.shareAct.domain.model.Activity;
import com.qilinxx.shareAct.domain.model.ActivityExample;
import com.qilinxx.shareAct.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 余小北
 * @Date: 2018/10/15 09:57
 * @Description:
 */
@Service
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    private ActivityMapper activityMapper;
    /**
     *@Author: pengxiaoyu
     * @Description: 根据商户Id查询所有的Activity
     * @Param: [pId]
     * @return: java.util.List<com.qilinxx.shareAct.domain.model.Activity>
     * @Date: 2018/10/15
     */
    @Override
    public List<Activity> findAllActivitiesById(String pId) {
        ActivityExample example =new ActivityExample();
        ActivityExample.Criteria criteria = example.createCriteria();
        criteria.andAPIdEqualTo(pId);
        List<Activity> activities = activityMapper.selectByExample(example);
        return activities;
    }
    /**
     *@Author: pengxiaoyu
     * @Description: 根据活动Id查询活动详情
     * @Param: [id]
     * @return: com.qilinxx.shareAct.domain.model.Activity
     * @Date: 2018/10/15
     */
    @Override
    public Activity selectActivityById(String id) {
        ActivityExample example =new ActivityExample();
        ActivityExample.Criteria criteria = example.createCriteria();
        criteria.andAIdEqualTo(id);
        Activity activity=null;
        List<Activity> activities = activityMapper.selectByExample(example);
        if(activities!=null && activities.size()>0){
            activity=activities.get(0);
        }
        return activity;
    }

    @Override
    public Integer stopActivityById(String id) {
        Activity activity = activityMapper.selectByPrimaryKey(id);
        //0为待审核，1为正在进行，2为已取消，3为已完成（已过时）
        activity.setaState("2");
        return activityMapper.updateByPrimaryKeySelective(activity);
    }
}
