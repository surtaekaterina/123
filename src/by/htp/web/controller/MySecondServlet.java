package by.htp.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.web.command.BasicAction;
import by.htp.web.command.CommandManager;

@WebServlet("/MySecondServlet")
public class MySecondServlet extends HttpServlet {

	public MySecondServlet() {
		super();
		System.out.println("constructor");

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("DoGet");

		String action = req.getParameter("action");

		System.out.println("action +" + action);
		System.out.println(req.getHeader("User-Agent"));
		
		if(action!=null) {
			BasicAction basicAction = CommandManager.defineAction(action);
			basicAction.performAction(req, resp);
		}

		/*switch (action) {
		case "1":
			resp.getWriter().println("<h1 style='color: red'> one </h1>");
		case "2":
			resp.getWriter().println("<h1 style='color: blue'> two </h1>");
		default:
			resp.getWriter().println("<h1 style='color: red'> incorrect input </h1>");
		}*/
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		super.service(req, resp);
		System.out.println("service");
	}

	@Override
	public void destroy() {

		super.destroy();
		System.out.println("destroy");
	}

	@Override
	public void init() throws ServletException {

		super.init();
		System.out.println("init");
	}

}
