package sub3;

import java.util.ArrayList;
import java.util.List;

/*
 * 날짜 : 2022/09/08
 * 이름 : 김철학
 * 내용 : 자료구조 리스트 실습하기
 * 
 * List
 *  - 배열과 유사하지만 동적으로 생성되는 선형 자료구조
 *  - List를 구현한 ArrayList를 많이 사용
 */
public class ListTest {
	public static void main(String[] args) {
		
		// List 생성
		List<Integer> list1 = new ArrayList<>();
			
		list1.add(1);	 // 입력
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(1, 6); // 삽입
		list1.remove(2); // 삭제
		
		// List 크기
		System.out.println("list1 : " + list1.size());
		
		// List 출력
		for(int n : list1) {
			System.out.print(n + ", ");
		}
		System.out.println();
		
		// 문자열 리스트
		List<String> people = new ArrayList<>();
		
		people.add("김유신");
		people.add("김춘추");
		people.add("장보고");
		people.add("강감찬");
		people.add("이순신");

		System.out.println(people);
		
		// 사과 리스트
		List<Apple> apples = new ArrayList<>();
		
		Apple a1 = new Apple("한국", 3000);
		apples.add(a1);
		
		apples.add(new Apple("미국", 2000));
		apples.add(new Apple("일본", 1000));
		
		
		// 한국사과
		Apple korApple = apples.get(0);
		korApple.show();
		
		apples.get(1).show();
		apples.get(2).show();
	}
}
