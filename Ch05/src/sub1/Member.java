package sub1;
/*
문제 2. 회원(Member) 클래스 정의

아래 요구사항을 충족하는 Member 클래스를 정의하세요.

<속성>
	name (String): 회원 이름
	age (int): 나이
	isActive (boolean): 활성 회원 여부
	
<메서드>
	activate()
	 - isActive를 true로 변경
	 
	deactivate()
	 - isActive를 false로 변경
			
	isAdult()
	 - 나이가 20 이상이면 true, 아니면 false 반환
	
	show()
	 - 모든 속성값 출력
*/
public class Member {

	String name;
	int age;
	boolean isActive;
	
	public void activate() {
		this.isActive = true;
	}
	
	public void deactivate() {
		isActive = false;
	}
	
	public boolean isAdult() {
		if(age >= 20) {
			return true;
		}else {
			return false;
		}			
	}
	
	public void show() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("활성여부 : " + isActive);
	}
}



