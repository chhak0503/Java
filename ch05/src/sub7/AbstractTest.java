package sub7;

/*
 * 날짜 : 2025/07/16
 * 이름 : 김철학
 * 내용 : 추상클래스 실습하기
 */
public class AbstractTest {
	
	public static void main(String[] args) {
	
		// 추상클래스는 객체 생성 불가
		//Animal animal = new Animal();
		
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		
		tiger.move();
		tiger.hunt();
		
		eagle.move();
		eagle.hunt();
	}
}










