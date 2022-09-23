package sub05;

public class Test02 {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 4;
		int c = -21;
		
		int x1 = (-b + (int) Math.sqrt(b*b - 4*a*c)) / 2 * a;		
		int x2 = (-b - (int) Math.sqrt(b*b - 4*a*c)) / 2 * a;		
		
		boolean result1 = a * Math.pow(x1, 2) + b * x1 + c == 0;
		boolean result2 = a * Math.pow(x2, 2) + b * x2 + c == 0;
		
		System.out.println("x1 : " + x1);
		System.out.println("x2 : " + x2);
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);		
	}
}
