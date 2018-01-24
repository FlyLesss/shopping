package com.lvxiao.shopping.pojo;

public class Order {

	String oid;
	String uid;
	String gid;
	String state;
	String otime;
	String o1;
	String o2;
	String o3;
	public Order(String oid, String uid, String gid, String state, String otime, String o1, String o2, String o3) {
		super();
		this.oid = oid;
		this.uid = uid;
		this.gid = gid;
		this.state = state;
		this.otime = otime;
		this.o1 = o1;
		this.o2 = o2;
		this.o3 = o3;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", uid=" + uid + ", gid=" + gid + ", state=" + state + ", otime=" + otime + ", o1="
				+ o1 + ", o2=" + o2 + ", o3=" + o3 + "]";
	}
	
	
}
