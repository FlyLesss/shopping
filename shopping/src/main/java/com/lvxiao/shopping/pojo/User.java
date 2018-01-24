package com.lvxiao.shopping.pojo;

public class User {

	String uid;
	String uname;
	String upassword;
	String state;
	String registertime;
	String photo;
	String phone;
	String email;
	String u1;
	String u2;
	String u3;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getRegistertime() {
		return registertime;
	}
	public void setRegistertime(String registertime) {
		this.registertime = registertime;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getU1() {
		return u1;
	}
	public void setU1(String u1) {
		this.u1 = u1;
	}
	public String getU2() {
		return u2;
	}
	public void setU2(String u2) {
		this.u2 = u2;
	}
	public String getU3() {
		return u3;
	}
	public void setU3(String u3) {
		this.u3 = u3;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String uid, String uname, String upassword, String state, String registertime, String photo,
			String phone, String email, String u1, String u2, String u3) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upassword = upassword;
		this.state = state;
		this.registertime = registertime;
		this.photo = photo;
		this.phone = phone;
		this.email = email;
		this.u1 = u1;
		this.u2 = u2;
		this.u3 = u3;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upassword=" + upassword + ", state=" + state
				+ ", registertime=" + registertime + ", photo=" + photo + ", phone=" + phone + ", email=" + email
				+ ", u1=" + u1 + ", u2=" + u2 + ", u3=" + u3 + "]";
	}
	
	
}
