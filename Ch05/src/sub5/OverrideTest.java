package sub5;

/*
 * 날짜 : 2024/01/03
 * 이름 : 김철학
 * 내용 : Java 메서드 오버라이드 실습하기
 */

class AAA {
	public void method1() {
		System.out.println("AAA::method1...");
	}
	
	public void method2() {
		System.out.println("AAA::method2...");
	}
	
	public void method3() {
		System.out.println("AAA::method3...");
	}
}

class BBB extends AAA {
	public void method2() {
		System.out.println("BBB::method2...");
	}
	public void method3(int a) {
		System.out.println("BBB::method3...");
	}
}

class CCC extends BBB {
	public void method1() {
		System.out.println("CCC::method1...");
	}
	public void method2() {
		System.out.println("CCC::method2...");
	}
	public void method3(int a, int b) {
		System.out.println("CCC::method3...");
	}
}

public class OverrideTest {

	public static void main(String[] args) {
		
		CCC c = new CCC();
		c.method1();
		c.method2();
		c.method3();
		c.method3(0);
		c.method3(1, 2);
	}
	
}
