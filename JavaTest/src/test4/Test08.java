package test4;

interface Payment {
	final static double TAX_RATE = 0.1;

	public void pay(int amount);
	public void cancel(int amount);
}

class CardPayment implements Payment {
	
	@Override
	public void pay(int amount) {
		double tax = amount * TAX_RATE;
		System.out.println("카드 결제 : " + amount + "원");
		System.out.println("세금 : " + tax + "원");
	}

	@Override
	public void cancel(int amount) {
		System.out.println("카드 결제 취소 : " + amount + "원");
	}
}

class CashPayment implements Payment {
	
	@Override
	public void pay(int amount) {
		double tax = amount * TAX_RATE;
		System.out.println("현금 결제 : " + amount + "원");
		System.out.println("세금 : " + tax + "원");
	}

	@Override
	public void cancel(int amount) {
		System.out.println("현금 결제 취소 : " + amount + "원");
	}
}

class Shop {
	public void processPayment(Payment payment, int amount ) {    	
        payment.pay(amount);
        
        if (amount > 10000) {
            payment.cancel(2000);
        }
        
        System.out.println();
    }
}

public class Test08 {
	
    public static void main(String[] args) {
    	
        Shop shop = new Shop();
        
        Payment card = new CardPayment();
        Payment cash = new CashPayment();        		
        
        shop.processPayment(card, 15000);
        shop.processPayment(cash, 5000);
    }
}











