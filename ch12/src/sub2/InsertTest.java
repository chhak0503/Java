package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 날짜 : 2024/07/25
 * 이름 : 김철학
 * 내용 : 자바 Insert 실습하기
 */
public class InsertTest {

	
	public static void main(String[] args) {
		
		// DB정보
		String host = "jdbc:oracle:thin:@localhost:1521:xe"; 
		String user = "chhak0503"; 
		String pass = "1234";		
		
		Connection conn = null; 
				
		try {
			// 데이터베이스 접속
			conn = DriverManager.getConnection(host, user, pass);
			
			// SQL 실행객체 생성(Statement, PreparedStatement)
			Statement stmt = conn.createStatement();
			
			// SQL 실행
			String sql = "INSERT INTO USER1 VALUES ('J102', '김춘추', '010-1212-2222', 30)";
			stmt.executeUpdate(sql);
			
			// 결과처리(SELECT문 일 경우)			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			// 데이터베이스 종료	
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
		System.out.println("Insert 완료...");
	}
}







