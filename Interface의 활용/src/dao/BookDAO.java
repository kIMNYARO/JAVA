package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.BookDTO;

public class BookDAO {

	public BookDAO(){
		
	}
	
	public BookDAO(BookDAO2 dao){
		this.dao = dao;
	}
	
	public ArrayList<BookDTO> select(String keyword) {
		ArrayList<BookDTO> list = new ArrayList<BookDTO>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String id = "java";
			String pw = "java";
			String url = "jdbc:mysql://localhost:3306/library";
			Connection con = DriverManager.getConnection(url, id, pw);
			String sql = 
			 "select btitle from testbook where btitle like ?";			
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%" + keyword + "%");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				String title = rs.getString("btitle");
				BookDTO dto = new BookDTO();
				dto.setBtitle(title);
				list.add(dto);
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch(Exception e) {
			System.out.println(e);
		}
		
		return list;		
	}

	public boolean insert(BookDTO dto) {
		boolean result = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String id = "java";
			String pw = "java";
			String url = "jdbc:mysql://localhost:3306/library";
			Connection con = DriverManager.getConnection(url, id, pw);
			String sql = 
			 "insert into testbook values(?)";			
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getBtitle());
			int count = pstmt.executeUpdate();
			if(count == 1) {
				result = true;
			}
			pstmt.close();
			con.close();
		} catch(Exception e) {
			System.out.println(e);
		}
		
		return result;		
	}

}
