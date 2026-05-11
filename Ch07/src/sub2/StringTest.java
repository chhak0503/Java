package sub2;


/*
 * 날짜 : 2026/05/11
 * 이름 : 김철학
 * 내용 : Java 내장클래스 실습 - String
 * 
 */
public class StringTest {

	public static void main(String[] args) {
		
		// 문자열 = 문자 + 배열
		String str1 = "Hello"; 				// 암시적, 문자열 리터럴
		String str2 = new String("Hello");	// 명시적 
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		// 문자열 비교
		if(str1 == str2) {
			System.out.println("str1, str2 주소값이 같다.");
		}else {
			System.out.println("str1, str2 주소값이 다르다.");
		}
		
		if(str1.equals(str2)) {
			System.out.println("str1, str2 문자열이 같다.");
		}else {
			System.out.println("str1, str2 문자열이 다르다.");
		}
		
		// 문자열 길이
		String message = "Hello, World";
		System.out.println("message 길이 : " + message.length());
		
		// 문자열 추출
		char c0 = message.charAt(0);
		char c7 = message.charAt(7);
		
		System.out.println("1번째 문자 : " + c0);
		System.out.println("8번째 문자 : " + c7);
		
		// 문자열 자르기
		String sub1 = message.substring(0, 5); // 0 ~ 5까지 문자열 자르기
		String sub2 = message.substring(7);    // 7부터 마지막까지 문자열 자르기
		
		System.out.println("sub1 : " + sub1);
		System.out.println("sub2 : " + sub2);
				
		// 문자열 인덱스
		int index1 = message.indexOf("l");     // 문자열 앞에서 부터 소문자 l 검색 후 인덱스 반환
		int index2 = message.lastIndexOf("l"); // 문자열 뒤에서 부터 소문자 l 검색 후 인덱스 반환
		
		System.out.println("index1 : " + index1);
		System.out.println("index2 : " + index2);
		
		// 문자열 분리
		String strCities = "서울,대전,대구,부산,광주";
		String[] cities = strCities.split(","); // 구분자로 문자열 분리
		
		for(String city : cities) {
			System.out.println("city : " + city);
		}
		
		// 문자열 교체
		String replaced1 = message.replace("World", "Korea");
		String replaced2 = message.replace("Hello", "Welcome");
		
		System.out.println("replaced1 : " + replaced1);
		System.out.println("replaced2 : " + replaced2);
		
		// 문자열 변환
		int 	var1 = 1;
		double 	var2 = 3.14;
		boolean var3 = true;
		
		String result1 = String.valueOf(var1); // 정수를 문자열로 변환
		String result2 = String.valueOf(var2); // 실수를 문자열로 변환
		String result3 = "" + var3; // 빈문자열로 변환
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
	}	
}












