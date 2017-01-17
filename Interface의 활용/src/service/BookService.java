package service;

import java.util.ArrayList;

import dao.BookDAO;
import dto.BookDTO;

public class BookService {

	public ArrayList<BookDTO> findBookByKeyword(String keyword) {

		BookDAO dao = new BookDAO();
		ArrayList<BookDTO> list = dao.select(keyword);
		return list;
	}
	
	public boolean bookRegister(BookDTO dto) {

		BookDAO dao = new BookDAO();
		boolean result = dao.insert(dto);
		return result;
	}
	

}
