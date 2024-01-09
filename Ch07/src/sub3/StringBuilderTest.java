package sub3;

/*
 * 날짜 : 2024/01/09
 * 이름 : 김철학
 * 내용 : Java StringBuilder 클래스 실습
 */
public class StringBuilderTest {

	
	public static void main(String[] args) {
		
		// String 불변성(immutable)
		String str = "Hello";
		System.out.println("str 객체 주소 : " + System.identityHashCode(str));
		
		str += "World";
		System.out.println("str 객체 주소 : " + System.identityHashCode(str));
		System.out.println("str : " + str);
		
		// String의 immutable 단점을 개선한 StringBuilder
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println("sb 객체 주소 : " + System.identityHashCode(sb));
		
		sb.append("World");
		System.out.println("sb 객체 주소 : " + System.identityHashCode(sb));
		
		System.out.println("sb : " + sb);
		
		
	}
	
}













