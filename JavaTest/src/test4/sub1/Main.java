package test4.sub1;

/*
 * 자바 연습문제 실습하기
 * - 시간 : 09:00 ~ 10:00
 * - 해설 : 10:00 
 * - 궁금한 내용 질문하기
 * - 수업시간, 쉬는시간 지켜주세요. 
 * 
 * 정정
 * 문제2. 출력결과 "키보드 15개 재고 추가 됨" -> 15개X -> 5개
 */
public class Main {
	
	public static void main(String[] args) {
		
		StudentScore student = new StudentScore("홍길동", "S001", "자바", 90.0);
		
		student.printStudentInfo();
		
		student.updateScore(98.0);
		
		student.updateScore(102.0);
		
		student.printStudentInfo();
		
	}

}
