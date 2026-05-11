package sub1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 날짜 : 2026/05/11
 * 이름 : 김철학
 * 내용 : Java 예외처리 실습
 */
public class ExceptionTest {
	
	public static void main(String[] args) {
		
		//-----------------------------------------
		// 실행 예외(런타임 발생)
		//-----------------------------------------
		
		// 예외상황1 - 어떤 수를 0으로 나눌때
		int num1 = 1;
		int num2 = 0;
		
		try {
			int rs1 = num1 + num2;
			int rs2 = num1 - num2;
			int rs3 = num1 * num2;
			int rs4 = num1 / num2; // ArithmeticException 예외 발생!!!
		
			System.out.println("rs1 : " + rs1);
			System.out.println("rs2 : " + rs2);
			System.out.println("rs3 : " + rs3);
			System.out.println("rs4 : " + rs4);
			
		} catch (ArithmeticException e) {
			// ArithmeticException 예외가 발생할때 처리 블록
			System.out.println("예외발생! - " + e.getMessage());
		}
		
		// 예외상황2 - 배열의 인덱스를 잘못 참조할때
		int[] arr = {1, 2, 3, 4, 5};
		
		try { // 예외가 발생할 코드를 작성하는 코드 블록
			
			for(int i=0 ; i<=5 ; i++) {
				System.out.println("arr["+ i +"] : " + arr[i]);
			}
		}catch (ArrayIndexOutOfBoundsException e) { // 예외가 발생했을때 처리하는 코드 블록
			System.out.println("예외발생! - " + e.getMessage());
		}
		
		// 예외상황3 - 객체 생성하지 않고 메서드를 호출
		Animal animal = null;
		
		try {
			animal.move();	
		}catch (NullPointerException e) {
			System.out.println("예외발생! - " + e.getMessage());
		}
		
		// 예외상황4 - 잘못된 캐스팅(형변환, 다운캐스팅)
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		try {
			Tiger tiger = (Tiger) a1;
			Eagle eagle = (Eagle) a2;
			Shark shark = (Shark) a2; // 잘못된 캐스팅
			
		}catch (ClassCastException e) {
			System.out.println("예외발생! - " + e.getMessage());
		}
		
		//-----------------------------------------
		// 일반 예외(컴파일 타임 발생)
		//-----------------------------------------
		
		//Tiger tiger = new Tiger(); // 명시적 방법
		
		try {
			// 클래스 객체 동적 생성
			Class tigerClass = Class.forName("sub1.Tigerr"); // 문자열 정보를 가지고 클래스 정보 로드
			Constructor<?> constructor = tigerClass.getDeclaredConstructor();
			Tiger tiger = (Tiger) constructor.newInstance();
			
			tiger.move();
			tiger.hunt();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			System.out.println("예외처리 발생여부와 관계없이 마지막에 항상 처리되는 블록");
		}
		
		System.out.println("프로그램 정상 종료...");
	}
}








