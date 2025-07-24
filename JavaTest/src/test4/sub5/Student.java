package test4.sub5;

public class Student {
	
	private String name;
	private String studentId;
	private Subject[] subjects;
	private int[] scores;
	private int subjectCount;
	
	public Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
		this.subjects = new Subject[10];
		this.scores = new int[10];
		this.subjectCount = 0;
	}
	
	public void enrollSubject(Subject subject) {
		
		subjects[subjectCount] = subject;		
		subject.addStudent(this);
		
		scores[subjectCount++] = 0;		
		
		System.out.println(name + " - " + subject.getSubName() + " 과목 신청 완료");
	}
	
	public void setScore(Subject subject, int score) {
		
		
		for(int i=0 ; i<subjectCount ; i++) {
			
			if(subjects[i] == subject) { // 배열원소의 subject와 입력된 subject가 같으면
				scores[i] = score;			
				System.out.println(name + " - " + subject.getSubName() + " 점수 입력 완료");
			}		
			
		}
	}
	
	public void printStudentInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("아이디 : " + this.studentId);
		
		System.out.println("성적");
		
		for(int i=0 ; i<subjectCount ; i++) {			
			System.out.println(" - " + subjects[i].getSubName() + " : " + scores[i]);
		}
	}
	
	public String getName() {
		return name;
	}

}









