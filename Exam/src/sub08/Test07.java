package sub08;

import java.util.ArrayList;
import java.util.List;

/*
 * 날짜 : 0000/00/00
 * 이름 : 홍길동
 * 내용 : 자바 총정리 연습문제
 */

class Products {
    List<Product> list = new ArrayList<>();

    public void SetProduct(String item, int price) {
        Product product = new Product();
        product.setItem(this, item, price);
    }

    public void showList()
    {
        for(Product p : list) {        	
        	System.out.printf("상품:%s, 가격:%,d\n", p.getItem(), p.getPrice());
        }
    }

    private class Product {
        private String item;
        private int price;

        public void setItem(Products outer, String item, int price) {
            this.item = item;
            this.price = price;
            
            outer.list.add(this);
        }

        public String getItem() {
            return item;
        }

        public int getPrice() {
            return price;
        }
    }
}

public class Test07 {
	public static void main(String[] args) {
		Products products = new Products();
		products.SetProduct("신발", 30000);
        products.SetProduct("셔츠", 20000);
        products.SetProduct("바지", 15000);

        products.showList();
	}
}


