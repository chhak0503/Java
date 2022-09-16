package sub04;

/*
 * 날짜 : 0000/00/00
 * 이름 : 홍길동
 * 내용 : 자바 API클래스 연습문제
 */
class Apple {

	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void show() {
		System.out.println("원산지 : "+country);
		System.out.println("가격 : "+price);
	}
}

class Banana {
	private String country;
	private int price;
	
	public Banana(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void show() {
		System.out.println("원산지 : "+country);
		System.out.println("가격 : "+price);
	}
}

class Grape extends Object{
	private String country;
	private int price;
	
	public Grape(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void show() {
		System.out.println("원산지 : "+country);
		System.out.println("가격 : "+price);
	}
}

public class Test06 {
	public static void main(String[] args) {
		
		Test06 test = new Test06();
		
		Apple  apple  = new Apple("한국", 3000);
		Banana banana = new Banana("필리핀", 2000);
		Grape  grape  = new Grape("미국", 3000);
		
		test.showInfo(apple);
		test.showInfo(banana);
		test.showInfo(grape);
	}
	
	public void showInfo(Object fruit) {
		
		if(fruit instanceof Apple) {
			Apple apple = (Apple) fruit;
			apple.show();
			
		}else if(fruit instanceof Banana) {
			Banana banana = (Banana) fruit;
			banana.show();
			
		}else if(fruit instanceof Grape) {
			Grape grape = (Grape) fruit;
			grape.show();
		}
	}
}


