package sub2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 날짜 : 2024/01/08
 * 이름 : 김철학
 * 내용 : Java 예외 던지기 실습하기
 */
public class ThrowsTest {

	public static void main(String[] args) {
			
		try {
			method1(10);
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		System.out.println("프로그램 정상 종료...");
	}
	
	public static void method1(int n1) throws Exception { // method1 호출한 곳으로 예외 던지기
		
		method2(n1);
		
	}
	
	public static void method2(int n2) throws Exception { // method2 호출한 곳으로 예외 던지기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력 : ");
		int input = sc.nextInt(); // InputMismatchException 발생 가능
		 
		int result = n2 / input;  // ArithmeticException 발생 가능 
		
		System.out.println("result : " + result);
	}
}

