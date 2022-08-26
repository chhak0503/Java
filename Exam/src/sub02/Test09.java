package sub02;

/*
 * 날짜 : 0000/00/00
 * 이름 : 홍길동
 * 내용 : 자바 최대공약수 재귀 메서드 연습문제
 * 
 * 유클리드 호제법
 *  - 두 개의 자연수에 대한 최대공약수를 구하는 대표적인 기법
 *  - 두 자연수 A, B에 대해서 A>B일때 A를 B로 나눈 나머지를 R이라고 하면
 *    A와 B의 최대공약수는 B와 R의 최대공약수와 같다.
 *    
 *  예) 192와 162의 최대공약수는 아래와 같다.
 *  -------------------
 *  | 단계  |  A  |  B  |
 *  -------------------
 *  | 1단계 | 192 | 162 |
 *  -------------------  
 *  | 2단계 | 162 |  30 |  
 *  -------------------  
 *  | 3단계 |  30 |  12 |
 *  -------------------
 *  | 4단계 |  12 |   6 |
 *  -------------------
 */
public class Test09 {
	public static void main(String[] args) {
		
		System.out.println("  1과   5의 최대공약수 : "+gcd(5, 1));
		System.out.println("  3과   6의 최대공약수 : "+gcd(6, 3));
		System.out.println(" 12과  18의 최대공약수 : "+gcd(18, 12));
		System.out.println(" 60과  24의 최대공약수 : "+gcd(60, 24));
		System.out.println("192과 162의 최대공약수 : "+gcd(192, 162));		
	}
	
	public static int gcd(int a, int b) {
		
		if(a%b == 0){
			return b;
		}else {
			return gcd(b, a%b);
		}
	}
}