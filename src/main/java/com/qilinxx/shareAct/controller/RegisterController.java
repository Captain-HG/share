package com.qilinxx.shareAct.controller;

import com.qilinxx.shareAct.configure.WebConst;
import com.qilinxx.shareAct.domain.model.User;
import com.qilinxx.shareAct.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class RegisterController {
    @Autowired
    UserService userService;
    @RequestMapping("registerUser")
    public String register(String uId, Model model, String aId, HttpSession session) {
        if (uId != null) {
            session.setAttribute(WebConst.USER_SESSION_USERID,uId);
            if (aId!=null){
                session.setAttribute(WebConst.ACT_SESSION_AID,aId);
            }
        }
        return "registerUser";
    }

    /**
     * 注册
     * @param account  账号
     * @param password  密码
     * @param password2 密码2
     * @param name 名字
     * @return
     */
      @RequestMapping("registerUserSure")
    public String registerSure(String account,String password,String repassword,String name){
          String str="";
          if (password.equals(repassword)){
              User user = userService.selectByAccount(account);
              if (user==null)
              {
                  User user1 = new User();
                  user1.setuAccount(account);
                  user1.setuPassword(password);
                  user.setuName(name);
                  int i = userService.registerUser(user1);
                  str="login";
              }else {
              str="register";
              }
          }
          else {
              str = "register";
          }
          return str;
      }
       @RequestMapping("ajaxRegister")
       @ResponseBody
    public  String  ajaxRegister(String account){
          String str="";
        User user = userService.selectByAccount(account);
        if (user==null){
            str="ture";//账号未存在
        }else{
            str="error";//账号已存在
        }
        return str;
       }

}
