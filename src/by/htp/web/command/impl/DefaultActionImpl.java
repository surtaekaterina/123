package by.htp.web.command.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.web.command.BasicAction;

public class DefaultActionImpl implements BasicAction{

	@Override
	public void performAction(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("Default");
		
	}

}
