package main;

import java.util.List;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		System.out.println("*********************************");
		System.out.println("회원관리매니저 v1.0");
		System.out.println("*********************************");
		
		Scanner sc = new Scanner(System.in);		 
		
		while(true) {
			System.out.println("---------------------------------");
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
				List<User> users = UserDao.getInstance().selectUsers();
								 
				System.out.println("--------------전체조회-------------"); 
				for(User user : users) {
					System.out.println(user);
				}
				
			}else if(answer == 3) {
				// 데이터 검색
				System.out.print("이름검색 : ");
				String name = sc.next();
				
				User user = UserDao.getInstance().selectUser(name);
				
				System.out.println("--------------검색결과-------------"); 
				System.out.println(user);
				
			}else if(answer == 4) {
				// 데이터 삭제
				System.out.print("삭제아이디 : ");
				String uid = sc.next();
				
				int result = UserDao.getInstance().deleteUser(uid);
				
				if(result >= 1) {
					System.out.println("아이디 " + uid + " 삭제완료");	
				}else {
					System.out.println("아이디" + uid + " 사용자가 존재하지 않습니다.");
				}
			}
			
		}// while end
		
		sc.close();
		System.out.println("프로그램 종료...");
	}
}
