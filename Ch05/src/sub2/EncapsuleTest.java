package sub2;

/**
 * 날짜 : 2026/04/29
 * 이름 : 김철학
 * 내용 : Java 캡슐화 실습
 */
public class EncapsuleTest {

	public static void main(String[] args) {
		
		// Car 객체 생성 
		Car sonata = new Car("소나타", "흰색", 0); // 생성자 초기화
		// 객체 초기화 -> 캡슐화된 속성을 생성자로 초기화 
		//sonata.brand = "소나타";
		//sonata.color = "흰색";
		//sonata.speed = 0;
		
		// 속성값 수정
		//sonata.color = "은색";
		sonata.setColor("은색"); // 안전하게 세터로 수정
		sonata.show();
		
		Car avante = new Car();
		// 세터 초기화
		avante.setBrand("아반테");
		avante.setColor("검정");
		avante.setSpeed(0);
		
		System.out.println("차량명 : " + avante.getBrand());
		System.out.println("차량색 : " + avante.getColor());
		System.out.println("현재속도 : " + avante.getSpeed());		
		
		// Account 객체 생성 및 생성자 초기화
		Account kb = new Account("국민은행", "101-12-1110", "김유신", 10000);		
		Account wr = new Account("우리은행", "101-12-2220", "김춘추", 20000);		
		kb.show();
		wr.show();
		
		// Book 객체 생성 및 생성자 초기화
		Book java = new Book("이것이 자바다.", "신용권", 1);
		Book html = new Book("웹표준의 정석", "고경희", 2);
		java.show();
		html.show();
		
		// Member 객체 생성 및 생성자 초기화
		Member kim = new Member("김유신", 23, false);
		Member lee = new Member("이순신", 33, true);
		kim.show();
		lee.show();
		
		// Movie 객체 생성 및 생성자 초기화
		Movie titanic = new Movie("타이타틱", "제임스카메론", 10.0, 300);
		titanic.showDetails();
		
		Movie avatar = new Movie("아바타", "제임스카메론", 9.8, 250);
		avatar.showDetails();
		
		
		
		
		
	}
}






