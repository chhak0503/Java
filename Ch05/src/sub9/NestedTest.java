package sub9;

import sub9.Outer.Inner;

/*
 * 날짜 : 2026/05/07
 * 이름 : 김철학
 * 내용 : Java 중첩 클래스(내부 클래스, 익명 객체) 실습
 */

// 외부 클래스
class Outer {
	
	private int x;
	
	public Outer(int x) {
		this.x = x;
	}
	
	public void show() {
		System.out.println("Outer x : " + x);
	}
	
	// 내부 클래스
	class Inner {
		
		private int x;
		
		public Inner(int x) {
			this.x = x;
		}
		
		public void show() {
			System.out.println("Inner x : " + x);
		}
	}
}

public class NestedTest {

	public static void main(String[] args) {
		// 외부 객체 생성
		Outer out = new Outer(1);
		out.show();
		
		// 내부 객체 생성
		Inner inn = out.new Inner(2);
		inn.show();
	}
}



















