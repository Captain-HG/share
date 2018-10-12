package com.qilinxx.shareAct.controller;

import com.qilinxx.shareAct.domain.model.User;
import com.qilinxx.shareAct.service.UserService;
import com.qilinxx.shareAct.util.Commons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    /**
     * 用户列表
     */
  @RequestMapping("user-list.html")
    public  String userList(Model model){
      List<User> userList = userService.selectAll();
      model.addAttribute("userList",userList);
      model.addAttribute("commons",new Commons());
      return "admin/user-list";
  }
    /**
     *跳转添加页面
     */
    @RequestMapping("user-add.html")
    public String  userAdd(){
        return "admin/user-add";
    }
    /**
     * 禁用用户
     * @param uId 用户id
     * @return 成功
     */
    @RequestMapping("stopUser")
    @ResponseBody
    public String stopCourse(String uId, HttpServletRequest request) {
        String str = userService.stopUser(uId);
        System.out.println("禁用信息："+str);
        //logService.insertLog(str,userId(request),userIp(request));
        return "success";
    }

    /**
     * 开启用户
     *
     * @param uId  用户id
     * @return 成功
     */
    @RequestMapping("startUser")
    @ResponseBody
    public String startUser(String uId, HttpServletRequest request) {
        String str = userService.startUser(uId);
       // System.out.println("传过来的语句："+str);
      //  logService.insertLog(str,userId(request),userIp(request));
        return "success";
    }

    /**
     * 跳转编辑页面
     * @param uId 用户id
     * @param model 传递
     * @return
     */
     @RequestMapping("user-edit.html")
    public  String  userEdit(String uId,Model model){
         User user = userService.selectById(uId);
         model.addAttribute("user",user);
         return "admin/user-edit";
     }

    /**
     * 用户更新
     * @param  uAccount 账号
     * @param  uId  用户id
     * @param  uName 用户名
     * @return
     */
     @RequestMapping("userUpdate")
     @ResponseBody
    public String userUpdate(String uAccount,String uName,String uId){
         User user = userService.selectById(uId);
         user.setuAccount(uAccount);
         user.setuName(uName);
         userService.update(user);
        return "success";
     }

    /**
     * 跳转更新密码页面
     * @param uId 用户id
     * @param model 传递
     * @return
     */
     @RequestMapping("user-change-password.html")
    public String changeUserPassword(String uId,Model model){
         User user = userService.selectById(uId);
         model.addAttribute("user",user);
         return "admin/user-change-password";
     }

    /**
     * 更新密码
     * @param uId 用户id
     * @param newPassword 新的密码
     * @param request
     * @return
     */
    @RequestMapping("changePassword")
    @ResponseBody
    public String changePassword(String uId,String newPassword,HttpServletRequest request){
        userService.changePassword(uId,newPassword);
        return   "success";
    }
}
