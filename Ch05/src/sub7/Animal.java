package sub7;

// 추상클래스 : 직접 객체를 생성할 수 없는 클래스, 추상 메서드를 갖는 클래스
public abstract class Animal { 
	
	public void move() {		
		System.out.println("Animal move...");
	}
	
	// 추상 메서드 : 자식 클래스에서 재정의하는 메서드, 문법적으로 반드시 구현하게 강제
	public abstract void hunt();

}
