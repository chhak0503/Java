package sub7;

public class Eagle extends Animal {

	
	@Override
	public void move() {
		System.out.println("Eagle fly...");
	}

	// 부모 클래스의 추상메서드를 자식 클래스에서 반드시 구현
	@Override
	public void hunt() {
		System.out.println("Eagle hunt...");
	}
	
	
}
