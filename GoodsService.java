package com.dudu.service;

import java.util.List;

import com.dudu.dao.GoodsDao;
import com.dudu.model.Goods;

public class GoodsService {

	public List<Goods> selectAllGoods(){
		GoodsDao goodsDao = new GoodsDao();
		List<Goods> allGoods = goodsDao.getAllGoods();
		return allGoods;
	}
	
}
