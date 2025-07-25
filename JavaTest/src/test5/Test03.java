package test5;


import java.util.Scanner;

class LoginException extends Exception {
	
	public LoginException(String msg) {
		super(msg);
	}
}

public class Test03 {
	
	public static void main(String[] args) {
		
		String userId = "a101";
		String userPw = "abc1234";
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("아이디 : ");
			String inputId = sc.nextLine();
			
			System.out.print("비밀번호 : ");
			String inputPw = sc.nextLine();
			
			if(!userId.equals(inputId)) {
				
				throw new LoginException("아이디가 올바르지 않습니다.");
				
			}else if(!userPw.equals(inputPw)) {
								
				throw new LoginException("비밀번호가 올바르지 않습니다.");
				
			}else {
				System.out.println("로그인 성공!");
			}
			
		}catch (LoginException e) {
			System.out.println(e.getMessage());
		}
	}
}