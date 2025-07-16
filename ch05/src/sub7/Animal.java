package sub7;

// 추상클래스 - 추상메서드를 갖는 클래스, 상속을 위한 클래스
public abstract class Animal {

	// 추상메서드
	public abstract void move();
	
	public void hunt() {
		System.out.println("Animal hunt...");
	}
}
