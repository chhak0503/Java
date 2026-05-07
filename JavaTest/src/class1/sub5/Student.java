package class1.sub5;

public class Student {
	
	private String name;
	private String studentId;
	private Subject[] subjects;
	private int[] scores;
	private int subjectCount;
	
	public Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
		subjects = new Subject[10];
		scores = new int[10];
		subjectCount = 0;
	}
	
	public void enrollSubject(Subject subject) {
		subjects[subjectCount++] = subject;
		
		subject.addStudent(this); // this는 현재 Student 객체(student1)
		
		System.out.println(name + " - " + subject.getSubName() + " 과목 신청 완료");
		
	}
	
	public void setScore(Subject subject, int score) {
		
		for(int i=0 ; i<subjectCount ; i++) {
			
			if(subjects[i] == subject) {
				scores[i] = score;
				
				System.out.println(name + " - " + subject.getSubName() + "점수 입력완료");
				return;
			}			
		}		
	}
	
	public void printStudentInfo() {
		System.out.println("학생명 : " + name);
		System.out.println("아이디 : " + studentId);
		System.out.println("성적");
		
		for(int i=0 ; i<subjectCount ; i++) {
			System.out.println("- " + subjects[i].getSubName() + ":" + scores[i]);
		}
		
	}
	
	public String getName() {
		return name;
	}
	

}


















