package com.qilinxx.shareAct.service;

import com.qilinxx.shareAct.domain.model.Activity;
import com.qilinxx.shareAct.domain.model.Provide;
import com.qilinxx.shareAct.domain.model.User;

import java.util.List;

/**
 * @Auther: 余小北
 * @Date: 2018/10/12 09:54
 * @Description:
 */
public interface ProvideService {

    Provide selectProvideById(String id);
    /** 查询所有*/
    List<Provide> selectAll();
    /** 停用该商家，根据id*/
    String  stopProvide(String pId);
    /** 启用该商家，根据id*/
    String  startProvide(String pId);
    /** 更新商家*/
    String  updateProvide(Provide provide);
    /** 更改商家密码*/
    String  changePassword(String pId, String newPassword);
    /** 添加商家*/
    String  insertProvide(Provide provide);

}
