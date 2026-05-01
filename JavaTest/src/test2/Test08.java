package test2;

public class Test08 {
	public static void main(String[] args) {

		System.out.println("3! = "+factorial(3)); // 3! = 3 x 2 x 1
		System.out.println("4! = "+factorial(4)); // 4! = 4 x 3 x 2 x 1
		System.out.println("5! = "+factorial(5)); // 5! = 5 x 4 x 3 x 2 x 1		
	}
	
	public static int factorial(int n) {

		if (n <= 1) {
			return 1;
		}
		
		return n * factorial(n-1); // 재귀함수
	}
}