package sub7;

/**
 * 날짜 : 2026/05/06
 * 이름 : 김철학
 * 내용 : Java 추상클래스 실습
 */
public class AbstractTest {

	public static void main(String[] args) {
		
		sub6.Animal animal6 = new sub6.Animal(); // 추상클래스가 아니므로 생성 가능
		//sub7.Animal animal7 = new sub7.Animal(); // 추상클래스 이므로 생성 불가능
		
		Tiger tiger = new Tiger();
		Eagle eagle = new Eagle();
		Shark shark = new Shark();
		
		Animal[] animals = {tiger, eagle, shark};
		
		for(Animal a : animals) {
			a.move();
		}
	}
}









