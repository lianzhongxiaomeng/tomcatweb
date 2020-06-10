package com.dudu.dao;

import java.util.List;

import com.dudu.model.Goods;
import com.dudu.util.DBUtil;

public class GoodsDao {

	public List<Goods> getAllGoods(){
		return DBUtil.goodList;
	}
	
}
