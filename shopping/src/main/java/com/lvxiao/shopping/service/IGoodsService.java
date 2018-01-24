package com.lvxiao.shopping.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.lvxiao.shopping.pojo.Goods;

public interface IGoodsService {
	    //��ѯ���л���(��ҳ)
		public void getAllByPage(HttpServletRequest request,Model model);
		
		//��ѯ��������
		public Goods getOne(String gid);
		
		//�����ѯ����
		public List<Goods> byType ( String type);
		
		//��ӻ���
		public boolean add (String gname,String releasetime,float price, String type,String gphoto, String describe, int uid, String state);
		
		//���»���
		public boolean update(String gname,String price, String describe, String state,String gphoto,String type, String gid);
		
		//ɾ����������
		public boolean delete(String gid);
}
