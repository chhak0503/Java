package sub6;

/*
 * 날짜 : 2025/07/15
 * 이름 : 김철학
 * 내용 : 다형성 실습하기
 * 
 *  다형성(Polymorphism)
 *   - 상속관계에서 부모클래스의 기능이 자식클래스에서 다양한 형태로 변하는 특징
 *   - 객체 생성할때 타입선언을 부모클래스 타입으로 선언(업캐스팅)
 *   - 다형성을 통해서 프로그래밍의 중복코드 줄이고 유연성 향상
 */
public class PolyTest {
	
	public static void main(String[] args) {
	
		// 다형성 - 자식 객체의 타입선언을 부모타입으로 선언
		Animal tiger = new Tiger(); // 업캐스팅
		Animal eagle = new Eagle(); // 업캐스팅
		Animal shark = new Shark(); // 업캐스팅
		
		tiger.move();
		tiger.hunt();
		
		eagle.move();
		eagle.hunt();
		
		shark.move();
		shark.hunt();
		
		// 다운캐스팅 - 부모타입의 객체를 자식타입으로 캐스팅(Casting, 형변환)
		Tiger t = (Tiger) tiger;
		Eagle e = (Eagle) eagle;
		Shark s = (Shark) shark;
		
		t.move();
		t.hunt();
		
		e.move();
		e.hunt();
		
		s.move();
		s.hunt();
		
		// 다형성을 활용한 객체 배열
		Animal[] arr= {t, e, s};
		
		arr[0].move();
		arr[1].move();
		arr[2].move();
		
		// 다형성 확인문제
		/*
		1) Pet 클래스를 정의하시오. 
		 - 클래스 내용은 아래 내용을 참고해 작성하세요.
		
		2) Pet 클래스를 상속받는 Dog, Cat 클래스를 정의하시오. 
		 - Dog, Cat 클래스는 makeSound() 메서드를 재정의 하세요.
		 - Dog는 "멍멍" 출력
		 - Cat 은 "야옹" 출력
		
		3) Main 클래스에서 Dog, Cat 객체를 생성하고 정적 메서드 printSound() 를 정의하시오.
		 - main() 메서드에서 printSound() 메서드를 호출하시오.
		 - printSound()는 Dog, Cat 객체를 인자로 받는 매개변수를 선언하세요.
		 - printSound()는 매개변수를 이용해 Dog, Cat의 makeSound()를 호출하세요.
		*/		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		printSound(dog);
		printSound(cat);
		
	}
	
	public static void printSound( Pet pet ) {
		pet.makeSound();
	}
	
}












