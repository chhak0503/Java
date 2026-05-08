package test7;

public class StudentScore {

	private String studentName;
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
		
		if(score > 0 && score <= 100) {
			this.score = score;
			System.out.println("점수 수정 완료");
		}else {
			System.out.println("잘못된 점수 입력");
		}
		
		
	} 

	public double getScore() {
		return score;
	}
	
	public void printStudentInfo() {
		System.out.println("이름 : " + this.studentName);
		System.out.println("아이디 : " + this.studentId);
		System.out.println("과목명 : " + this.subject);
		System.out.println("점수 : " + this.score);
	}
}
