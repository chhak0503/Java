package sub3;


public class Car {

	// 속성(필드)
	private String name;
	private String color;
	private int speed;
	
	// 클래스 변수(정적변수)
	public static int count;
	
	// 클래스 메서드(정적메서드)
	public static int getCount() {
		return count;
	}
	
	// 생성자 - 캡슐화된 속성을 초기화하기 위한 메서드
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		
		// 객체 생성할때 차량수를 1씩 증가
		count++;
	}
	
	// 기능(메서드)
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
	}
	
	// Getter, Setter - 필요에 따라서 정의
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
}















