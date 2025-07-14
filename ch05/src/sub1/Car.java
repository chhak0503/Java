package sub1;

// 클래스 설계(정의)
public class Car {
		
	// 속성(멤버변수, 필드)
	String name;
	String color;
	int speed;	
	
	// 기능(멤버메서드)
	public void speedUp(int speed) {
		
		// this는 자기 참조 키워드, 클래스의 멤버변수 참조 
		this.speed += speed;
		
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + color); // this 생략
		System.out.println("현재속도 : " + speed); // this 생략		
	}
}











