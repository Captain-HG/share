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
	public String update(User user) {
	return "更新了"+userMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public void changePassword(String uId, String newPassword) {
		User user = userMapper.selectByPrimaryKey(uId);
		user.setuPassword(newPassword);
		userMapper.updateByPrimaryKeySelective(user);
	}
   //-----------------------------login---------------------------------
	public User getUserByGuid(String guid){
		return userMapper.selectByPrimaryKey(guid);
	}

	public boolean validateUser(String account){
		User user = userMapper.selectByAccount(account);
		if(user==null){
			return false;
		}
		return true;
	}

	public User login(User form) throws UserException {//登录方法
		User user = userMapper.selectByAccount(form.getuAccount());
		if(user==null){
			throw new UserException("账号不存在！");
		}
		if(!user.getuPassword().equals(form.getuPassword())){
			throw new UserException("密码错误！");
		}
		return user;
	}


	@Override
	public User register(String account,String password,String username) throws UserException{//注册方法

		User u=userMapper.selectByAccount(account);
		if(u!=null){
			throw new UserException("该账号已被注册！");
		}
		User user = new User();
		user.setuId(UUID.UU32());
		user.setuAccount(account);
		user.setuPassword(password);
		user.setuName(username);
		user.setuCreateTime(DateKit.getCurrentUnixTime());
		user.setuState("1");
		userMapper.insert(user);
		return user;
	}

	public void updateInviterUserCounts(String inviterGuid){//更新邀请者，已邀请的人数

//		userMapper.updateUserByGuid(inviterGuid);
	}
}
