package com.customtag.acction;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.customtag.entity.User;

@WebServlet("/loginAction.do")
public class LoginAction extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user=new User();
		//模拟设置权限
		user.setRight("userAction_deltedd.do");
		req.getSession().setAttribute("user", user);
		resp.sendRedirect("test.jsp");
	}

}
