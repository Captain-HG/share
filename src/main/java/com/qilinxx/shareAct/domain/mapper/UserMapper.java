package com.qilinxx.shareAct.domain.mapper;


import com.qilinxx.shareAct.domain.model.User;

import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.HashMap;
import java.util.List;


@Repository
public interface UserMapper extends Mapper<User> {

    /** 账号密码查询*/
    List<User> selectByAccountAndPassword(User user);
    User selectByAccount(String account);
}