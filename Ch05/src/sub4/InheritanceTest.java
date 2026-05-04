package sub4;


/**
 * 날짜 : 2026/05/04
 * 이름 : 김철학
 * 내용 : Java 상속 실습
 */
public class InheritanceTest {
	
	public static void main(String[] args) {
		
		// Car 상속객체 Sedan 생성
		Sedan sonata = new Sedan("소나타", "은색", 0, 1800);
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.drive();
		
		// Car 상속 객체 Truck 생성
		Truck bongo = new Truck("봉고", "블루", 0, 0);
		bongo.load(100);
		bongo.speedUp(80);
		bongo.show();
		
		// Account 상속 객체 StockAccount 생성
		StockAccount kb = new StockAccount("KB증권", "110-12-0011", "홍길동", 0, "삼성전자", 0, 0);
		kb.deposit(1_000_000);
		kb.buy(10, 100_000);
		kb.show();		
		kb.sell(5, 150000);
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
		Doctor kim = new Doctor("김유신", 24, "소아과");
		kim.work();
		
		Engineer lee = new Engineer("이순신", 31, "SW개발");
		lee.work();
		
		
	}	
}



















