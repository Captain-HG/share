package com.qilinxx.shareAct.controller.admin;


import com.qilinxx.shareAct.domain.model.Activity;
import com.qilinxx.shareAct.domain.model.Provide;
import com.qilinxx.shareAct.domain.model.vo.ActivityVO;
import com.qilinxx.shareAct.service.ActivityService;
import com.qilinxx.shareAct.service.ProvideService;
import com.qilinxx.shareAct.util.Commons;
import com.qilinxx.shareAct.util.DateKit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * @author lzc
 * @date 2018/10/15 11:04
 * @Description:
 */
@Controller
public class AdminActivityController {
    @Autowired
    ActivityService activityServie;
    @Autowired
    ProvideService provideService;

    /**
     * 跳转到活动列表页面
     * @param model
     * @return
     */
    @RequestMapping("admin-activity-list.html")
    public  String provideList(Model model){
        List<ActivityVO> activityVOList = activityServie.selectAll();
        model.addAttribute("activityVOList",activityVOList);
        model.addAttribute("commons",new Commons());
        return "admin/activity-list";
    }
    /**
     * 开启审核此活动
     *
     * @param aId  活动id
     * @return 成功
     */
    @RequestMapping("admin-startActivity")
    @ResponseBody
    public String startActivity(String aId, HttpServletRequest request) {
        String str = activityServie.startActivity(aId);
        // System.out.println("传过来的语句："+str);
        //  logService.insertLog(str,userId(request),userIp(request));
        return "success";
    }
    /**
     * 取消此活动
     *
     * @param aId  活动id
     * @return 成功
     */
    @RequestMapping("admin-stopActivity")
    @ResponseBody
    public String stopActivity(String aId, HttpServletRequest request) {
        String str = activityServie.stopActivity(aId);
        // System.out.println("传过来的语句："+str);
        //  logService.insertLog(str,userId(request),userIp(request));
        return "success";
    }
    /**
     * 完成此活动
     * @param aId  活动id
     * @return 成功
     */
    @RequestMapping("admin-successActivity")
    @ResponseBody
    public String successActivity(String aId, HttpServletRequest request) {
        String str = activityServie.successActivity(aId);
        // System.out.println("传过来的语句："+str);
        //  logService.insertLog(str,userId(request),userIp(request));
        return "success";
    }
    /**
     * 重新审核此活动
     * @param aId  活动id
     * @return 成功
     */
    @RequestMapping("admin-examineActivity")
    @ResponseBody
    public String examineActivity(String aId, HttpServletRequest request) {
        String str = activityServie.examineActivity(aId);
        // System.out.println("传过来的语句："+str);
        //  logService.insertLog(str,userId(request),userIp(request));
        return "success";
    }

    /**
     * 跳转到编辑页面
     * @param aId 活动id
     * @param model 传递
     * @return 编辑页面
     */
    @RequestMapping("admin-activity-edit.html")
    public String editActivityUi(String aId,Model model){
        ActivityVO activityVO = activityServie.selectById(aId);
        List<Provide> provideList = provideService.selectAll();
        model.addAttribute("activityVO",activityVO);
        model.addAttribute("commons",new Commons());
        model.addAttribute("provideList",provideList);
        return "admin/activity-edit";
    }

    /**
     * 编辑更新活动
     * @param
     * @return
     */
    @RequestMapping("admin-updateActivity")
    @ResponseBody
    public  String  updateActivity(String aName,String pId, String aStartTime,String aEndTime,String aId,String aDetail,String aUrl){
       System.out.println(aName+pId+aStartTime+aEndTime+aId+aDetail);

        Date startDate = DateKit.dateFormat1(aStartTime);
        int startTime = DateKit.getUnixTimeByDate(startDate);
        Date endDate = DateKit.dateFormat1(aEndTime);
        int endTime = DateKit.getUnixTimeByDate(endDate);
        if (endTime <= startTime){
            return "时间输入先后有无，请重填";
        }else {
            Activity activity = new Activity();
            activity.setaId(aId);
            activity.setaDetail(aDetail);
            activity.setaName(aName);
            activity.setaStartTime(startTime);
            activity.setaEndTime(endTime);
            activity.setaPId(pId);
            activity.setaUrl(aUrl);
            activityServie.updateActivity(activity);
            return "success";
        }
    }

    /**
     * 页面跳转
     * @param model 传递
     * @return 增加页面
     */
    @RequestMapping("admin-activity-add.html")
    public  String  addActivityUi(Model model){
        List<Provide> provideList = provideService.selectAll();
        model.addAttribute("provideList",provideList);
        return "admin/activity-add";
    }
    @RequestMapping("admin-addActivity")
    @ResponseBody
    public String addActivity(String aName,String pId, String aStartTime,String aEndTime,String aDetail,String aUrl) {
       System.out.println(aName+pId+aStartTime+aEndTime+aDetail);
        Date startDate = DateKit.dateFormat1(aStartTime);
        int startTime = DateKit.getUnixTimeByDate(startDate);
        Date endDate = DateKit.dateFormat1(aEndTime);
        int endTime = DateKit.getUnixTimeByDate(endDate);
        if (endTime <= startTime){
            return "时间输入先后有无，请重填";
        }
        else {
            Activity activity = new Activity();
            activity.setaDetail(aDetail);
            activity.setaName(aName);
            activity.setaStartTime(startTime);
            activity.setaEndTime(endTime);
            activity.setaPId(pId);
            activity.setaUrl("http://"+aUrl);
            activityServie.insertActivity(activity);
            return "success";
        }
    }
}
