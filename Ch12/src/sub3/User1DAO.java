package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class User1DAO {

	// DB 정보
	private static String host = "jdbc:mysql://127.0.0.1:3306/studydb";
	private static String user = "chhak0503";
	private static String pass = "1234";
	
	public static void insert(User1DTO dto) {
		
		try {
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// PreparedStatement(미리 준비가 완료된 SQL을 사용하는 실행객체)
			String sql = "INSERT INTO User1 VALUES (?,?,?,?)"; // ? 쿼리 파라미터 사용
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			// 쿼리 파라미터 데이터 매핑(사상)
			psmt.setString(1, dto.getUserid());
			psmt.setString(2, dto.getName());
			psmt.setString(3, dto.getHp());
			psmt.setInt(4, dto.getAge()); // 4번째 쿼리 파리미터에 숫자로 데이터 매핑
			
			// SQL 실행
			psmt.executeUpdate();
			
			// 종료
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
