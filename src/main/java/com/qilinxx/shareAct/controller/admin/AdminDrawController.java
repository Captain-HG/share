package com.qilinxx.shareAct.controller.admin;

import com.qilinxx.shareAct.domain.model.Activity;
import com.qilinxx.shareAct.domain.model.Provide;
import com.qilinxx.shareAct.domain.model.User;
import com.qilinxx.shareAct.domain.model.vo.ActivityVO;
import com.qilinxx.shareAct.domain.model.vo.DrawVO;
import com.qilinxx.shareAct.service.ActivityService;
import com.qilinxx.shareAct.service.AdminDrawService;
import com.qilinxx.shareAct.service.UserService;
import com.qilinxx.shareAct.util.Commons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author lzc
 * @date 2018/10/15 11:04
 * @Description:
 */
@Controller
public class AdminDrawController {
    @Autowired
    AdminDrawService adminDrawService;
    @Autowired
    ActivityService activityService;
    @Autowired
    UserService userService;
    /**
     * 跳转到活动列表页面
     * @param model
     * @return
     */
    @RequestMapping("admin-draw-list.html")
    public  String provideList(Model model){
        List<DrawVO> drawVOList = adminDrawService.selectAll();
        model.addAttribute("drawVOList",drawVOList);
        model.addAttribute("commons",new Commons());
        return "admin/draw-list";
    }
    /**
     *跳转到添加页面
     */
    @RequestMapping("admin-draw-add.html")
    public String addDrawUI(Model model){
        List<Activity> activityList = activityService.selectAll();
        model.addAttribute("activityList",activityList);
        return "admin/draw-add";
    }
    @RequestMapping("admin-addDraw")
    @ResponseBody
    public String  addDraw(String uAccount,String dAId){
        System.out.println(uAccount+dAId);
        User user = userService.selectByAccount(uAccount);
        if (user==null){
            return "账号不存在，请重新填写";
        }
        else{
            System.out.println(user);
            Boolean bool = adminDrawService.selectByUId(user.getuId());
            if (bool==false){
                return "该用户已参加过活动了";
            }
            else {
                adminDrawService.insertDraw(user.getuId(),dAId);
                return "success";
            }
        }
    }

}
