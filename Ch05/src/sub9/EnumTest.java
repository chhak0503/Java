package sub9;

/*
 * 날짜 : 2026/05/07
 * 이름 : 김철학
 * 내용 : Java enum(열거상수) 실습
 */

enum Day {
	MONDAY, 
	TUESDAY, 
	WEDNESDAY, 
	THURSDAY, 
	FRIDAY, 
	SATURDAY, 
	SUNDAY 	
}

public class EnumTest {
	
	public static void main(String[] args) {
		
		// 열거 상수 객체 생성
		Day today = Day.THURSDAY;
		
		switch(today) {
		
		case MONDAY:
			System.out.println("월요일 입니다.");
			break;
		case TUESDAY:
			System.out.println("화요일 입니다.");
			break;
		case WEDNESDAY:
			System.out.println("수요일 입니다.");
			break;
		case THURSDAY:
			System.out.println("목요일 입니다.");
			break;
		case FRIDAY:
			System.out.println("금요일 입니다.");
			break;
		case SATURDAY:
			System.out.println("토요일 입니다.");
			break;
		case SUNDAY:
			System.out.println("일요일 입니다.");
			break;
		}
		
	}
}










