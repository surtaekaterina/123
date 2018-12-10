package by.htp.web.command.impl;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.library.entity.Book;
import by.htp.library.service.CatalogService;
import by.htp.library.service.impl.CatalogServiceImpl;
import by.htp.web.command.BasicAction;

public class TwoActionImpl implements BasicAction{
	
	private CatalogService catalogService = new CatalogServiceImpl();

	@Override
	public void performAction(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		List<Book> books = catalogService.getCatalogBooks();
		System.out.println("Two");
		
		resp.getWriter().println(books);
		
	}

}
