package com.lvxiao.shopping.service;

import java.util.List;

import com.lvxiao.shopping.pojo.User;

public interface IUserService {

	public boolean register(String uname,String upassword,String registertime,String photo,String phone,String email);//注册
	public User userlogin(String uname,String upassword);//登录
	
	public List<User> oneuser(String uid);//单个用户数据
	public boolean updateuser(String uid,String photo,String phone,String email);//修改用户信息
	
	public List<User> alluser();//所有用户信息
	public boolean deleteuser(String uid);//删除用户
}
