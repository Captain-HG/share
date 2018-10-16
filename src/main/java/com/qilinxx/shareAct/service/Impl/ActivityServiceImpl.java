package com.qilinxx.shareAct.service.Impl;

import com.qilinxx.shareAct.domain.mapper.ActivityMapper;
import com.qilinxx.shareAct.domain.mapper.ProvideMapper;
import com.qilinxx.shareAct.domain.model.Activity;
import com.qilinxx.shareAct.domain.model.Provide;
import com.qilinxx.shareAct.domain.model.vo.ActivityVO;
import com.qilinxx.shareAct.service.ActivityService;
import com.qilinxx.shareAct.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: lzc
 * @Date: 2018/10/16 09:37
 * @Description:
 */
@Service
public class ActivityServiceImpl implements ActivityService {
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

    @Override
    public ActivityVO selectById(String aId) {
        Activity activity = activityMapper.selectByPrimaryKey(aId);
        ActivityVO activityVO = improve(activity);
        return activityVO;
    }

    @Override
    public String updateActivity(Activity activity) {
        activity.setaState("0");
        activityMapper.updateByPrimaryKeySelective(activity);
        return "更新了:"+activity.getaName()+"的内容,等待重新审核";
    }

    @Override
    public String insertActivity(Activity activity) {
        activity.setaId(UUID.UU32());
        activity.setaState("0");
        activityMapper.insert(activity);
        return "增加了:"+activity.getaName()+"这项活动，等待审核" ;
    }
}
