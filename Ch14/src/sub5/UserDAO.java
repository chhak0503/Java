package sub5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// Data Access Object(데이터베이스 CRUD 처리 객체)
public class UserDAO {
	
	// 싱글톤
	private static UserDAO instance = new UserDAO();
	public static UserDAO getInstance() {
		return instance;
	}
	private UserDAO() {}
	
	// DB정보
	private final String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
	private final String USER = "chhak";
	private final String PASS = "abc1234";
	
	// DB자원
	private Connection conn;
	private Statement stmt;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	// 커넥션 생성
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		// 1단계
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 2단계
		return DriverManager.getConnection(HOST, USER, PASS);
	}
	
	// CRUD 메서드
	public void insertUser(UserDTO user) {
		
		try {
			conn = getConnection();
			// 3단계
			psmt = conn.prepareStatement(SQL.INSERT_USER);
			psmt.setString(1, user.getUid());
			psmt.setString(2, user.getName());
			psmt.setString(3, user.getBirth());
			psmt.setString(4, user.getAddr());
			
			// 4단계
			psmt.executeUpdate();
			
			// 5단계
			// 6단계
			psmt.close();
			conn.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void selectUsers() {
		
		try {
			// 3단계
			// 4단계
			// 5단계
			// 6단계
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void selectUser() {
		
		try {
			// 3단계
			// 4단계
			// 5단계
			// 6단계
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateUser() {
		
		try {
			// 3단계
			// 4단계
			// 5단계
			// 6단계
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteUser() {
		
		try {
			// 3단계
			// 4단계
			// 5단계
			// 6단계
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}










