package com.qilinxx.shareAct.controller;

import com.qilinxx.shareAct.domain.model.Activity;
import com.qilinxx.shareAct.domain.model.Provide;
import com.qilinxx.shareAct.service.ActivityService;
import com.qilinxx.shareAct.service.ProvideService;
import com.qilinxx.shareAct.util.Commons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Auther: 余小北
 * @Date: 2018/10/12 09:52
 * @Description:
 */
@Controller
public class ProvideController {
    @Autowired
    ProvideService provideService;
    @Autowired
    ActivityService activityService;

    /** 
    *@Author: pengxiaoyu 
    * @Description: 服务商的首页
    * @Param: [id, model] 
    * @return: java.lang.String 
    * @Date: 2018/10/15 
    */ 
    @RequestMapping("/provide_index")
    public String provide_index(String id, HttpSession httpSession){
      Provide provide= provideService.selectProvideById(id);
      httpSession.setAttribute("provide",provide);
      return "backstage/index";
    }
    /** 
    *@Author: pengxiaoyu 
    * @Description: 服务商查看信息的页面 
    * @Param: [id, model] 
    * @return: java.lang.String 
    * @Date: 2018/10/15 
    */ 
    @RequestMapping("member-show.html")
    public String member_Show() {
        return "backstage/member-show";
    }
    /** 
    *@Author: pengxiaoyu 
    * @Description: 服务商修改信息的页面 
    * @Param: [id, model] 
    * @return: java.lang.String 
    * @Date: 2018/10/15 
    */ 
    @RequestMapping("member-add.html")
    public String user_edit() {
        return "backstage/member-add";
    }
    /** 
    *@Author: pengxiaoyu 
    * @Description: 根据Id跳转到活动详情页面 
    * @Param: [] 
    * @return: java.lang.String 
    * @Date: 2018/10/15 
    */ 
    @RequestMapping("member-list.html")
    public String showMemberList(HttpServletRequest request) {
        HttpSession session=request.getSession();
        Provide provide = (Provide)session.getAttribute("provide");
        //根据商户下所有的活动
        List<Activity> activities=activityService.findAllActivitiesById(provide.getpId());
        request.setAttribute("activities",activities);
        request.setAttribute("common",new Commons());
        return "backstage/member-list";
    }
}
