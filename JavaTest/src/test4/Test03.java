package test4;

class Product {
	protected String productName;
	protected int price;

	public Product(String productName, int price) {
		this.productName = productName;
		this.price = price;
	}
	public void info() {}
}

class SmartPhone extends Product {
	
	public SmartPhone(String productName, int price) {
		super(productName, price);
	}

	@Override
	public void info() {
		System.out.println("--------------------");
		System.out.println("제품명 : " + productName);
		System.out.println("제품가격 : " + price);
	}
}

class Laptop extends Product {
	public Laptop(String productName, int price) {
		super(productName, price);
	}

	@Override
	public void info() {
		System.out.println("--------------------");
		System.out.println("제품명 : " + productName);
		System.out.println("제품가격 : " + price);
	}
}

public class Test03 {
	public static void main(String[] args) {
		
		Product p1 = new SmartPhone("갤럭시", 100);
		Product p2 = new Laptop("맥북프로", 200);
		
		p1.info();
		p2.info();
	}
}









