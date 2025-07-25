package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2024/07/25
 * 이름 : 김철학
 * 내용 : 자바 Update 실습하기
 */
public class UpdateTest {
	
	public static void main(String[] args) {		
		
		// DB정보
		String host = "jdbc:oracle:thin:@localhost:1521:xe"; 
		String user = "chhak0503"; 
		String pass = "1234";		
		
		try {
			// 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// SQL 실행객체 생성
			Statement stmt = conn.createStatement();
			
			// SQL 실행
			String sql = "UPDATE USER1 SET AGE=35 WHERE USER_ID='J101'";
			stmt.executeUpdate(sql);
			
			// 결과처리(SELECT일 때)
			
			// 데이터베이스 종료
			stmt.close();
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Update 완료...");
	}

}














