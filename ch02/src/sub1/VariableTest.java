package sub1;

/**
	날짜 : 2025/07/07
	이름 : 김철학
	내용 : 변수 실습하기  
 */
public class VariableTest {

	public static void main(String[] args) {
		
		// 변수(Variable)
		int a = 3; // 변수 선언 및 초기화
		int b = 7;
	
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		// 재할당
		a = 5;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		
		// 상수(Constant) - 상수는 대문자 표기
		final int NUM = 10;
		
		// 상수는 초기화 된 값으로 고정되기 때문에 재할당 안됨
		// num = 11;		
		System.out.println("NUM : " + NUM);
		
	}
}
