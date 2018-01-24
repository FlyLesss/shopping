package com.lvxiao.shopping.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lvxiao.shopping.pojo.User;

public interface IUserdao {

	
	public boolean register(@Param("uname")String uname,@Param("upassword")String upassword,@Param("registertime")String registertime,@Param("photo")String photo,@Param("phone")String phone,@Param("email")String email);//注册
	public User userlogin(@Param("uname")String uname,@Param("upassword")String upassword);//登录
	
	public List<User> oneuser(@Param("uid")String uid);//单个用户数据
	public boolean updateuser(@Param("uid")String uid,@Param("photo")String photo,@Param("phone")String phone,@Param("email")String email);//修改用户信息
	
	public List<User> alluser();//所有用户信息
	public boolean deleteuser(@Param("uid")String uid);//删除用户
}
