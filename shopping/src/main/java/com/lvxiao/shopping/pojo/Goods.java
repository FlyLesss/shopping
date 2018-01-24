package com.lvxiao.shopping.pojo;

public class Goods {

	String gid;
	String gname;
	String releasetime;
	float price;
	String type;
	String gphoto;
	String des;
	int uid;
	String state;
	String g1;
	String g2;
	String g3;
	
	public String getGid() {
		return gid;
	}
	public void setGid(String gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getReleasetime() {
		return releasetime;
	}
	public void setReleasetime(String releasetime) {
		this.releasetime = releasetime;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getGphoto() {
		return gphoto;
	}
	public void setGphoto(String gphoto) {
		this.gphoto = gphoto;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getG1() {
		return g1;
	}
	public void setG1(String g1) {
		this.g1 = g1;
	}
	public String getG2() {
		return g2;
	}
	public void setG2(String g2) {
		this.g2 = g2;
	}
	public String getG3() {
		return g3;
	}
	public void setG3(String g3) {
		this.g3 = g3;
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", releasetime=" + releasetime + ", price=" + price
				+ ", type=" + type + ", gphoto=" + gphoto + ", des=" + des + ", uid=" + uid + ", state="
				+ state + ", g1=" + g1 + ", g2=" + g2 + ", g3=" + g3 + "]";
	}
	public Goods(String gid, String gname, String releasetime, float price, String type, String gphoto,
			String des, int uid, String state, String g1, String g2, String g3) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.releasetime = releasetime;
		this.price = price;
		this.type = type;
		this.gphoto = gphoto;
		this.des = des;
		this.uid = uid;
		this.state = state;
		this.g1 = g1;
		this.g2 = g2;
		this.g3 = g3;
	}
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
