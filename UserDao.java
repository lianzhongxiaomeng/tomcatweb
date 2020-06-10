package com.dudu.dao;

import com.dudu.model.User;
import com.dudu.util.DBUtil;

public class UserDao {

	public boolean isExist(String username) {
		return DBUtil.userMap.containsKey(username);
	}
	public boolean addUser(String username,String password,int age,String sex) {
		if(DBUtil.userMap.containsKey(username)) {
			return false;
		}
		User user = new User(username,password,age,sex,false);
		DBUtil.userMap.put(username, user);
		return true;
	}
	public User getUserByUP(String username,String password) {
		if(isExist(username)==false) {
			return null;
		}
		User user = DBUtil.userMap.get(username);
		if(user.getPassword().equals(password)) {
			return user;
		}else {
			return null;
		}
	}
}
