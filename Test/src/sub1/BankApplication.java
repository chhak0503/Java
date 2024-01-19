package sub1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApplication {
	
	private static List<Account> accounts = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean run = true;
		
		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");

			// 내용
			
			
			
			
		}
		System.out.println("프로그램 종료");
	}

	// 계좌생성하기
	private static void createAccount() {
		
	}

	// 계좌목록보기
	private static void accountList() {
		
	}

	// 예금하기
	private static void deposit() {
		
	}

	// 출금하기
	private static void withdraw() {
		
	}

	// Account 리스트에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		return null;
	}
}