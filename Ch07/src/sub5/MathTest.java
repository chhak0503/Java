package sub5;

import java.util.Random;

/*
 * 날짜 : 2026/05/12
 * 이름 : 김철학
 * 내용 : Java 내장클래스 실습 - Math 
 */
public class MathTest {
	
	public static void main(String[] args) {
		
		// Math math = new Math(); 객체 생성 안됨
		
		// 기본 메서드
		System.out.println("절대값 : " + Math.abs(-5));
		System.out.println("제곱근 : " + Math.sqrt(9));
		System.out.println("올림값 : " + Math.ceil(1.2));
		System.out.println("올림값 : " + Math.ceil(1.8));
		System.out.println("내림값 : " + Math.floor(1.2));
		System.out.println("내림값 : " + Math.floor(1.8));
		System.out.println("반올림 : " + Math.round(1.2));
		System.out.println("반올림 : " + Math.round(1.8));
		
		// random 메서드
		double num1 = Math.random();
		System.out.println("num1 : " + num1); // 0 ~ 1 사이 실수
		
		double num2 = num1 * 10;
		System.out.println("num2 : " + num2); // 0 ~ 10 사이 실수
		
		double num3 = Math.ceil(num2);
		System.out.println("num3 : " + num3); // 1 ~ 10 사이 정수
		
		// random 중첩
		int random = (int) Math.ceil(Math.random() * 45); // 1 ~ 45 사이 정수
		System.out.println("random : " + random);
		
		
		// Random 클래스
		Random rand = new Random(); 
		
		// 0 ~ 9 사이 정수
		int rnum1 = rand.nextInt(10);
		System.out.println("rnum1 : " + rnum1); // 0 나옴, 10 안나옴
		
		// 1 ~ 45 사이 정수
		int rnum2 = rand.nextInt(45) + 1; 
		System.out.println("rnum2 : " + rnum2); // 1 나옴, 45 나옴
	}

}










