package com.lvxiao.shopping.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lvxiao.shopping.pojo.Goods;
import com.lvxiao.shopping.service.IGoodsService;

@Controller
@RequestMapping("/goods")
public class GoodsController {
	@Autowired
	IGoodsService goodsService;

	// 查询所有货物
	@RequestMapping(value = "/allgoods.htm", method = RequestMethod.GET)
	public String allGoods(HttpServletRequest req, Model model) {
		goodsService.getAllByPage(req, model);
		// System.out.print("size:"+goods.size());
		// session.setAttribute("goods",goods);
		return "forward:/index.jsp";
	}

	// 查询单个货物
	@RequestMapping(value = "/getonegood.htm")
	public String getOne(HttpServletRequest req, HttpSession session) {
		String gid = req.getParameter("gid");
		Goods good = goodsService.getOne(gid);
		session.setAttribute("good", good);
		return "updateGoods";
	}

	// 更新货物
	@RequestMapping(value = "/updategood.htm")
	public String  update(String gname,String price, String des,String state,String gphoto, String type,String gid,HttpServletRequest req)
	{
		
		if(goodsService.update(gname, price, des, state, gphoto, type, gid))
		    return "redirect:/goods/allgoods.htm";
		else
			return "/error";
	}

	// 删除货物
	@RequestMapping(value = "/delgoods.htm")
	public void delete(HttpServletRequest req, HttpServletResponse response) {
		String gid = req.getParameter("gid");
		String result = "{\"result\":\"error\"}";
		if (goodsService.delete(gid))
			result = "{\"result\":\"success\"}";
		response.setContentType("application/json");
		try {
			PrintWriter out = response.getWriter();
			out.write(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
