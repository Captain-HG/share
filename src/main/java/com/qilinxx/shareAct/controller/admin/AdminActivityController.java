package com.qilinxx.shareAct.controller.admin;


import com.qilinxx.shareAct.domain.model.vo.ActivityVO;
import com.qilinxx.shareAct.service.ActivityServie;
import com.qilinxx.shareAct.service.ProvideService;
import com.qilinxx.shareAct.util.Commons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author lzc
 * @date 2018/10/15 11:04
 * @Description:
 */
@Controller
public class AdminActivityController {
    @Autowired
    ActivityServie activityServie;
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
    @RequestMapping("admin-activity-edit.html")
    public String editActivity(){
        return "admin/activity-edit";
    }
}
