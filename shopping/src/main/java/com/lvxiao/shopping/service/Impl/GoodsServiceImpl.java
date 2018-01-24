package com.lvxiao.shopping.service.Impl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.lvxiao.shopping.dao.IGoodsdao;
import com.lvxiao.shopping.pojo.Goods;
import com.lvxiao.shopping.service.IGoodsService;
import com.lvxiao.shopping.util.PageUtil;

@Transactional
@Service
public class GoodsServiceImpl implements IGoodsService {

	@Autowired
	IGoodsdao goodsdao;

	@Override
	public Goods getOne(String gid) {

		return goodsdao.getOne(gid);
	}

	@Override
	public List<Goods> byType(String type) {

		return goodsdao.byType(type);
	}

	@Override
	public boolean add(String gname, String releasetime, float price, String type, String gphoto, String describe,
			int uid, String state) {
		if (goodsdao.add(gname, releasetime, price, type, gphoto, describe, uid, state))
			return true;
		return false;
	}

	@Override
	public boolean update(String gname, String price, String des, String state, String gphoto, String type,
			String gid) {
		if (goodsdao.update(gname, price, des, state, gphoto, type, gid))
			return true;
		return false;
	}

	@Override
	public boolean delete(String gid) {
		if (goodsdao.delete(gid))
			return true;
		return false;
	}

	@Override
	public void getAllByPage(HttpServletRequest request, Model model) {
		String pageNow = request.getParameter("pageNow");
		PageUtil pageUtil = null;
		List<Goods> goods = new ArrayList<Goods>();
		int totalCount = (int) goodsdao.getTotalCount();

		if (pageNow != null) {
			pageUtil = new PageUtil(totalCount, Integer.parseInt(pageNow));
			goods = this.goodsdao.getAllByPage(pageUtil.getStartPos(), pageUtil.getPageSize());
		} else {
			pageUtil = new PageUtil(totalCount, 1);
			goods = this.goodsdao.getAllByPage(pageUtil.getStartPos(), pageUtil.getPageSize());
		}
         System.out.println("size:"+goods.size());
		model.addAttribute("goods", goods);
		model.addAttribute("page", pageUtil);

	}

}
