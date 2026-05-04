package sub4;

public class StockAccount extends Account { // 'StockAccount is(has) Account' 명제 성립여부 확인

	private String company;
	private int amount;
	private int price;
	
	public StockAccount(String bank, String id, String name, int balance, String company, int amount, int price) {
		super(bank, id, name, balance);
		this.company = company;
		this.amount = amount;
		this.price = price;
	}
	
	public void buy(int amount, int price) {
		this.amount += amount;
		this.balance -= amount * price;
		this.price = price;
	}
	
	public void sell(int amount, int price) {
		this.amount -= amount;
		this.balance += amount * price;
		this.price = price;
	}
	
	public void show() {
		System.out.println("증권사 : " + bank);
		System.out.println("증권계좌 : " + id);
		System.out.println("투자자 : " + name);
		System.out.println("계좌잔액 : " + balance);
		System.out.println("주식명 : " + this.company);
		System.out.println("수량 : " + this.amount);
		System.out.println("가격 : " + this.price);
	}

}








