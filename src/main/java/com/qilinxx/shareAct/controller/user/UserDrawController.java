package com.qilinxx.shareAct.controller.user;

import com.qilinxx.shareAct.configure.WebConst;
import com.qilinxx.shareAct.domain.model.Draw;
import com.qilinxx.shareAct.domain.model.User;
import com.qilinxx.shareAct.service.DrawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

/**
 * @Auther: dqsdc
 * @Date: 2018-10-12 15:49
 * @Description:
 */
@RequestMapping("user")
@Controller
public class UserDrawController {
    @Autowired
    DrawService drawService;

    @RequestMapping("lottery")
    public String lottery(HttpSession session,Model model){
        User user= (User) session.getAttribute(WebConst.USER_SESSION_USER);
        Draw d=drawService.selectDrawByUid(user.getuId());
        System.out.println(d);
        model.addAttribute("lottery",d.getdDrawNumber());
        model.addAttribute("point",d.getdPoint());
        return "user/lottery_draw";
    }

    @RequestMapping("/updateData")
    @ResponseBody
    public HashMap<String, String> updateData(String draw, String total){
        System.out.println(draw+"   "+total);
        HashMap<String,String> map=new HashMap<>();
        map.put("state","ok");
        return map;
    }
}
