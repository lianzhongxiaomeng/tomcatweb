package com.dudu.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import com.dudu.model.User;
import com.dudu.service.UserService;

/**
 * Servlet implementation class LoginService
 */
@WebServlet("/login_do")
public class LoginService extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		UserService userService = new UserService();
		User user = userService.login(username, password);
		if(user!=null) {
			request.getSession().setAttribute("user", user);
			if(user.isAdmin()) {
//				response.sendRedirect(request.getContextPath()+"/admin/goods_list.jsp");
				response.sendRedirect(request.getContextPath()+"/admin/goods_list");
//				request.getRequestDispatcher("/admin/goods_list").forward(request, response);
			}else {
				request.getRequestDispatcher("/").forward(request, response);
			}
		}else {
			request.setAttribute("msg", "<font color='red'>用户名或者密码错误，请重新登录!</font>");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
	}

}
