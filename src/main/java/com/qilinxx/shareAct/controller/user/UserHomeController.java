package com.qilinxx.shareAct.controller.user;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qilinxx.shareAct.configure.WebConst;
import com.qilinxx.shareAct.domain.model.Relation;
import com.qilinxx.shareAct.domain.model.User;
import com.qilinxx.shareAct.domain.vo.RelationVo;
import com.qilinxx.shareAct.service.RelationService;
import com.qilinxx.shareAct.util.QrCodeUtil;
import com.qilinxx.shareAct.util.TimeTransform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.List;


/**
 * @Auther: dqsdc
 * @Date: 2018-10-12 15:24
 * @Description:
 */
@RequestMapping("user")
@Controller
public class UserHomeController {

    @Autowired
    RelationService relationService;

    @RequestMapping("home")//主页分页
    public String home(Model model, HttpSession session, String pageNum) {
        if (pageNum == null || Integer.parseInt(pageNum) <= 0) {
            pageNum = "1";
        }
        PageHelper.startPage(Integer.parseInt(pageNum), 10);//分页设置放在查询前面起限制作用

        User user = (User) session.getAttribute(WebConst.USER_SESSION_USER);
        String guid = user.getuId();
        List<RelationVo> relationList = relationService.getRelation(guid);
        System.out.println("relationList-----"+relationList.size());
        //2.分页操作
          /*当前页 private int pageNum;
        //每页的数量 private int pageSize;
        //总记录数private long total;
        //总页数private int pages;
        //结果集private List<T> list;
        //导航页码private int navigatePages;
        //所有导航页private int[] navigatepageNums;*/
        PageInfo pageInfo = new PageInfo(relationList);
        int pages = pageInfo.getPages();
        model.addAttribute("totalPages", pages);//总页数传过去
        //是否是第一页
        model.addAttribute("isFirstPage", pageInfo.isIsFirstPage());
        //获得当前页
        model.addAttribute("pageNum", pageInfo.getPageNum());
        //是否是最后一页
        model.addAttribute("isLastPage", pageInfo.isIsLastPage());
        long total = pageInfo.getTotal();
        model.addAttribute("total", total);
        List<RelationVo> scpageInfoList = pageInfo.getList();
        model.addAttribute("scpageInfoList", scpageInfoList);
        model.addAttribute("timeTrans", new TimeTransform());
        model.addAttribute("local",user);
        return "user/home";

    }
//    @RequestMapping("rank")//主页分页
//    public String rank(Model model, HttpSession session, String pageNum) {
//        if (pageNum == null || Integer.parseInt(pageNum) <= 0) {
//            pageNum = "1";
//        }
//        PageHelper.startPage(Integer.parseInt(pageNum), 10);//分页设置放在查询前面起限制作用
//
//        User user = (User) session.getAttribute(WebConst.USER_SESSION_USER);
//        String guid = user.getuId();
//        List<RelationVo> relationList = relationService.getRelation(guid);
//        System.out.println("relationList-----"+relationList.size());
//        //2.分页操作
//          /*当前页 private int pageNum;
//        //每页的数量 private int pageSize;
//        //总记录数private long total;
//        //总页数private int pages;
//        //结果集private List<T> list;
//        //导航页码private int navigatePages;
//        //所有导航页private int[] navigatepageNums;*/
//        PageInfo pageInfo = new PageInfo(relationList);
//        int pages = pageInfo.getPages();
//        model.addAttribute("totalPages", pages);//总页数传过去
//        //是否是第一页
//        model.addAttribute("isFirstPage", pageInfo.isIsFirstPage());
//        //获得当前页
//        model.addAttribute("pageNum", pageInfo.getPageNum());
//        //是否是最后一页
//        model.addAttribute("isLastPage", pageInfo.isIsLastPage());
//        long total = pageInfo.getTotal();
//        model.addAttribute("total", total);
//        List<RelationVo> scpageInfoList = pageInfo.getList();
//        model.addAttribute("scpageInfoList", scpageInfoList);
//        model.addAttribute("timeTrans", new TimeTransform());
//        model.addAttribute("local",user);
//        return "user/home";
//
//    }
    @RequestMapping("share")//分享页面
    public String share(HttpSession session, Model model) {
        User user = (User) session.getAttribute(WebConst.USER_SESSION_USER);
        String act= (String) session.getAttribute(WebConst.ACT_SESSION_AID);
        String guid = user.getuId();
        System.out.println(act+"---"+guid);
        model.addAttribute("guid", guid);
        model.addAttribute("act",act);
        model.addAttribute("url", WebConst.ADDRESS + "?key=" + guid+"&act="+act);
        return "user/share";
    }

    @RequestMapping("qrcode")//二维码生成方法
    public void getQrcode(String content,String act, HttpServletResponse resp) {
        System.out.println(content+"----"+act);
        content = WebConst.ADDRESS + "?key=" + content+"&act="+act;//content为邀请者的id，key为id判断
        QrCodeUtil.create(content,resp);
    }
}
