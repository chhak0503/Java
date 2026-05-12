package sub9;

/*
 * 날짜 : 2026/05/07
 * 이름 : 김철학
 * 내용 : Java enum(열거상수) 실습
 */

// 열거형 정의
enum Season {
	// 열거 상수
    SPRING,
    SUMMER,
    FALL,
    WINTER
}

enum Grade {
    VIP(10),
    GOLD(5),
    BASIC(1);

    private int point;

    Grade(int point) {
        this.point = point;
    }

    public int getPoint() {
        return point;
    }
}


public class EnumTest {
	
	public static void main(String[] args) {
		
		// 열거 상수 객체 생성
		Season season = Season.SUMMER;

        System.out.println("season : " + season);

        if(season == Season.SUMMER) {
            System.out.println("여름입니다.");
        }

        // enum 전체 출력
        for(Season s : Season.values()) {
            System.out.println(s);
        }
        
        // 열거 상수 객체 생성
        Grade grade = Grade.VIP;

        System.out.println("회원등급: " + grade);
        System.out.println("포인트: " + grade.getPoint());

        System.out.println("\n=== 전체 회원 등급 ===");

        for(Grade g : Grade.values()) {
            System.out.println(g + " : " + g.getPoint() + "점");
        }
		
	}
}










