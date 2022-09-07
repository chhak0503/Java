package sub2;

/*
 * 날짜 : 2022/09/07
 * 이름 : 김철학
 * 내용 : 문자열 클래스 String 실습하기
 * 
 * String 클래스
 *  - String은 문자열을 저장하고 가공처리에 사용되는 클래스
 *  - 일반적으로 리터럴방식으로 생성하고 사용
 *  - 문자열 비교는 equals로 해야한다.
 * 
 */
public class StringTest {
	public static void main(String[] args) {
		
		// 문자열(문자+배열) 생성
		String str1 = "Hello"; // 리터럴(암시적)
		String str2 = new String("Hello"); // 명시적
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		// 문자열 비교
		if(str1 == str2) {
			System.out.println("str1과 str2가 같다.");
		}else {
			System.out.println("str1과 str2가 다르다.");
		}
		
		if(str1.equals(str2)) {
			System.out.println("str1 문자열과 str2 문자열이 같다.");
		}else {
			System.out.println("str1 문자열과 str2 문자열이 다르다.");
		}
		
		// 문자열 길이
		String str = "Hello Korea";
		
		System.out.println("str 길이 : " + str.length());
		
		// 문자열 추출
		System.out.println("str 1번째 문자 : " + str.charAt(0));
		System.out.println("str 7번째 문자 : " + str.charAt(6));
		
		// 문자열 자르기
		System.out.println("str 1~6까지 자르기 : " + str.substring(0, 5));
		System.out.println("str 7에서 마지막까지 자르기 : " + str.substring(6));
		
		// 문자열 인덱스
		System.out.println("str 앞에서 부터 문자 e 인덱스 : " + str.indexOf("e"));
		System.out.println("str 뒤에서 부터 문자 e 인덱스 : " + str.lastIndexOf("e"));
		
		// 문자열 교체
		System.out.println("str 문자열에서 hello를 welcome으로 교체 : " + str.replace("Hello", "Welcome"));
		System.out.println("str 문자열에서 Korea를 Busan으로 교체 : " + str.replace("Korea", "Busan"));
		
		// 문자열 변환
		int 	var1 = 1;
		double 	var2 = 2.12;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = ""+var3;
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
	}
}












