package sub5;

/*
 * 날짜 : 2022/08/23
 * 이름 : 김철학
 * 내용 : Java 메서드 오버로딩 실습하기
 * 
 * 메서드 오버로딩(Overloading)
 *  - 동일한 이름으로 메서드를 매개변수로 구분한 메서드
 *  - 반환타입은 오버로딩에 영향을 미치지 않음
 */
public class MethodOverloading {
	
	public static void main(String[] args) {
		
		int    r1 = plus(1, 2);
		int    r2 = plus(1, 2, 3);
		double r3 = plus(1.0, 2.1);
		String r4 = plus("Hello", "World");
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
	}// main end
	
	public static int plus(int a, int b) {
		return a+b;
	}
	
	public static int plus(int a, int b, int c) {
		return a+b+c;
	}
	
	public static double plus(double a, double b) {
		return a+b;
	}
	
	public static String plus(String a, String b) {
		return a+b;
	}
	
}
