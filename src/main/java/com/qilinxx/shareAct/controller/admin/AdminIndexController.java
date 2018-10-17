package com.qilinxx.shareAct.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminIndexController {
    @RequestMapping("admin-index.html")
    public String  adminIndex(){
        return "admin/index";
    }
}
