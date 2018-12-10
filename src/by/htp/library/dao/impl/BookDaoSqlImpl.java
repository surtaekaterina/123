package by.htp.library.dao.impl;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import by.htp.library.dao.BookDao;
import by.htp.library.entity.Book;

public class BookDaoSqlImpl implements BookDao {

	private static final String URL = "jdbc:mysql://localhost/library?serverTimezone=Europe/Moscow&useSSL=false";
	private static final String LOGIN = "root";
	private static final String PASSWORD = "1234";

	@Override
	public List<Book> readAll() {

		List<Book> books = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try (Connection conn = DriverManager.getConnection(URL, LOGIN, PASSWORD)) {

				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery("select * from book");
				Book book = null;
				while (rs.next()) {
					book = new Book(rs.getInt("id"), rs.getString("title"));
					books.add(book);
				}

			} catch (SQLException e) {

				e.printStackTrace();
			}
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		return books;
	}

}
