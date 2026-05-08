package test4;

interface Buyer {
	public void buy();
}

interface Seller {
	public void sell();
}

class Customer implements Buyer, Seller {
	
	@Override
	public void sell() {
		System.out.println("판매 합니다.");
	}

	@Override
	public void buy() {
		System.out.println("구매 합니다.");
	}
}

public class Test07 {
	
	public static void main(String[] args) {
		
		Buyer  buyer  = new Customer();
		Seller seller = new Customer();
		
		buyer.buy();
		seller.sell();
	}
}






