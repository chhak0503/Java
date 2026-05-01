package sub3;

/*
 * 날짜 : 2026/04/27
 * 이름 : 김철학
 * 내용 : Java 반복문 for 실습
 */
public class ForTest {
	
	public static void main(String[] args) {
		
		// for 기본		
		for(int i=0 ; i<10 ; i++) {			
			System.out.println("i : " + i);			
		}		
		
		// 1부터 10까지 합
		int sum1 = 0;
		
		for(int k=1 ; k<=10 ; k++) {			
			sum1 += k;			
		}
		
		System.out.println("1부터 10까지 합 : " + sum1);
		
		// 1부터 10까지 짝수합
		int sum2 = 0;
		
		for(int k=1 ; k<=10 ; k++) {												
			if(k % 2 == 0) {
				sum2 += k;	
			}
		}
		
		System.out.println("1부터 10까지 짝수합 : " + sum2);
		
		// for 중첩
		for(int a=1 ; a<=3 ; a++) {
			
			System.out.println("a : " + a);
			
			for(int b=1 ; b<=5 ; b++) {
				
				System.out.println("b : " + b);
				
				/*
				for(int c=1 ; c<=3 ; c++) {
					System.out.println("c : " + c);	
				}
				*/
			}			
			
		}
		
		// 구구단
		for(int x=2 ; x<=9 ; x++) {
			
			System.out.println(x+"단");
			
			for(int y=1 ; y<=9 ; y++) {
				
				int z = x * y;
				
				System.out.printf("%d x %d = %d\n", x, y, z);				
				
			}
			
		}
		
		// 별삼각형
		for(int start = 1 ; start <= 10 ; start++) {
			
			for(int end = 10 ; end >= start ; end--) {
			
				System.out.print("☆");
							
			}
			
			System.out.print("\n"); // 개행(줄바꿈)
			
		}
		
		
		
		
	}

}








