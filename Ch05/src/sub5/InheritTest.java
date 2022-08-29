package sub5;

/*
 * 날짜 : 2022/08/29
 * 이름 : 김철학
 * 내용 : Java 클래스 상속 실습하기
 */

class Parent {
	private int num1;
	private int num2;
	
	public Parent(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int plus() {
		return num1 + num2;
	}
}

class Child extends Parent {
	private int num3;
	private int num4;

	public Child(int num1, int num2, int num3, int num4) {
		super(num1, num2);
		this.num3 = num3;
		this.num4 = num4;
	}
	
	public int minus() {
		return num3-num4;
	}
}

public class InheritTest {
	public static void main(String[] args) {
		// 객체 생성
		Parent p = new Parent(1, 2);
		int r1 = p.plus();
		
		System.out.println("r1 : "+r1);
		
		Child c = new Child(2, 3, 4, 5);
		int r2 = c.plus();
		int r3 = c.minus();
		
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		
		// Car 자식클래스 객체 생성
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		Truck bongo = new Truck("봉고", "파란색", 0, 0);
		
		sonata.speedUp(100);
		sonata.speedTurbo();
		sonata.show();
		
		bongo.load(100);
		bongo.speedUp(80);		
		bongo.show();
	}
}














