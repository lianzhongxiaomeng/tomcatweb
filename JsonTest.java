package com.dudu.util;

import com.alibaba.fastjson.JSON;
import com.dudu.model.Goods;

public class JsonTest {
	public static void main(String[] args) {
//		Goods goods = new Goods("Ïã½¶","ÏÄÍşÒÄÏã½¶",100,400);
//		String jsonString = JSON.toJSONString(goods);
//		System.out.println(jsonString);
		
		String s  = "{\"des\":\"ÏÄÍşÒÄÏã½¶\",\"inventory\":400,\"name\":\"Ïã½¶\",\"price\":100}";
		Goods parseObject = JSON.parseObject(s, Goods.class);
		System.out.println(parseObject);
	}
}
