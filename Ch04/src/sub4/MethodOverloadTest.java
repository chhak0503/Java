package sub4;


/*
 * 날짜 : 2023/12/29
 * 이름 : 김철학
 * 내용 : 메서드 오버로드 실습하기
 * 
 * 메서드 오버로드(Overload)
 *  - 같은 이름의 메서드를 매개변수로 구분한 메서드
 *  - 매개변수 갯수, 타입으로 구분
 *  - 반환타입은 메서드 오버로드 지원 안됨
 */
public class MethodOverloadTest {

	public static void main(String[] args) {
		
		int    r1 = add(3);
		int    r2 = add(1, 2);
		double r3 = add(1.1, 2.1);
		String r4 = add("Hello", "World");
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4);
		
	}
	
	// 메서드 오버로딩
	public static int add(int a) {
		return a + a;
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static double add(double a, double b) {
		return a + b;
	}
	
	public static String add(String a, String b) {
		return a + b;
	}
}








