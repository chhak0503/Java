package class1.sub5;

public class Subject {

	
	private String subName;
	private Student[] students;
	private int studentCount;
	
	public Subject(String subName) {
		this.subName = subName;
		students = new Student[10];
		studentCount = 0;	
	}
	
	public void addStudent(Student student){
		students[studentCount++] = student;
	}
	
	public void printSubjectInfo(){
		System.out.println("과목명 : " + subName);
		System.out.print("수강생 : ");
		
		for(Student student : students) {
			
			if(student != null) {
				System.out.print(student.getName() + ", ");	
			}
			
			
		}
		System.out.println();
	}
	
	public String getSubName(){
		return subName;
	}
}









