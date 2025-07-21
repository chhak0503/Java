package sub2;
/*
 * 날짜 : 2025/07/21
 * 이름 : 김철학
 * 내용 : 자바 String 클래스 실습하기
 */
public class StringTest {
	
	public static void main(String[] args) {
		
		// 문자열(문자+배열) 생성
		String str1 = "Hello"; // 문자열 literal
		String str2 = new String("Hello");
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);		
		
		// 문자열 비교
		if(str1 == str2) {
			System.out.println("str1, str2 문자열 주소값 같다.");
		}else {
			System.out.println("str1, str2 문자열 주소값 다르다.");
		}
		
		if(str1.equals(str2)) { // 문자열 비교는 반드시 equals로 비교
			System.out.println("str1, str2 문자열 같다.");
		}else {
			System.out.println("str1, str2 문자열 다르다.");
		}
				
		// 문자열 길이
		String message = "Hello,Korea";
		System.out.println("길이 : " + message.length());		 
		
		// 문자열 추출
		char c1 = message.charAt(0);
		char c2 = message.charAt(6);
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		
		// 문자열 자르기
		String substr1 = message.substring(0, 5); // 0부터 5까지 문자열
		String substr2 = message.substring(5);	  // 5부터 마지막까지 문자열
		
		System.out.println("substr1 : " + substr1);
		System.out.println("substr2 : " + substr2);
		
		// 문자열 인덱스
		int idx1 = message.indexOf('e');		// 문자열의 앞에서 부터 문자 e 탐색
		int idx2 = message.lastIndexOf('e');	// 문자열의 뒤에서 부터 문자 e 탐색
		
		System.out.println("idx1 : " + idx1);
		System.out.println("idx2 : " + idx2);		
		
		// 문자열 분리
		String[] words = message.split(","); // 구분자 ,로 문자열 분리
		
		for(String word : words) {
			System.out.println(word);			
		}	
		
		// 문자열 교체
		String rs1 = message.replace("Korea", "Busan");
		String rs2 = message.replace("Hello", "Welcome");
		
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
				
		
		// 문자열 변환
		int 	var1 = 1;
		double 	var2 = 2.1;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1);
		String s2 = var2+"";
		String s3 = ""+var3;
		
		System.out.println(s1 + "2");
		System.out.println(s2 + "1.2");
		System.out.println(s3 + "false");
	}
}

















