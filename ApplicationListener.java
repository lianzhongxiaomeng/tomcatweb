package com.dudu.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

//@WebListener
public class ApplicationListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("application被销毁了");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("application被创建出来了，这里可以做一些初始化的事情");
	}

}
