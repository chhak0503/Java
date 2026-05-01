package sub3;

public class Car {
	
	// 속성(멤버변수)
	private String name;
	private int speed;
	public static int count; // 클래스변수(정적변수), 보통 외부에서 클래스타입으로 접근하기 때문에 public 선언
	
	// 생성자
	public Car(String name, int speed) {
		this.name = name;
		this.speed = speed;
		count++;
	}
		
	// 기능(멤버메서드)
	public void speedUp(int speed) {
		this.speed = speed;
	}
	
	public static int totalCar() { // 클래스 메서드(정적메서드)
		return count;
	}
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("현재속도 : " + this.speed);
		System.out.println("차량수 : " + count);
	}
	
	
	

}













