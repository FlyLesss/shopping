package com.lvxiao.shopping.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.lvxiao.shopping.pojo.Goods;

public interface IGoodsService {
	    //查询所有货物(分页)
		public void getAllByPage(HttpServletRequest request,Model model);
		
		//查询单个货物
		public Goods getOne(String gid);
		
		//分类查询货物
		public List<Goods> byType ( String type);
		
		//添加货物
		public boolean add (String gname,String releasetime,float price, String type,String gphoto, String describe, int uid, String state);
		
		//更新货物
		public boolean update(String gname,String price, String describe, String state,String gphoto,String type, String gid);
		
		//删除单个货物
		public boolean delete(String gid);
}
