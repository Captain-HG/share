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

/**
 * @Auther: lzc
 * @Date: 2018/10/12 16:07
 * @Description:
 */
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
     * 注册,有密码的双重确认，和账号的唯一再确认
     * @param uAccount  账号
     * @param password  密码
     * @param rePassword 密码2
     * @param uName 名字
     * @return
     */
      @RequestMapping("registerUserSure")
    public String registerSure(String uAccount,String password,String rePassword,String uName,String state){
          String str="";
          System.out.println(uAccount+password+rePassword+uName);
          if (password.equals(rePassword)){
              User user = userService.selectByAccount(uAccount);
              if (user==null) {
                  User user1 = new User();
                  user1.setuAccount(uAccount);
                  user1.setuPassword(password);
                  user1.setuName(uName);
                  if (state!=null){
                      user1.setuState(state);
                  }
                  else {
                      user1.setuState("1");
                  }
                 userService.registerUser(user1);
                  str="login";
              }else {
              str="registerUser";
              }
          }
          else {
              str = "registerUser";
          }
          return str;
      }
       @RequestMapping("ajaxRegister")
       @ResponseBody
    public  String  ajaxRegister(String account,String uId) {
           String str = "";
           if (uId != null) {
               System.out.println(uId);
               User user = userService.selectById(uId);
               boolean b = user.getuAccount().equals(account);
               if (b==true){
                   str="true";
               }
               else {
                   User user1 = userService.selectByAccount(account);
                   if (user1 == null) {
                       str = "true";//账号未存在
                   } else {
                       str = "error";//账号已存在
                   }
               }

           }
           else {
               User user = userService.selectByAccount(account);
               if (user == null) {
                   str = "true";//账号未存在
               } else {
                   str = "error";//账号已存在
               }
           }
           System.out.println(str+"123");
           return str;
      }

}
