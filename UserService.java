package com.dudu.service;

import com.dudu.dao.UserDao;
import com.dudu.model.User;

public class UserService {
	
	public boolean register(String username,String password,int age,String sex) {
		
		UserDao userDao = new UserDao();
		boolean addUser = userDao.addUser(username, password, age, sex);
		return addUser;
	}
	public User login(String username,String password) {
		UserDao userDao = new UserDao();
		User userByUP = userDao.getUserByUP(username, password);
		return userByUP;
	}
	public boolean isExist(String username){
		return new UserDao().isExist(username);
		
	}
}
