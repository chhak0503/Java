package test3;

class Product {
    private String name;
    private int stock;
    private int price;   
    
    
    // 코드 작성하기   
    public void setName(String name) {
		this.name = name;
	}
    public void setStock(int stock) {
		this.stock = stock;
	}
    public void setPrice(int price) {
		this.price = price;
	}
    
    public void show() {
    	System.out.println("------------");
    	System.out.println("제품명 : " + name);
    	System.out.println("재고 : " + stock);
    	System.out.println("가격 : " + price);
    }
}

public class Test08 {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setName("노트북");
        p1.setStock(10);
        p1.setPrice(1_500_000);
        p1.show();
        
        Product p2 = new Product();
        p2.setName("스마트폰");
        p2.setStock(30);
        p2.setPrice(1_200_000);
        p2.show();
    }
}