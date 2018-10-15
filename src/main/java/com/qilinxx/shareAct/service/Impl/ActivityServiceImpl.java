package com.qilinxx.shareAct.service.Impl;

import com.qilinxx.shareAct.domain.mapper.ActivityMapper;
import com.qilinxx.shareAct.domain.mapper.ProvideMapper;
import com.qilinxx.shareAct.domain.model.Activity;
import com.qilinxx.shareAct.domain.model.Provide;
import com.qilinxx.shareAct.domain.model.vo.ActivityVO;
import com.qilinxx.shareAct.service.ActivityServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActivityServiceImpl implements ActivityServie {
    @Autowired
    ActivityMapper activityMapper;
    @Autowired
    ProvideMapper provideMapper;
    @Override
    public List<ActivityVO> selectAll() {
        List<Activity> activityList = activityMapper.selectAll();
        List<ActivityVO> activityVOArrayList = new ArrayList<>();
        for(Activity act:activityList){
            activityVOArrayList.add(improve(act));
        }
        return activityVOArrayList;
    }

    /**
     * 封装ActivityVo对象
     * @param activity
     * @return
     */
    private ActivityVO improve(Activity activity){
        Provide provide = provideMapper.selectByPrimaryKey(activity.getaPId());
        ActivityVO activityVO = new ActivityVO();
        activityVO.setActivity(activity);
        activityVO.setProvide(provide);
        return activityVO;
    }
    @Override
    public String startActivity(String aId) {
        Activity activity = activityMapper.selectByPrimaryKey(aId);
        activity.setaState("1");
        activityMapper.updateByPrimaryKeySelective(activity);
        return "审核通过了:"+activity.getaName()+"这项活动";
    }

    @Override
    public String stopActivity(String aId) {
        Activity activity = activityMapper.selectByPrimaryKey(aId);
        activity.setaState("2");
        activityMapper.updateByPrimaryKeySelective(activity);
        return "取消了:"+activity.getaName()+"这项活动";
    }

    @Override
    public String successActivity(String aId) {
        Activity activity = activityMapper.selectByPrimaryKey(aId);
        activity.setaState("3");
        activityMapper.updateByPrimaryKeySelective(activity);
        return "完成了:"+activity.getaName()+"这项活动";
    }

    @Override
    public String examineActivity(String aId) {
        Activity activity = activityMapper.selectByPrimaryKey(aId);
        activity.setaState("0");
        activityMapper.updateByPrimaryKeySelective(activity);
        return "重新进行审核:"+activity.getaName()+"这项活动";
    }
}
