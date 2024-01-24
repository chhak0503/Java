package sub5;

import java.util.Scanner;

/**
 * 날짜 : 2024/01/24
 * 이름 : 김철학
 * 내용 : CRUD 실습하기
 */
public class CRUDTest {
	public static void main(String[] args) {
		
		System.out.println("회원관리매니저 v1.0");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 수정:4, 삭제:5");
			System.out.print("선택> ");
			
			int answer = sc.nextInt();
			
			if(answer == 0) {
				break;
			}else if(answer == 1) {
				// 입력
				UserDTO dto = new UserDTO();
				
				System.out.print("아이디 입력 : ");
				dto.setUid(sc.next());
				
				System.out.print("이름 입력 : ");
				dto.setName(sc.next());
				
				System.out.print("생년월일 입력 : ");
				dto.setBirth(sc.next());
				
				System.out.print("주소 입력 : ");
				dto.setAddr(sc.next());
							
				UserDAO dao = UserDAO.getInstance();
				dao.insertUser(dto);
				
				System.out.println("등록완료...");
				
				
			}else if(answer == 2) {
				// 조회
				
			}else if(answer == 3) {
				// 검색
				
			}else if(answer == 4) {
				// 수정
				
			}else if(answer == 5) {
				// 삭제
				
			}
		}
		
		sc.close();
		System.out.println("회원관리매니저 종료...");
	}
}










