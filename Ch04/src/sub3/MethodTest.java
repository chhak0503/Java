package sub3;

/*
 * 날짜 : 2022/08/23
 * 이름 : 김철학
 * 내용 : Java 메서드 실습하기
 * 
 * 메서드(Method)
 *  - 자주 사용하는 코드로직을 모듈화한 구조체
 *  - 메서드에 선언한 변수는 지역변수이고 해당 메서드가 끝나면 메모리에서 소멸
 */
public class MethodTest {
	
	// 전역변수
	int num = 1;
	
	public static void main(String[] args) {
		
		// 메서드 호출(실행)
		int r1 = f(1);
		int r2 = f(2);
		int r3 = f(3);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		
		// 메서드 지역변수와 스택
		int t1 = sum(1, 10);
		int t2 = sum(1, 100);
		
		System.out.println("t1 : "+t1);
		System.out.println("t2 : "+t2);
		
	}// main end
	
	// 메서드 정의
	public static int f(int x) {
		int y = 2 * x + 3;
		return y;
	}
	
	// 메서드 정의
	public static int sum(int start, int end) {
		// 지역변수
		int total = 0;
		
		for(int k=start; k<=end; k++) {
			total += k;
		}
		
		return total;
	}
	
	
}










