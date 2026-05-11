package sub1;

/*
 * 날짜 : 2026/05/11
 * 이름 : 김철학
 * 내용 : Java 내장클래스 실습 - Object
 * 
 */
public class ObjectTest {

	public static void main(String[] args) {
		
		Apple a1 = new Apple("한국", 5000);
		Apple a2 = new Apple("미국", 4000);
		Apple a3 = Apple.getInstance(); // 싱글톤 객체 가져오기
		Apple a4 = Apple.getInstance();
		
		System.out.println(a1.toString()); 	// toString() 호출
		System.out.println(a2); 			// toString() 생략 가능
		
		// 객체 해시값(유일값)
		System.out.println("a1 해시값 : " + a1.hashCode());
		System.out.println("a2 해시값 : " + a2.hashCode());
		System.out.println("a3 해시값 : " + a3.hashCode());
		System.out.println("a4 해시값 : " + a4.hashCode());
		
		// 참조변수(객체) 비교
		if(a1 == a2) {
			System.out.println("a1, a2 참조변수 주소값이 같다.");
		}else {
			System.out.println("a1, a2 참조변수 주소값이 다르다.");
		}
		
		if(a3 == a4) {
			System.out.println("a3, a4 참조변수 주소값이 같다.");
		}else {
			System.out.println("a3, a4 참조변수 주소값이 다르다.");
		}
		
		// 객체 인스턴스 비교
		if(a1.equals(a2)) {
			System.out.println("a1, a2가 가리키는 객체(인스턴스)가 같다.");
		}else {
			System.out.println("a1, a2가 가리키는 객체(인스턴스)가 다르다.");
		}
		
		if(a3.equals(a4)) {
			System.out.println("a3, a4가 가리키는 객체(인스턴스)가 같다.");
		}else {
			System.out.println("a3, a4가 가리키는 객체(인스턴스)가 다르다.");
		}
	}	
}












