package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * 날짜 : 2024/07/25
 * 이름 : 김철학
 * 내용 : 자바 Select 실습하기
 */

class User1VO { // VO(Value Object) : 데이터베이스의 개체(Row)를 자바 객체로 처리할때 사용하는 오브젝트
	
	private String user_id;
	private String name;
	private String hp;
	private int age;
		
	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User1 [user_id=" + user_id + ", name=" + name + ", hp=" + hp + ", age=" + age + "]";
	}	
}


public class SelectTest {

	
	public static void main(String[] args) {
		
		// DB정보
		final String HOST = "jdbc:oracle:thin:@localhost:1521:xe";
		final String USER = "chhak0503";
		final String PASS = "1234";
		
		// 조회 결과 반환용 리스트 생성
		List<User1VO> users = new ArrayList<>();		
		
		try {
			// 데이터베이스 접속
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			// SQL 실행객체 생성
			Statement stmt = conn.createStatement();
			
			// SQL 실행
			String sql = "SELECT * FROM USER1";
			ResultSet rs = stmt.executeQuery(sql); // SELECT문의 executeQuery()으로 실행하고 ResultSet 반환!!!!
			
			// 결과처리(일반적으로 리스트 생성)
			while(rs.next()) { // 커서를 다음 Row로 이동시킴, 이동할 Row가 없으면 false
				
				// 커서가 가리키는 Row의 각 컬럼값을 추출해서 VO객체 초기화				
				User1VO vo = new User1VO();
				vo.setUser_id(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));
				
				// 리스트 삽입
				users.add(vo);
			}
			
			// 데이터베이스 종료
			rs.close();
			stmt.close();
			conn.close();			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		// 리스트 출력
		for(User1VO user : users){
			System.out.println(user);
		}
		
		
		System.out.println("Select 완료...");
	}
}












