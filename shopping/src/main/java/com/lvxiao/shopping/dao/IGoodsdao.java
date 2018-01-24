package com.lvxiao.shopping.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lvxiao.shopping.pojo.Goods;

public interface IGoodsdao {

	//��ѯ���л���
	public List<Goods> getAllByPage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize);
	
	//��ѯ��������
	
	public long getTotalCount();
	
	//��ѯ��������
	public Goods getOne(@Param("gid")String gid);
	
	//�����ѯ����
	public List<Goods> byType (@Param("type") String type);
	
	//��ӻ���
	public boolean add (@Param("gname")String gname,@Param("releasetime")String releasetime,@Param("price")float price,@Param("type") String type,@Param("gphoto")String gphoto,@Param("des") String des,@Param("uid") int uid,@Param("state") String state);
	
	//���»���
	public boolean update(@Param("gname")String gname,@Param("price")String price,@Param("des") String des,@Param("state") String state,@Param("gphoto")String gphoto,@Param("type") String type,@Param("gid") String gid);
	
	//ɾ����������
	public boolean delete(@Param("gid")String gid);
	
	
}
