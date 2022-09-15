package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

class User {
	private String uid;
	private String name;
	private String hp;
	private int age;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
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
}

class UserDao {	
	// 싱글톤
	private static UserDao instance = new UserDao();
	public static UserDao getInstance() {
		return instance;
	}
	private UserDao() {}
	
	// DB정보
	String host = "jdbc:mysql://127.0.0.1:3306/java1db";
	private String user = "root";
	private String pass = "1234";
	
	// SQL
	private final String INSERT_USER = "INSERT INTO `User3` VALUES (?,?,?,?)";
	private final String SELECT_USERS = "SELECT * FROM `User3`";
	private final String SELECT_USER = "SELECT * FROM `User3` WHERE `name`=?";
	private final String DELETE_USER = "DELETE FROM `User3` WHERE `name`=?";
	
		
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(host, user, pass);
		return conn;
	}
	
	public void insertUser(User user) {
		try {
			Connection conn = getConnection();			
			PreparedStatement psmt = conn.prepareStatement(INSERT_USER);
			psmt.setString(1, user.getUid());
			psmt.setString(2, user.getName());
			psmt.setString(3, user.getHp());
			psmt.setInt(4, user.getAge());
			psmt.executeUpdate();
			psmt.close();
			conn.close();
		}catch(SQLIntegrityConstraintViolationException e) {
			System.out.println("아이디 또는 휴대폰 중복입니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	public void selectUsers() {}
	public void selectUser() {}
	public void deleteUser() {}
}

public class CRUDTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		 
		
		System.out.println("*****************************");
		System.out.println("");
		System.out.println("*****************************");
		
		while(true) {
			System.out.println("-------------------------");
			System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 삭제:4");
			System.out.print("선택 : ");
			int answer = sc.nextInt();
			
			if(answer == 0) {
				break;
			}else if(answer == 1) {
				// 데이터 입력
				User user = new User();
				
				System.out.print("아이디 입력 : ");
				user.setUid(sc.next());
				
				System.out.print("이름 입력 : ");
				user.setName(sc.next());
				
				System.out.print("휴대폰 입력 : ");
				user.setHp(sc.next());
				
				System.out.print("나이 입력 : ");
				user.setAge(sc.nextInt());
				
				UserDao.getInstance().insertUser(user);
				System.out.println("입력완료...");
				
			}else if(answer == 2) {
				// 데이터 조회
				
				
				
			}else if(answer == 3) {
				// 데이터 검색
			}else if(answer == 4) {
				// 데이터 삭제
			}
			
		}// while end
		
		sc.close();
		System.out.println("프로그램 종료...");
	}
}
