package sub4;

/*
 * 날짜 : 2025/07/15
 * 이름 : 김철학
 * 내용 : 상속(Inheritance) 실습하기
 */
public class InheritTest {

	public static void main(String[] args) {
		
		// Car 상속 실습
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		sonata.speedUp(80);
		sonata.turbo();
		sonata.speedDown(20);
		sonata.show();
		
		Truck bongo = new Truck("봉고", "남색", 0, 0);
		bongo.load(100);
		bongo.speedUp(80);
		bongo.speedDown(20);
		bongo.show();
		
		// StockAccount 실습
		StockAccount kb = new StockAccount("KB증권", "101-22-0100", "홍길동", 10000, "삼성전자", 10, 100000);
		kb.deposit(1000000);
		kb.withdraw(50000);
		kb.buy(5, 80000);
		kb.show();
		
		kb.sell(5, 90000);
		kb.show();
		
		/*
		다음 요구사항을 만족하는 자바 프로그램을 작성하시오.		
		Person 클래스
		<속성>
		 - name (String), 
		 - age (int)
		<생성자>
		 - 모든 인스턴스 변수 초기화
		<메소드>
		 - work() : 기본적으로 "Person is working" 출력
		 - introduce() : "제 이름은 [name] 이고 나이는 [age]세 입니다." 출력
		
		Person 클래스를 상속받아 Doctor, Engineer 클래스 정의 
		Doctor 클래스
		<속성> 
		 - specialty (String)
		<생성자>
		 - 모든 인스턴스 변수 초기화
		<메서드>
		 - work() 
		    "제 이름은 [name] 이고 나이는 [age]세 입니다." 출력
		    "저는 의사이며 전공은 [specialty] 입니다." 출력
		
		Engineer 클래스
		<속성>
		 - field (String)
		<생성자>
		 - 모든 인스턴스 변수 초기화
		<메서드>
		 - work() 
		    "제 이름은 [name] 이고 나이는 [age]세 입니다." 출력
		    "저는 [field] 엔지니어 입니다." 출력
		*/
		
		Doctor doctor = new Doctor("김유신", 23, "소아과");
		Engineer engineer = new Engineer("김춘추", 21, "소프트웨어");
		
		doctor.work();
		engineer.work();
		
		
	}
}













