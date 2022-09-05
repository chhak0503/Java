package sub1;


/*
 * 날짜 : 2022/09/05
 * 이름 : 김철학
 * 내용 : Object 클래스 실습하기
 */
public class ObjectTest {

	public static void main(String[] args) {
		
		Apple a1 = new Apple("한국", 5000);
		Apple a2 = new Apple("일본", 4000);
		
		a1.show();
		a2.show();
		
		// equals() : 객체 비교
		if(a1 == a2) {
			System.out.println("a1과 a2가 주소값이 같다.");
		}else {
			System.out.println("a1과 a2가 주소값이 다르다.");
		}
		
		if(a1.equals(a2)) {
			System.out.println("a1과 a2가 객체가 같다.");
		}else {
			System.out.println("a1과 a2가 객체가 다르다.");
		}
		
		// toString() : 객체 정보
		a1.toString();
		a2.toString();
	}
}
