package sub6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 날짜 : 2022/09/08
 * 이름 : 김철학
 * 내용 : 정규표현식 실습하기
 * 
 * 정규표현식(Regular Expression)
 *  - 특정규칙을 가진 문자열 집합을 표현하기 위한 형식언어
 *  - 문자열 패턴을 검사하거나 또는 문자열 치환에 많이 사용
 */
public class RegularExpressTest {
	public static void main(String[] args) {
		
		// 정규표현식
		String patt = "b[a-z]*";
		boolean rs1 = Pattern.matches(patt, "bat");
		boolean rs2 = Pattern.matches(patt, "cat");
		
		System.out.println("rs1 : "+rs1);
		System.out.println("rs2 : "+rs2);
		
		// 정규표현식 패턴
		String[] patterns = {".",		// 문자 1개 
							 "[a-z]?", 	// 소문자 1개
							 "[0-9]+",  // 숫자 1개 이상
							 "0[0-9]*", // 0으로 시작하는 숫자 0개 이상
							 "^[0-9]",	// 숫자로 시작하는 문자
							 "[^0-9]",	// 숫자가 아닌 문자
							 "[a-z]*",  // 소문자 0개 이상
							 "[A-Z]+",	// 대문자 1개 이상
							 "[ㄱ-힣]+", // 한글 1자 이상
							 "\\s",		// 공백
							 "\\S",		// 공백이 아닌 문자
							 "\\d",		// 숫자
							 "\\w",		// 숫자와 문자
							 "\\W"		// 특수문자
							 };	
		
		String[] words = {"bat", "0101234", "12345", "011", "bed", 
						  "hello", "안녕", "02", "A", "a", "7", "#"};
		
		for(String word : words) {
			
			System.out.print(word+"문자와 일치하는 패턴 : ");
			
			for(String p : patterns) {
				boolean result = Pattern.matches(p, word);
				
				if(result) {
					System.out.print(p + ", ");
				}
			}			
			System.out.print("\n");
		}
		
		// 자주 사용하는 정규표현식
		String p1 = "^[0-9]*$";
		String p2 = "^[a-zA-Z]*$";
		String p3 = "^[가-힣]*$";
		String p4 = "^[a-zA-Z0-9]*$";
		String p5 = "(01\\d{1})-(\\d{3,4})-(\\d{4})";
		String p6 = "(\\w+)@(\\w+).(\\w+)";
		
		String source = "이름:홍길동, 휴대폰1:010-1234-1001, 휴대폰2:011-123-1001, 이메일:hong@gmail.com";
		
		Pattern ptt1 = Pattern.compile(p5);
		Matcher mat1 = ptt1.matcher(source);
		
		System.out.println("휴대폰 조회");
		while(mat1.find()) {
			System.out.println(mat1.group());
		}
		
		Pattern ptt2 = Pattern.compile(p6);
		Matcher mat2 = ptt2.matcher(source);
		
		System.out.println("이메일 조회");
		while(mat2.find()) {
			System.out.println(mat2.group());
		}
	}
}






