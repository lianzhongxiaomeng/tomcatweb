package com.dudu.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dudu.model.Goods;
import com.dudu.service.GoodsService;
@WebServlet("/admin/goods_list")
public class GoodsListServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		GoodsService goodsService = new GoodsService();
		List<Goods> allGoods = goodsService.selectAllGoods();
		req.setAttribute("list", allGoods);
		req.getRequestDispatcher("/admin/goods_list.jsp").forward(req, resp);
	}
	
}
