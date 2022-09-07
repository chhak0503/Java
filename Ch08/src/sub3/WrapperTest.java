package sub3;

/*
 * 날짜 : 2022/09/07
 * 이름 : 김철학
 * 내용 : 자바 Wrapper 클래스 실습하기
 * 
 * 포장(Wrapper) 클래스
 *  - 기본타입의 값을 객체로 변환하기 위한 클래스
 *  - 기본값을 객체로 변환해서 기능, 저장을 제공하는 클래스 
 */
public class WrapperTest {
	public static void main(String[] args) {
		
		// 기본타입(primitive type)
		int 	var1 = 1;
		double 	var2 = 2.12;
		boolean var3 = true;
		
		// Wrapper 클래스 포장
		Integer w1 = new Integer(var1);
		Double  w2 = new Double(var2);
		Boolean w3 = new Boolean(var3);
		
		System.out.println("w1 : " + w1);
		System.out.println("w2 : " + w2);
		System.out.println("w3 : " + w3);
		
		// 문자열 -> 기본타입
		String str1 = "1";
		String str2 = "3.14";
		String str3 = "false";
		
		int 	value1 = Integer.parseInt(str1);
		double 	value2 = Double.parseDouble(str2);
		boolean value3 = Boolean.parseBoolean(str3);
		
		System.out.println("value1 : "+value1);
		System.out.println("value2 : "+value2);
		System.out.println("value3 : "+value3);
				
		// 문자열 -> Wrapper
		Integer wr1 = Integer.valueOf(str1);
		Double  wr2 = Double.valueOf(str2);
		Boolean wr3 = Boolean.valueOf(str3);
		
		System.out.println("wr1 : "+wr1);
		System.out.println("wr2 : "+wr2);
		System.out.println("wr3 : "+wr3);
		
		// Wrapper -> 문자열
		String s1 = wr1.toString();
		String s2 = wr2.toString();
		String s3 = wr3.toString();
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		
		// Wrapper -> 기본타입 (Auto-Unboxing)
		int 	v1 = wr1;
		double 	v2 = wr2;
		boolean v3 = wr3;
		
		System.out.println("v1 : "+v1);
		System.out.println("v2 : "+v2);
		System.out.println("v3 : "+v3);
		
		// 기본타입 -> Wrapper (Auto-Boxing)
		Integer wp1 = v1;
		Double  wp2 = v2;
		Boolean wp3 = v3;
		
		System.out.println("wp1 : "+wp1);
		System.out.println("wp2 : "+wp2);
		System.out.println("wp3 : "+wp3);
		
	}
}
