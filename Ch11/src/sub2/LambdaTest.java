package sub2;


/*
 * 날짜 : 2024/01/16
 * 이름 : 김철학
 * 내용 : Java 람다식 실습하기
 * 
 */
@FunctionalInterface
interface A {
	public int method(int a, int b);
}

@FunctionalInterface
interface B {
	public void method(String s);
}

@FunctionalInterface
interface C {
	public boolean method();
}

@FunctionalInterface
interface D {
	public void method();
}

@FunctionalInterface
interface E {
	public double method(double num);
}



public class LambdaTest {

	public static void main(String[] args) {
		
		// 람다식 구현
		A a1 = (int a, int b) -> {
			int c = a + b;
			return c;
		};
		
		A a2 = (a, b) -> {return a + b;};
		A a3 = (a, b) -> a + b;
		
		int r1 = a1.method(1, 2);
		int r2 = a2.method(2, 3);
		int r3 = a3.method(3, 4);
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		
		B b1 = (String s) -> {System.out.println(s);};
		B b2 = (s) -> System.out.println(s);
		B b3 = System.out::println; // 메서드 참조 연산자를 이용한 람다식
		
		b1.method("Apple");
		b2.method("Banana");
		b3.method("Orange");
		
		C c1 = () -> {return true;};
		C c2 = () -> false;		
		
		System.out.println("c1 : " + c1.method());
		System.out.println("c2 : " + c2.method());
		
		D d1 = () -> {System.out.println("d1 실행...");};
		D d2 = () -> System.out.println("d2 실행...");
		
		d1.method();
		d2.method();
		
		// 메서드 참조 연산자
		E e1 = Math::ceil;
		E e2 = Math::floor;
		E e3 = Math::round;
		
		double n1 = e1.method(1.2);
		double n2 = e2.method(2.3);
		double n3 = e3.method(3.5);
		
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println("n3 : " + n3);
		
		// 람다식 활용
		Runnable run = () -> {
			
			for(int i=1 ; i<=10 ; i++) {
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("자식 스레드 실행...");
			}
		};
		
		Thread th = new Thread(run);
		th.start();
		
		for(int i=1 ; i<=10 ; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("메인 스레드 실행...");
		}
		
		System.out.println("프로그램 종료...");
	}
}



















