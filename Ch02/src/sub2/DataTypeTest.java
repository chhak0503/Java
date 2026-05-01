package sub2;

/**
 * 날짜 : 2026/04/27
 * 이름 : 김철학
 * 내용 : Java 자료형 실습
 */
public class DataTypeTest {
	
	public static void main(String[] args) {		
		// 정수형
		byte 	num1 = 127;
		short 	num2 = 32767;
		int 	num3 = 2147483647;
		long 	num4 = 922_337_203_685_477_507L;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		
		// 실수형
		float  var1 = 0.123456789f;
		double var2 = 0.1234567890123456789;
		
		System.out.println("var1 : " + var1); // 소수점  8자리
		System.out.println("var2 : " + var2); // 소수점 17자리
		
		// 논리형
		boolean value1 = true;
		boolean value2 = false;			
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
				
		// 문자형
		char c1 = 'A'; // 문자 1개
		char c2 = '가'; // 한글 문자 1개
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		
		// 문자열
		String str1 = "A";
		String str2 = "가";
		String str3 = "Apple";
		String str4 = "가을";
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		System.out.println("str4 : " + str4);		 
		
	}
}










