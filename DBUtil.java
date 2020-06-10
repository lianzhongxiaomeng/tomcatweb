package com.dudu.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dudu.model.Goods;
import com.dudu.model.User;

public class DBUtil {

	public static Map<String, User> userMap = new HashMap<String, User>(); 
	public static List<Goods> goodList = new ArrayList<Goods>();
	
	static {
		addUser(new User("恋冢筱梦","123",15,"男",true));
		addUser(new User("kukua","123",13,"女",true));
		
		goodList.add(new Goods("香蕉","夏威夷香蕉",100,400));
		goodList.add(new Goods("苹果","好吃",200,500));
		goodList.add(new Goods("火龙果","很好吃",50,200));
		goodList.add(new Goods("橘子","非常好吃",60,150));
		goodList.add(new Goods("梨子","很大",90,200));
		goodList.add(new Goods("西瓜","非常大",150,300));
		goodList.add(new Goods("香瓜","很香",200,350));
		goodList.add(new Goods("榴莲","很好看",180,450));
	}
	
	private static void addUser(User user) {
		userMap.put(user.getUsername(), user);
	}
}
