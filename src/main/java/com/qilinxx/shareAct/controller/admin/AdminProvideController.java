package com.qilinxx.shareAct.controller.admin;

import com.qilinxx.shareAct.domain.model.Provide;
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
 * @Auther: lzc
 * @Date: 2018/10/12 16:07
 * @Description:
 */
@Controller
public class AdminProvideController {
    @Autowired
    ProvideService provideService;
    /**
     * 商家列表
     */
    @RequestMapping("admin-provide-list.html")
    public  String provideList(Model model){
        List<Provide> provideList = provideService.selectAll();
        model.addAttribute("provideList",provideList);
        model.addAttribute("commons",new Commons());
        return "admin/provide-list";
    }
    /**
     *跳转添加页面
     */
    @RequestMapping("admin-provide-add.html")
    public String  provideAddUI(){
        return "admin/provide-add";
    }

    /**
     * 添加商家
     * @param provide 商家对象
     * @return 成功
     */
    @RequestMapping("admin-addProvide")
    @ResponseBody
    public String provideAdd(Provide provide){
        System.out.println(provide);
        provideService.insertProvide(provide);
        return "success";
    }
    /**
     * 禁用商家
     * @param pId 商家id
     * @return 成功
     */
    @RequestMapping("admin-stopProvide")
    @ResponseBody
    public String stopProvide(String pId, HttpServletRequest request) {
        String str = provideService.stopProvide(pId);
        System.out.println("禁用信息："+str);
        //logService.insertLog(str,userId(request),userIp(request));
        return "success";
    }

    /**
     * 开启商家
     *
     * @param pId  商家id
     * @return 成功
     */
    @RequestMapping("admin-startProvide")
    @ResponseBody
    public String startProvide(String pId, HttpServletRequest request) {
        String str = provideService.startProvide(pId);
        // System.out.println("传过来的语句："+str);
        //  logService.insertLog(str,userId(request),userIp(request));
        return "success";
    }


    /**
     * 跳转编辑页面
     * @param pId 用户id
     * @param model 传递
     * @return  页面跳转
     */
    @RequestMapping("admin-provide-edit.html")
    public  String  provideEdit(String pId,Model model){
        Provide provide = provideService.selectProvideById(pId);
        model.addAttribute("provide",provide);
        return "admin/provide-edit";
    }

    /**
     * 商家更新
     * @param  pAccount 账号
     * @param  pId  商家id
     * @param  pName 商家名
     * @param  pAddress 地址
     * @param pPermitNumber 商家码
     * @return 成功
     */
    @RequestMapping("admin-provideUpdate")
    @ResponseBody
    public String provideUpdate(String pAccount,String pName,String pId,String pAddress,String pPermitNumber){
        Provide provide = provideService.selectProvideById(pId);
       provide.setpAccount(pAccount);
       provide.setpAddress(pAddress);
       provide.setpName(pName);
       provide.setpPermitNumber(pPermitNumber);
        String s = provideService.updateProvide(provide);
        return "success";
    }

    /**
     * 跳转更新密码页面
     * @param pId 商家id
     * @param model 传递
     * @return 跳转
     */
    @RequestMapping("admin-provide-change-password.html")
    public String changeUserPassword(String pId,Model model){
        Provide provide = provideService.selectProvideById(pId);
        model.addAttribute("provide",provide);
        return "admin/provide-change-password";
    }

    /**
     * 更新密码
     * @param pId 商家id
     * @param newPassword 新的密码
     * @param request
     * @return 成功
     */
    @RequestMapping("admin-provide-changePassword")
    @ResponseBody
    public String changePassword(String pId,String newPassword,HttpServletRequest request){
        provideService.changePassword(pId,newPassword);
        return   "success";
    }
}
