package com.lvxiao.shopping.service;

import java.util.List;

import com.lvxiao.shopping.pojo.User;

public interface IUserService {

	public boolean register(String uname,String upassword,String registertime,String photo,String phone,String email);//ע��
	public User userlogin(String uname,String upassword);//��¼
	
	public List<User> oneuser(String uid);//�����û�����
	public boolean updateuser(String uid,String photo,String phone,String email);//�޸��û���Ϣ
	
	public List<User> alluser();//�����û���Ϣ
	public boolean deleteuser(String uid);//ɾ���û�
}
