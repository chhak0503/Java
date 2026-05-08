package test7;

public class Product {

	private String productId;
	private String productName;	
	private int price;
	private int quantity;
	
	public Product(String productId, String productName, int price, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void updatePrice(int price){
		
		this.price = price;
		System.out.println(productName + " 가격 수정 됨");		
	}
	
	public void addStock(int stock){
		this.quantity += stock;
		System.out.println(productName + " " + stock + "개 추가 됨");
	}
	
	public void printProductInfo(){
		System.out.println("상품아이디 : " + productId);
		System.out.println("상품명 : " + productName);
		System.out.println("상품가격 : " + price);
		System.out.println("재고수량 : " + quantity);
	}
	
	
}
