package sub4;

/**
 * 날짜 : 2026/04/28
 * 이름 : 김철학
 * 내용 : Java 반복문 While 실습
 */
public class WhileTest {

	public static void main(String[] args) {
		
		// while 기본
		int i = 0; // 반복변수
		
		while(i < 10) {			
			System.out.println("i : " + i);			
			i++;
		}
		
		// 1부터 10까지 합
		int sum = 0, k = 1;
		
		while(k <= 10) {						
			sum += k;
			k++;			
		}
		
		System.out.println("1부터 10까지 합 : " + sum);
		
		// do-while : 최초 한번은 무조건 반복을 수행하는 while문
		int total = 0, j = 1;
		
		do {
			
			if(j % 2 == 0) {
				total += j;
			}
			
			j++;			
			
		}while(j <= 10);
		
		System.out.println("1부터 10까지 짝수합 : " + total);
		
		// break		
		int num = 1;
		
		while(true) {
		
			if(num % 5 == 0 && num % 7 == 0) {
				break; // 반복문 종료
			}
			
			num++;
		}
		
		System.out.println("5와 7의 최소공배수 : " + num);
		
		// continue
		int tot = 0, n = 1;
		
		while( n <= 10 ) {
			
			n++;
			
			if(n % 2 == 1) {
				continue; // 반복문 상위(처음) 이동
			}		
			
			tot += n;			
		}
		
		System.out.println("1부터 10까지 짝수합 : " + tot);
		
		
	}
	
}











