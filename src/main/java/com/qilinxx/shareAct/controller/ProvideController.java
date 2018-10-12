package com.qilinxx.shareAct.controller;

import com.qilinxx.shareAct.domain.model.Provide;
import com.qilinxx.shareAct.service.ProvideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: 余小北
 * @Date: 2018/10/12 09:52
 * @Description:
 */
@Controller
public class ProvideController {
    @Autowired
    ProvideService provideService;

    @RequestMapping("/provide_index")
    public String provide_index(String id, Model model){
      Provide provide= provideService.selectProvideById(id);
      model.addAttribute("provide",provide);
      return "backstage/index";
    }
    @RequestMapping("member-show.html")
    public String member_Show(String id,Model model) {
        Provide provide= provideService.selectProvideById(id);
        model.addAttribute("provide",provide);
        return "backstage/member-show";
    }

    @RequestMapping("member-edit.html")
    public String user_edit(String id,Model model) {
        Provide provide= provideService.selectProvideById(id);
        model.addAttribute("provide",provide);
        return "backstage/member-add";
    }
}
