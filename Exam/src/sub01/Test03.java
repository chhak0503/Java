package sub01;

/*
 * 날짜 : 0000/00/00
 * 이름 : 홍길동
 * 내용 : 자바 연산자 연습문제
 */
public class Test03 {
	public static void main(String[] args) {
		
		int num = 1;
		int result = 0;
		
		result = num++;
		System.out.println("result : "+result);
		
		result = ++num;		
		System.out.println("result : "+result);
		
		result = num--;		
		System.out.println("result : "+result);
		
		result = --num;		
		System.out.println("result : "+result);		
	}
}
