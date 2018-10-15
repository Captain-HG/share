package com.qilinxx.shareAct.controller;

import com.qilinxx.shareAct.domain.model.Activity;
import com.qilinxx.shareAct.service.pro.ProActivityService;
import com.qilinxx.shareAct.util.Commons;
import com.qilinxx.shareAct.util.DateKit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @Auther: 余小北
 * @Date: 2018/10/15 11:17
 * @Description:
 */
@Controller
public class ActivityController {
    @Autowired
    ProActivityService proActivityService;
    /** 
    *@Author: pengxiaoyu 
    * @Description: 查看活动详情 
    * @Param: [id, model] 
    * @return: java.lang.String 
    * @Date: 2018/10/15 
    */ 
    @RequestMapping("activity-show.html")
    public String activity_show(String id, Model model){
        Activity activty= proActivityService.selectActivityById(id);
        model.addAttribute("activity",activty);
        model.addAttribute("commons",new Commons());
        return "backstage/activity-show.html";
    }
    /** 
    *@Author: pengxiaoyu 
    * @Description: 停用活动
    * @Param:  
    * @return:  
    * @Date: 2018/10/15 
    */
    @ResponseBody
    @RequestMapping("stopActivty")
    public String stopActivity(String id ){
        Integer i= proActivityService.stopActivityById(id);
        if(i>0){
            return "取消成功";
        }else{
            return "取消失败，请重试";
        }
    }
    /** 
    *@Author: pengxiaoyu 
    * @Description: 跳转到修改活动信息
    * @Param:  
    * @return:  
    * @Date: 2018/10/15 
    */
    @RequestMapping("activity-edit.html")
    public String activityEdit(String id,Model model){
        Activity activity = proActivityService.selectActivityById(id);
        model.addAttribute("activity",activity);
        model.addAttribute("commons",new Commons());
        return "backstage/activity-edit.html";
    }
    /**
    *@Author: pengxiaoyu
    * @Description: 修改活动
    * @Param:
    * @return:
    * @Date: 2018/10/15
    */
    @ResponseBody
    @RequestMapping("editActivity")
    public String editActivity(Activity activity,String sStartTime,String sEndTime){
        activity.setaState("0");
        System.out.println(sStartTime);
        Date date = DateKit.dateFormat1(sStartTime);
        System.out.println(date);
        Integer aStartTime = (int)DateKit.getUnixTimeLong(date);
        activity.setaStartTime(aStartTime);
        date = DateKit.dateFormat1(sEndTime);
        Integer aEndTime = (int)DateKit.getUnixTimeLong(date);
        activity.setaEndTime(aEndTime);
      //更新到数据库
        int i= proActivityService.updateActivity(activity);
        if(i>0){
            return "修改成功";
        }
        return "修改成功";
    }
}
