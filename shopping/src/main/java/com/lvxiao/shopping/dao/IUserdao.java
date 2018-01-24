package com.lvxiao.shopping.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lvxiao.shopping.pojo.User;

public interface IUserdao {

	
	public boolean register(@Param("uname")String uname,@Param("upassword")String upassword,@Param("registertime")String registertime,@Param("photo")String photo,@Param("phone")String phone,@Param("email")String email);//ע��
	public User userlogin(@Param("uname")String uname,@Param("upassword")String upassword);//��¼
	
	public List<User> oneuser(@Param("uid")String uid);//�����û�����
	public boolean updateuser(@Param("uid")String uid,@Param("photo")String photo,@Param("phone")String phone,@Param("email")String email);//�޸��û���Ϣ
	
	public List<User> alluser();//�����û���Ϣ
	public boolean deleteuser(@Param("uid")String uid);//ɾ���û�
}
