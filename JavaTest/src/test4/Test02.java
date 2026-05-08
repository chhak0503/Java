package test4;

class Member {
	protected int id;
	protected String name;
	protected String grade;
	protected int point;
	protected double pointRatio;

	public Member(int id, String name) {
		this.id = id;
		this.name = name;
		this.grade = "SILVER";
		this.point = 100;
		this.pointRatio = 0.01;
	}

	public int calcPrice(int price) {
		point += price * pointRatio;
		return price;
	}

	public void showInfo() {
		System.out.println("----------------------");
		System.out.println("고객번호 : " + id);
		System.out.println("고객이름 : " + name);
		System.out.println("고객등급 : " + grade);
		System.out.println("현재 포인트 : " + point);
		System.out.println("포인트 적립율 : " + pointRatio);
	}
}

class VipMember extends Member {
	private double saleRatio;

	public VipMember(int id, String name) {
		super(id, name);
		super.grade = "VIP";
		super.point = 1000;
		super.pointRatio = 0.05;
		this.saleRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		point += price * pointRatio;
		return price - (int) (price * saleRatio);
	}
}

public class Test02 {
	
	public static void main(String[] args) {
		
		Member kim = new Member(1001, "김춘추");
		VipMember lee = new VipMember(1002, "이순신");
		
		System.out.println("김춘추 지불할 금액 : " + kim.calcPrice(10000));
		System.out.println("이순신 지불할 금액 : " + lee.calcPrice(10000));
		
		kim.showInfo();
		lee.showInfo();
	}
}