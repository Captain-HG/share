package com.qilinxx.shareAct.controller.admin;

import com.qilinxx.shareAct.domain.model.Relation;
import com.qilinxx.shareAct.service.RelationService;
import com.qilinxx.shareAct.util.Commons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AdminRelationController {
    @Autowired
    RelationService relationService;

    /**
     * 跳转到关系列表页面
     * @param model 传递
     * @return
     */
   @RequestMapping("admin-relation-list.html")
    public String relationList(Model model){
       List<Relation> relationList = relationService.selectAll();
       model.addAttribute("relationList",relationList);
       model.addAttribute("comons",new Commons());
       return "admin/relation-list";
   }
}
