package sub1;

public class Apple extends Object { // Java의 모든 클래스는 최상위 클래스 Object 상속

	// 싱글톤 객체
	private static Apple instance = new Apple();
	public static Apple getInstance() {
		return instance;
	}
	
	
	private String country;
	private int price;
	
	public Apple() {
		
	}
	
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}

	@Override
	public String toString() {
		// Object의 toString을 재정의해서 사용, 일반적으로 속성 정보를 출력
		return "Apple [country=" + country + ", price=" + price + "]";
	}
	
}
 