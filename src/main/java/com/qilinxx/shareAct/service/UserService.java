package com.qilinxx.shareAct.service;


import com.qilinxx.shareAct.domain.model.User;

import java.util.List;

public interface UserService {
    /**通过id查找出用户*/
    User selectById(String userId);
    /**保存用户,注册*/
    int registerUser(User user);
    boolean validateUser(String account);               //通过账号验证用户是否已存在
    /**登录 */
    User login(User form) ;
     /** 根据用户账号密码查询*/
    List<User> selectByAccountAndPassword(String account, String password);
    /** 根据账号查询唯一性  */
    User selectByAccount(String account);


}
