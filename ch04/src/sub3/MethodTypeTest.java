package sub3;

/*
 * 날짜 : 2025/07/09
 * 이름 : 김철학
 * 내용 : 자바 메서드 형태 실습하기
 */
public class MethodTypeTest {

	public static void main(String[] args) {
				
		double y1 = type1(2.5);
		double y2 = type1(3.2);
		double y3 = type1(4.0);
		
		System.out.println("y1 : " + y1);
		System.out.println("y2 : " + y2);
		System.out.println("y3 : " + y3);
		
		// 반환값이 없기 때문에 함수호출 앞에 대입연산자 없음
		type2(true);
		type2(false);
		type2(2 > 3);		
		
		boolean result = type3();
		System.out.println("result : " + result);
		
		type4();		
	}
	
	// type1 : 매개변수 O, 반환값 O
	public static double type1(double r) {		
		double y = (r * r) * Math.PI;	
		return y;
	}
	
	// type2 : 매개변수 O, 반환값 X
	public static void type2(boolean status) {
		
		if(status) {
			System.out.println("참 입니다.");
		}else {
			System.out.println("거짓 입니다.");
		}	
		
	}
	
	// type3 : 매개변수 X, 반환값 O
	public static boolean type3() {
		
		int num1 = 1;
		int num2 = 2;
		
		if(num1 > num2) {
			return true;
		}else {
			return false;
		}	
	}
	
	// type4 : 매개변수 X, 반환값 X
	public static void type4() {		
		double result = type1(5.0);
		System.out.println("반지름 5인 원의 넓이 : " + result);		
	}
	
}












