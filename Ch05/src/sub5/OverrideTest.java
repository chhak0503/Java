package sub5;

/*
 * 날짜 : 2026/05/04
 * 이름 : 김철학
 * 내용 : Java Overriding 실습
 */

class AAA {
	public void method1() {
		System.out.println("AAA:method1...");
	}
	public void method2() {
		System.out.println("AAA:method2...");
	}
	
	// Overload
	public void method3() {
		System.out.println("AAA:method3...");
	}
}

class BBB extends AAA {
	@Override
	public void method2() {
		System.out.println("BBB:method2...");
	}
	
	// Overload
	public void method3(int a) {
		System.out.println("BBB:method3...");
	}
}

class CCC extends BBB {
	
	// @Override 어노테이션 - Override 메서드를 표시하는 키워드, 기능은 없음
	@Override
	public void method1() {
		System.out.println("CCC:method1...");
	}
	
	@Override
	public void method2() {
		System.out.println("CCC:method2...");
	}
	
	// Overload
	public void method3(int a, int b) {
		System.out.println("CCC:method3...");
	}
}

public class OverrideTest {

	public static void main(String[] args) {
		
		CCC c = new CCC();
		
		c.method1();
		c.method2();
		c.method3();
		c.method3(1);
		c.method3(1, 2);
		
		
		// Car Override 메서드 실습
		Sedan avante = new Sedan("아반테", "흰색", 0, 1500);
		avante.speedUp(260); // 오버라이드 메서드 실행
		avante.drive();
		
		Truck poter = new Truck("포터", "흰색", 0, 0);
		poter.speedUp(200); // 오버라이드 메서드 실행
		poter.show();
		
		// Animal override 실습
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
	}
	
}



















