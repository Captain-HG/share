package com.qilixxx.shareAct.domain.mapper;


import com.qilixxx.shareAct.domain.model.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface UserMapper extends Mapper<User> {
}