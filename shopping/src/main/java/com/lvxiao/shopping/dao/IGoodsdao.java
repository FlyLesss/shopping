package com.lvxiao.shopping.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lvxiao.shopping.pojo.Goods;

public interface IGoodsdao {

	//查询所有货物
	public List<Goods> getAllByPage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize);
	
	//查询货物总数
	
	public long getTotalCount();
	
	//查询单个货物
	public Goods getOne(@Param("gid")String gid);
	
	//分类查询货物
	public List<Goods> byType (@Param("type") String type);
	
	//添加货物
	public boolean add (@Param("gname")String gname,@Param("releasetime")String releasetime,@Param("price")float price,@Param("type") String type,@Param("gphoto")String gphoto,@Param("des") String des,@Param("uid") int uid,@Param("state") String state);
	
	//更新货物
	public boolean update(@Param("gname")String gname,@Param("price")String price,@Param("des") String des,@Param("state") String state,@Param("gphoto")String gphoto,@Param("type") String type,@Param("gid") String gid);
	
	//删除单个货物
	public boolean delete(@Param("gid")String gid);
	
	
}
