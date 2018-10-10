package com.qilinxx.shareAct.domain.mapper;


import com.qilinxx.shareAct.domain.model.User;

import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.HashMap;
import java.util.List;


@Repository
public interface UserMapper extends Mapper<User> {

    List<User> selectByAccountAndPassword(HashMap<String,Object> map);

    User selectByAccount();
}