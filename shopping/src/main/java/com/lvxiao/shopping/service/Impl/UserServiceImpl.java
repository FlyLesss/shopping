package com.lvxiao.shopping.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lvxiao.shopping.dao.IUserdao;
import com.lvxiao.shopping.pojo.User;
import com.lvxiao.shopping.service.IUserService;

@Transactional
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	IUserdao userdao;
	
	
	public UserServiceImpl() {
		super();
		
	}

	public boolean register(String uname, String upassword, String registertime, String photo, String phone,
			String email) {
		userdao.register(uname, upassword, registertime, photo, phone, email);
		return true;
	}

	public User userlogin(String uname, String upassword) {
		
		return userdao.userlogin(uname, upassword);
	}

	@Override
	public List<User> oneuser(String uid) {
		
		return userdao.oneuser(uid);
	}

	@Override
	public boolean updateuser(String uid, String photo, String phone, String email) {
		if(userdao.updateuser(uid, photo, phone, email)){
			return true;
		}else{
			return false;
		}
		
	}

	@Override
	public List<User> alluser() {
		
		return userdao.alluser();
	}

	@Override
	public boolean deleteuser(String uid) {
		
		if(userdao.deleteuser(uid)){
			return true;
		}else{
			return false;
		}
	}

}
