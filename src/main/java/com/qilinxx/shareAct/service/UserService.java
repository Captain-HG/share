package com.qilinxx.shareAct.service;


import com.qilinxx.shareAct.domain.model.User;
import com.qilinxx.shareAct.service.Impl.UserException;

import java.util.List;

public interface UserService {
    /**通过id查找出用户*/
    User selectById(String userId);
    /**保存用户,注册*/
    int registerUser(User user);
    boolean validateUser(String account);               //通过账号验证用户是否已存在
    /**登录 */
    User login(User form) throws UserException;
     /** 根据用户账号密码查询*/
    List<User> selectByAccountAndPassword(String account, String password);
    /** 根据账号查询唯一性  */
    User selectByAccount(String account);
    /** 查询所有用户*/
    List<User> selectAll();
    /** 停用该用户，根据id*/
     String  stopUser(String uId);
    /** 启用该用户，根据id*/
    String  startUser(String uId);
    /** 更新对象*/
    String update(User user);
    /** 设置新的密码*/
    void changePassword(String uId, String newpassword);

    User getUserByGuid(String guid);                    // 通过guid查找出用户
    void updateInviterUserCounts(String inviterGuid);   //更新邀请者的邀请人数
    User register(String account,String password,String username) throws UserException;      //校验登录信息

}
