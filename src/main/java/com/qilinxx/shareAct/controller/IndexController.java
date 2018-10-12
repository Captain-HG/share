package com.qilinxx.shareAct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Auther: ljm
 * @Date: 2018-09-13 15:57
 * @Description: 主控制类，动态映射HTML路径
 */
@Controller
public class IndexController {


    @RequestMapping("/backstage_index")
    public String showIndex() {
        return "backstage/index";
    }

    @RequestMapping("/welcome.html")
    public String showWelcome(HttpServletRequest request) {
//        List<Log> logs = logService.getAdminLoginLog();
//        request.setAttribute("size", logs.size());
//        if (logs.size()>=2)
//            request.setAttribute("log", logs.get(1));
//        else
//            request.setAttribute("log",logs.get(0));
//        request.setAttribute("commons", new Commons());
        return "backstage/welcome";
    }
    //show_xinxi.html
    @RequestMapping("article-add.html")
    public String article_add() {
        return "backstage/article-add";
    }
    @RequestMapping("show_xinxi.html")
    public String show_xinxi() {
        return "backstage/show_xinxi";
    }
    @RequestMapping("article-list.html")
    public String articleList() {
        return "backstage/article-list";
    }
    @RequestMapping("picture-add.html")
    public String showPictureAdd() {
        return "backstage/picture-add";
    }
   // article-zhang.html
   @RequestMapping("article-zhang.html")
   public String articleZhang() {
       return "backstage/article-zhang";
   }
    @RequestMapping("picture-list.html")
    public String showPictureList() {
        return "backstage/picture-list";
    }

    @RequestMapping("feedback-list.html")
    public String showFeedbackList() {
        return "backstage/feedback-list";
    }

    @RequestMapping("product-add.html")
    public String showProductAdd() {
        return "backstage/product-add";
    }

    @RequestMapping("product-brand.html")
    public String showProductBrand() {
        return "backstage/product-brand";
    }

    @RequestMapping("product-category.html")
    public String showProductCategory() {
        return "backstage/product-category";
    }

    @RequestMapping("product-category-add.html")
    public String showProductCategoryAdd() {
        return "backstage/product-category-add";
    }

    @RequestMapping("product-list.html")
    public String showProductList() {
        return "backstage/product-list";
    }

    @RequestMapping("member-add.html")
    public String showMemberAdd() {
        return "backstage/member-add";
    }

    @RequestMapping("member-list.html")
    public String showMemberList() {
        return "backstage/member-list";
    }

    @RequestMapping("member-del.html")
    public String showMemberDel() {
        return "backstage/member-del";
    }

    @RequestMapping("member-record-browse.html")
    public String showMemberRecordBrowse() {
        return "backstage/member-record-browse";
    }

    @RequestMapping("member-record-download.html")
    public String showMemberRecordDownload() {
        return "backstage/member-record-download";
    }

    @RequestMapping("member-record-share.html")
    public String showMemberRecordShare() {
        return "backstage/member-record-share";
    }

//    @RequestMapping("user-add.html")
//    public String showUserAdd() {
//        return "backstage/user-add";
//    }

//    @RequestMapping("user-list.html")
//    public String showUserList() {
//        return "backstage/user-list";
//    }

    @RequestMapping("user-password-edit.html")
    public String showUserPasswordEdit() {
        return "backstage/user-password-edit";
    }

    @RequestMapping("user-show.html")
    public String showUserShow() {
        return "backstage/user-show";
    }

    @RequestMapping("system-base.html")
    public String showSystemBase() {
        return "backstage/system-base";
    }

    @RequestMapping("system-category.html")
    public String showSystemCategory() {
        return "backstage/system-category";
    }

    @RequestMapping("system-category-add.html")
    public String showSystemCategoryAdd() {
        return "backstage/system-category-add";
    }

    @RequestMapping("system-data.html")
    public String showSystemData() {
        return "backstage/system-data";
    }

    @RequestMapping("system-shielding.html")
    public String showSystemShielding() {
        return "backstage/system-shielding";
    }

    @RequestMapping("admin-role.html")
    public String showAdminRole() {
        return "backstage/admin-role";
    }

    @RequestMapping("admin-permission.html")
    public String showAdminPermission() {
        return "backstage/admin-permission";
    }


    @RequestMapping("charts-1.html")
    public String showCharts1() {
        return "backstage/charts-1";
    }
    @RequestMapping("charts-2.html")
    public String showCharts2() {
        return "backstage/charts-2";
    }
    @RequestMapping("charts-3.html")
    public String showCharts3() {
        return "backstage/charts-3";
    }
    @RequestMapping("charts-4.html")
    public String showCharts4() {
        return "backstage/charts-4";
    }
    @RequestMapping("charts-5.html")
    public String showCharts5() {
        return "backstage/charts-5";
    }
    @RequestMapping("charts-6.html")
    public String showCharts6() {
        return "backstage/charts-6";
    }
    @RequestMapping("charts-7.html")
    public String showCharts7() {
        return "backstage/charts-7";
    }
//    @RequestMapping("member-show.html")
//    public String member_Show() {
//        return "backstage/member-show";
//    }
//user-edit.html
//    @RequestMapping("user-edit.html")
//    public String user_edit() {
//    return "backstage/member-add";
//}
    @RequestMapping("index-2.html")
    public String index_2() {
        return "backstage/index-2";
    }
}