package sub3;

import java.io.Serializable;

public class Apple implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}

	public void show() {
		System.out.println("------------------");
		System.out.println("원산자 : " + country);
		System.out.println("가격 : " + price);		
		System.out.println("------------------");
	}
	
}
