package sub1;

/**
 * 날짜 : 2025/07/14
 * 이름 : 김철학
 * 내용 : 자바 객체지향 프로그래밍 클래스 실습하기
 * 
 * 스택(Stack)
 *  - 자바의 일반변수, 참조변수, 지역변수가 push 되어 저장되는 메모리 영역
 *  - 해당 메서드 영역 및 프로그램이 종료되면 pop 되어 메모리에서 제거
 *  - 객체(참조변수)는 스택에서 Heap 메모리 공간의 객체 인스턴스 참조(주소값 저장)
 *  
 *  힙(Heap)
 *   - 자바의 객체가 생성되는 메모리 공간
 *   - 스택처럼 순서대로 쌓이지 않고 랜덤으로 메모리 공간에 생성
 *   - 참조변수가 제거되서 더이상 참조 되지 않으면 Garbage Collector로 해제됨
 */
public class ClassTest {
	
	public static void main(String[] args) {
		
		// 객체 생성(인스턴스화)
		Car sonata = new Car();
		
		// 객체 초기화
		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		// 객체 상호작용(기능 활용)
		sonata.speedUp(80);
		sonata.speedDown(10);
		sonata.show();
		
		// 객체 생성, 초기화, 상호작용		
		Car avante = null; // 선언(declare)할 때는 일반적으로 null 초기화
		
		avante = new Car(); // 생성
		
		avante.name = "아반테"; // 초기화(initialize) : 변수에 최초로 값을 대입
		avante.color = "검정색";
		avante.speed = 0;
		
		avante.speedUp(60);
		avante.speedDown(20);
		
		//avante.color = "남색";
		
		avante.show();
		
		
		/*
		 * 은행계좌 객체 생성 및 초기화
		 * 은행명 : 국민은행(kb)
		 * 계좌번호 : 101-11-1001
		 * 입금주: 김유신
		 * 초기잔액 : 0
		 */		
		// 객체 생성
		Account kb = new Account();
		
		// 초기화
		kb.bank = "국민은행";
		kb.id = "101-11-1001";
		kb.name = "김유신";
		kb.balance = 0;
		
		// 객체 상호작용
		kb.deposit(100000);
		kb.withdraw(30000);
		kb.show();
				
		/*
		 * 은행계좌 객체 생성 및 초기화
		 * 은행명 : 우리은행(wr)
		 * 계좌번호 : 101-21-2001
		 * 입금주: 김춘추
		 * 초기잔액 : 10000
		 * 출력잔액 : 105000
		 */
		
		Account wr = new Account();
		
		wr.bank = "우리은행";
		wr.id = "101-21-2001";
		wr.name = "김춘추";
		wr.balance = 10000;
		
		wr.deposit(1000000);
		wr.withdraw(905000);
		wr.show();
				
		
		
	}
}















