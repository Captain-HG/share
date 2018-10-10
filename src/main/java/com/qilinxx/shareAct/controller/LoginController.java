package com.qilinxx.shareAct.controller;


import com.qilinxx.shareAct.configure.WebConst;
import com.qilinxx.shareAct.domain.model.User;
import com.qilinxx.shareAct.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginController {
    @Autowired
    UserService userService;
    @Autowired

/**
 * 跳转到登入界面
 */
    @RequestMapping("login")
    public String login() {
        return "login";
    }




    @RequestMapping("loginSure") //登陆时确定用户信息
    public String loginSure(String account, String password, Model model, HttpSession session) {
          System.out.println(account+password);
        if(account!=null&&password!=null){
            //根据账号，密码查询对象
            List<User> userList = userService.selectByAccountAndPassword(account, password);
            if (userList==null||userList.size()==0){
                model.addAttribute("loginMsg","账号密码错误");
                return "login";
            }
            else{
                User user = userList.get(0);
                session.setAttribute(WebConst.USER_SESSION_USER,user);
                return "redirect:home";//重定向到home
            }
        }
        else {
            model.addAttribute("loginMsg","账号密码不能为空");
            return "login";
        }
    }


}

