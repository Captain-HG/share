package com.qilinxx.shareAct.service.Impl;



import com.qilinxx.shareAct.domain.mapper.UserMapper;
import com.qilinxx.shareAct.domain.model.User;
import com.qilinxx.shareAct.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper userMapper;
	@Override
	public User selectById(String userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

	@Override
	public int registerUser(User user) {
		return 0;
	}


	@Override
	public boolean validateUser(String account) {
		return false;
	}

	@Override
	public User login(User form) {
		return null;
	}

	@Override
	public List<User> selectByAccountAndPassword(String account, String password) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("account",account);
        map.put("password",password);
        List<User> userList = userMapper.selectByAccountAndPassword(map);
        System.out.println(userList);
        return  userList;
	}

	@Override
	public User selectByAccount(String account) {
		return userMapper.selectByAccount();
	}


}
