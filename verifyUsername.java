package com.dudu.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dudu.service.UserService;

/**
 * Servlet implementation class verfiyUsername
 */
@WebServlet("/verifyusername")
public class verifyUsername extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		UserService service = new UserService();
		boolean isExist = service.isExist(username);
		response.getWriter().append("{\"isSuccess\":"+!isExist+"}");
	}

}
