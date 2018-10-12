package com.qilinxx.shareAct.service.Impl;



import com.qilinxx.shareAct.domain.mapper.UserMapper;
import com.qilinxx.shareAct.domain.model.User;
import com.qilinxx.shareAct.service.UserService;
import com.qilinxx.shareAct.util.DateKit;
import com.qilinxx.shareAct.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
		String uu32 = UUID.UU32();
		user.setuId(uu32);
		Date now = DateKit.getNow();
		long timeLong = DateKit.getUnixTimeLong(now);
		user.setuCreateTime((int) timeLong);
		return userMapper.insert(user);
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
        User user=new User();
        user.setuAccount(account);
        user.setuPassword(password);
        List<User> userList = userMapper.selectByAccountAndPassword(user);
        System.out.println(userList);
        return  userList;
	}

	@Override
	public User selectByAccount(String account) {
		return userMapper.selectByAccount(account);
	}

	@Override
	public List<User> selectAll() {
		return userMapper.selectAll();
	}

	@Override
	public String stopUser(String uId) {
		User user = userMapper.selectByPrimaryKey(uId);
		user.setuState("0");
		userMapper.updateByPrimaryKeySelective(user);
		return "停用了用户:"+user.getuName();
	}

	@Override
	public String startUser(String uId) {
		User user = userMapper.selectByPrimaryKey(uId);
		user.setuState("1");
		userMapper.updateByPrimaryKeySelective(user);
		return "启用了用户:"+user.getuName();
	}

	@Override
	public void update(User user) {
		userMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public void changePassword(String uId, String newPassword) {
		User user = userMapper.selectByPrimaryKey(uId);
		user.setuPassword(newPassword);
		userMapper.updateByPrimaryKeySelective(user);

	}


}
