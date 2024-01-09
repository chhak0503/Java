package sub1;

/*
 * 날짜 : 2024/01/09
 * 이름 : 김철학
 * 내용 : Java Object 클래스 실습
 */
public class ObjectTest {
	
	
	public static void main(String[] args) {
		
		Object a1 = new Apple("한국", 3000);
		Object a2 = new Apple("일본", 2000);
		
		// 암시적으로 호출되는 toString 
		System.out.println(a1);
		System.out.println(a2);
		
		// 객체 비교
		if(a1 == a2) {
			System.out.println("a1, a2 주소가 같다.");
		}else {
			System.out.println("a1, a2 주소가 다르다.");
		}
		
		if(a1.equals(a2)) {
			System.out.println("a1, a2 객체가 같다.");
		}else {
			System.out.println("a1, a2 객체가 다르다.");
		}
		
	}

}
