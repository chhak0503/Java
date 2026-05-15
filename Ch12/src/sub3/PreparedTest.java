package sub3;

import java.util.Scanner;

/**
 * 날짜 : 2026/05/15
 * 이름 : 김철학
 * 내용 : Java PreparedStatement 실습
 */
public class PreparedTest {

	public static void main(String[] args) {
		
		System.out.println("데이터베이스 매니지먼트 프로그램");
		System.out.println("작업 선택하세요.(0:종료, 1:입력, 2:조회, 3:수정, 4:삭제)");
		
		Scanner sc = new Scanner(System.in);		
		boolean exit = false;
		
		while(!exit) {			
			System.out.print("선택: ");
			int choiced = sc.nextInt();
			
			switch (choiced) {
			case 0:
				exit = true;
				break;
			case 1:
				System.out.println("입력 작업 시작!!!");
				
				System.out.print("아이디 입력 : ");
				String userid = sc.next();
				
				System.out.print("이름 입력 : ");
				String name = sc.next();
				
				System.out.print("휴대폰 입력 : ");
				String hp = sc.next();
				
				System.out.print("나이 입력 : ");
				int age = sc.nextInt();
				
				User1DTO dto = new User1DTO();
				dto.setUserid(userid);
				dto.setName(name);
				dto.setHp(hp);
				dto.setAge(age);
				
				// 데이터베이스 저장
				User1DAO.insert(dto);
				
				System.out.println("등록 성공!!!");
				break;
			case 2:
				System.out.println("조회 작업...");
				break;
			case 3:
				System.out.println("수정 작업...");
				break;			
			case 4:
				System.out.println("삭제 작업...");
				break;
			}	
		}
		System.out.println("프로그램 종료...");
	}
	
}













