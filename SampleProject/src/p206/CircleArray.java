package p206;

/*
 * 날짜 : 2025/07/18
 * 이름 : 김철학
 * 내용 : 교재 p206 예제 4-6 실습
 */

class Circle {
	
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {		
		return 3.14 * radius * radius;			
	}
}


public class CircleArray {

	public static void main(String[] args) {
	
		Circle[] c; // 선언
		
		c = new Circle[5]; // 생성
		
		for(int i=0 ; i<c.length ; i++)
			c[i] = new Circle(i);
		
		for(int i=0 ; i<c.length ; i++)
			System.out.print((int) (c[i].getArea()) + " ");
		 
		
		
	}
	
	
}












