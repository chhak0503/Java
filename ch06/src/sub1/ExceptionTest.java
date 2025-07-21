package sub1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * 날짜 : 2025/07/21
 * 이름 : 김철학
 * 내용 : 자바 예외처리 실습하기
 */
public class ExceptionTest {

	public static void main(String[] args) {
		
		//---------------------------------------------
		// 실행예외(Runtime) - 프로그램이 실행 중에 발생하는 에러
		//---------------------------------------------
		// 예외상황1 - 어떤 수를 0으로 나눌때
		int num1 = 1;
		int num2 = 0;
		
		try {
			// 예외가 발생할 수 있는 코드 작성
			int r1 = num1 + num2;
			int r2 = num1 - num2;
			int r3 = num1 * num2;
			int r4 = num1 / num2;		
				
			System.out.println("r4 : " + r4);
			
		}catch (Exception e) {
			// 예외가 발생했을때
			System.out.println("예외내용 : " + e.getMessage());
		}
		
		// 예외상황2 - 배열 인덱스 참조가 잘못됐을때
		int[] arr  = {1, 2, 3, 4, 5};
		
		try {
			for(int i=0 ; i<=arr.length ; i++) {
				System.out.println(arr[i]);
			}
		}catch (Exception e) {
			// 예외내용 콘솔 출력
			e.printStackTrace();
		}		
		
		// 예외상황3 - 객체 생성 안하고 메서드 호출
		Animal animal = null;
		
		try {
			animal.move();	
		}catch (Exception e) {
			e.printStackTrace();
		}	
		
		// 예외상황4 - 잘못된 캐스팅
		Animal a1 = new Tiger(); // 업캐스팅
		Animal a2 = new Eagle();
		
		try {
			Tiger tiger = (Tiger) a2; // 잘못된 다운캐스팅
		}catch(ClassCastException e) {
			e.printStackTrace();
		}
		
		//---------------------------------------------
		// 일반예외(Compile-time) - 프로그램을 실행하기 전에 발생하는 에러
		//---------------------------------------------
		
		
		// 동적 객체 생성
		try {
			Class cs = Class.forName("sub1.Tiger"); // 문자열 정보로 클래스 로드
			Constructor<?> constructor = cs.getDeclaredConstructor(); // 클래스 객체 생성
			Tiger tiger = (Tiger) constructor.newInstance(); // 객체 생성
			
			tiger.move();
			tiger.hunt();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		
		
		
		System.out.println("프로그램 정상 종료...");
	}
	
}










