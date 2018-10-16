package com.qilinxx.shareAct.controller.user;

import com.qilinxx.shareAct.configure.WebConst;
import com.qilinxx.shareAct.domain.model.User;
import com.qilinxx.shareAct.service.DrawService;
import com.qilinxx.shareAct.service.Impl.UserException;
import com.qilinxx.shareAct.service.RelationService;
import com.qilinxx.shareAct.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @Auther: dqsdc
 * @Date: 2018-10-12 14:47
 * @Description:
 */
@RequestMapping("user")
@Controller
public class UserLoginController {
    @Autowired
    UserService userService;

    @Autowired
    RelationService relationService;

    @Autowired
    DrawService drawService;

    @RequestMapping("login")
    public String login() {
        return "user/login";
    }

    @RequestMapping("register")//注册时获得邀请者的guid
    public String register(String key, HttpSession session, String act) {
        System.out.println("register--->" + key+"----"+act);
        if (key != null)
            session.setAttribute("key", key);
        if (act != null)
            session.setAttribute("act", act);
        return "user/register";
    }

    @RequestMapping("loginSure") //登陆时确定用户信息
    public String loginSure(String account, String password, Model model, HttpSession session) {

        User user = new User();
        user.setuAccount(account);
        user.setuPassword(password);
        try {
            User dataUser = userService.login(user);
            String aid=drawService.getDrawId(dataUser.getuId());
            session.setAttribute(WebConst.USER_SESSION_USER, dataUser);
            session.setAttribute(WebConst.ACT_SESSION_AID,aid);
            return "redirect:lottery";
        } catch (UserException e) {
            model.addAttribute("loginMsg", e.getMessage());
//            model.addAttribute("user", user);
            return "user/login";
        }
    }

    @RequestMapping("registerSure")//登陆注册判断用户是否存在
    public String registerSure(String account, String username, Model model, String password,HttpSession session) {
        String key= (String) session.getAttribute("key");
        String act= (String) session.getAttribute("act");
        try {

           User user= userService.register(account,password,username);//用户表添加
            System.out.println("key:"+key+"  id:"+user.getuId()+"  act:"+act);
            relationService.addRelation(key, user.getuId(), act);//relation表添加记录
            drawService.add(user.getuId(), act);//抽奖draw表添加
            return "user/login";
        } catch (UserException e) {                     //登录失败
            model.addAttribute("registerMsg", e.getMessage());
//            model.addAttribute("user", user);
            return "user/register";
        }
    }
}
