package by.htp.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyFirstServlet
 */
@WebServlet("/MyFirstServlet")
public class MyFirstServlet extends HttpServlet {

	{
		System.out.println("Hello from Servlet");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doget");
		String login = req.getParameter("login");
		if (login.equals("user")) {
			System.out.println("user role");
			resp.getWriter().println("user_role");
		} else if (login.equals("admin")) {
			System.out.println("admin role");
			resp.getWriter().println("admin_role");
		} else {
			System.out.println("guest role");
			resp.getWriter().println("<h1 style='color:red'>guest_role</h1>");
		}
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
	}

	@Override
	public void init() throws ServletException {

		super.init();
		System.out.println("init");
	}

}
