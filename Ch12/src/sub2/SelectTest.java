package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 날짜 : 2026/05/15
 * 이름 : 김철학
 * 내용 : Java CRUD Select 실습
 */
public class SelectTest {
	
	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "chhak0503";
		String pass = "1234";
		
		try {
			// 1) DB 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 2) SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			// 3) SQL 실행
			String sql = "SELECT * FROM User1";
			ResultSet rs = stmt.executeQuery(sql); // SELECT일 경우에는 반드시 executeQuery()!!!
			
			// 4) SQL 결과처리(SELECT 작업일 경우)
			while(rs.next()) { // 커서를 다음 튜플(행)로 이동				
				System.out.println("--------------------------");
				System.out.println("아이디 : " + rs.getString(1)); 	// 커서가 가리키는 튜플의 1번 컬럼값 문자열로 참조
				System.out.println("이름 : " + rs.getString(2));		// 커서가 가리키는 튜플의 2번 컬럼값 문자열로 참조   
				System.out.println("휴대폰 : " + rs.getString(3));	// 커서가 가리키는 튜플의 3번 컬럼값 문자열로 참조
				System.out.println("나이 : " + rs.getInt(4));			// 커서가 가리키는 튜플의 4번 컬럼값 숫자로 참조
			}			
			
			// 5) DB 연결해제
			rs.close(); 	// ResultSet 객체 해제
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("SELECT 완료...");
		
	}
}









