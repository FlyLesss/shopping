package com.lvxiao.shopping.pojo;

public class Shoppingcart {

	String sid;
	String gid;
	String uid;
	String stime;
	String state;
	String s1;
	String s2;
	String s3;
	public Shoppingcart(String sid, String gid, String uid, String stime, String state, String s1, String s2,
			String s3) {
		super();
		this.sid = sid;
		this.gid = gid;
		this.uid = uid;
		this.stime = stime;
		this.state = state;
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	public Shoppingcart() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Shoppingcart [sid=" + sid + ", gid=" + gid + ", uid=" + uid + ", stime=" + stime + ", state=" + state
				+ ", s1=" + s1 + ", s2=" + s2 + ", s3=" + s3 + "]";
	}
	
	
}
