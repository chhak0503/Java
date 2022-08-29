package sub4;

/*
 * 날짜 : 2022/08/25
 * 이름 : 김철학
 * 내용 : 싱글톤 객체와 인스턴스 객체 실습 
 */
class Adder {
	
	private static Adder instance = new Adder();
	public static Adder getInstance() {
		return instance;
	}
	private Adder() {}
	private Adder(int value) {
		y += value;
	}
	
	public int x;
	public static int y;
	
	public void add(int x, int y) {
		this.x += x;
		y++;
	}
	
	public void add(int[] arr) {
		x += arr[0];
		y += arr[1];
	}
	
	public static void add(Adder a2) {
		a2.x += 10;		
	}
	
	public static Adder add(Adder a3, int value) {
		return new Adder(value);
	}
	
	public void show() {
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}
}

public class AdderTest {

	public static void main(String[] args) {
		
		int[] arr = new int[2];
		arr[0] = 1;
		arr[1] = 2;
		
		Adder a1 = Adder.getInstance();
		
		a1.add(1, 2);
		a1.show();
		
		a1.add(arr);
		a1.show();
		
		Adder.add(a1);
		a1.show();
		
		a1 = Adder.add(a1, 3);
		a1.show();
		
	}
}














