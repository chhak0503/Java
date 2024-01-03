package sub6;

/*
 * 날짜 : 2024/01/03
 * 이름 : 김철학
 * 내용 : Java 다형성 실습하기
 */
public class PolyTest {

	public static void main(String[] args) {
		
		// 업캐스팅으로 다형성 구현
		Animal t = new Tiger();
		t.move();
		t.hunt();
		
		Animal e = new Eagle();
		e.move();
		e.hunt();
		
		Animal s = new Shark();
		s.move();
		s.hunt();
		
		// 객체 타입 비교연산
		if(t instanceof Tiger) {
			System.out.println("t는 Tiger 입니다.");
		}
		
		if(e instanceof Eagle) {
			System.out.println("e는 Eagle 입니다.");
		}
		
		if(s instanceof Shark) {
			System.out.println("s는 Shark 입니다.");
		}
		
		
	}
}
