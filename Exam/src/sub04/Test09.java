package sub04;

import java.util.ArrayList;
import java.util.List;

/*
 * 날짜 : 0000/00/00
 * 이름 : 홍길동
 * 내용 : 객체 리스트 연습문제
 */
class Member {
	String id;
	String name;
	int age;
	
	Member(String id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return id+","+name+","+age;
	}
}

public class Test09 {
	public static void main(String[] args) {
		
		Member m1 = new Member("hong", "홍길동", 30);
		Member m2 = new Member("lee", "이순신", 40);
		Member m3 = new Member("kim", "김유신", 50);
		
		List<Member> memberList = new ArrayList<>();
		memberList.add(m1);
		memberList.add(m2);
		memberList.add(m3);
		
		for(Member m : memberList) {
			System.out.println(m);
		}
	}
}

