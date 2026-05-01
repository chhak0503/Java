package sub1;

/**
 * 날짜 : 2026/04/27
 * 이름 : 김철학
 * 내용 : 2장 Java 변수 실습
 */
public class VariableTest {

	public static void main(String[] args) {
		
		// 변수(Variable)
		int a = 1; // a 변수 선언과 초기화
		int b = 3; // b 변수 선언과 초기화
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		a = 4; // 재할당
		b = 7; // 재할당
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		
		// 상수(Constant) - 한번 초기화된 값으로 고정된 변수
		final int NUM = 5;
		
		// NUM = 9; 상수는 재할당 안됨, 최초값으로 고정
		System.out.println("NUM : " + NUM);		
	}
}
