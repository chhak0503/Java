package sub3;

/*
 * 날짜 : 2025/07/08
 * 이름 : 김철학
 * 내용 : 자바 for 반복문 실습하기
 */
public class ForTest {

	public static void main(String[] args) {
		
		// for 기본
		for(int i = 0 ; i < 10 ; i++) {			
			System.out.println("i : " + i);
		}
		
		// 1부타 10까지 합
		int sum = 0;
		
		for(int k=1 ; k<=10 ; k++) {
			sum += k; // sum = sum + k;
		}
		
		System.out.println("1부터 10까지 합 : " + sum);
				
		// 1부타 10까지 짝수합
		int tot = 0;
		
		for(int k=1; k<=10 ; k++) {
			
			if(k % 2 == 0) {
				tot += k;	
			}			
			
		}
		
		System.out.println("1부터 10까지 짝수합 : " + tot);
		 		
		
		// for 중첩
		for(int a=1 ; a<=3 ; a++) {			
			System.out.println("a : " + a);			
			for(int b=1 ; b<=5 ; b++) {				
				System.out.println("b : " + b);					
			}			
		}		
		
		// 구구단
		for(int x=1 ; x<=9 ; x++) {
			
			System.out.println(x + "단");
			
			for(int y=1 ; y<=9 ; y++) {
				
				int z = x * y;
				
				//System.out.println(x + " x " + y + " = " + z);
				
				// 서식문자 출력
				System.out.printf("%d x %d = %d\n", x, y, z);
			}						
		}
				
		// 별삼각형
		for(int start = 1 ; start <= 10 ; start++) {			
			
			for(int end = 1 ; end <= start ; end++) {				
				
				System.out.print("☆");
				
			}
			System.out.println(); // 개행
		}
		
		
		
	}	
}
