package test4.sub1;

public class StudentScore {
	
	// 속성
	private String studentName; // 학생이름
	private String studentId; 
	private String subject; 
	private double score;
	
	public StudentScore(String studentName, String studentId, String subject, double score) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.subject = subject;
		this.score = score;		
	}
	
	public void updateScore(double score) {
		
		if(score > 100) {
			System.out.println("잘못된 점수 입력");
		}else {
			this.score = score;
			System.out.println("점수 수정 완료");
		}	
		
	}
	
	public double getScore() {
		return score;
	}
	
	public void printStudentInfo() {
		System.out.println("학생명 : " + studentName);
		System.out.println("학생아이디 : " + studentId);
		System.out.println("과목명 : " + subject);
		System.out.println("점수 : " + score);
	}
	

}
