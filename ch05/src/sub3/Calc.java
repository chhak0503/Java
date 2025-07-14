package sub3;


public class Calc {
	
	// 싱글톤(Singleton) 객체	
	private static Calc instance = new Calc();
	public static Calc getInstance() {
		return instance;
	}
	
	private Calc() {} // 외부 new 동적 생성을 막기위해 private 생성자 선언 
	
	
	public int plus(int a, int b) {
		return a + b;
	}
	
	public int minus(int a, int b) {
		return a - b;
	}
	
	public int multi(int a, int b) {
		return a * b;
	}
	
	public int div(int a, int b) {
		return a / b;
	}	
}
