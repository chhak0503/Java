package sub2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import sub1.Apple;

/**
 * 날짜 : 2026/05/12
 * 이름 : 김철학
 * 내용 : Java 컬렉션 List 실습
 */
public class ListTest {

	public static void main(String[] args) {
		
		//--------------------------------
		// ArrayList 기본
		//--------------------------------		
		
		// 리스트 생성
		List<Integer> list = new ArrayList<>();
		
		// 데이터 추가
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);		
		System.out.println(list);
		
		// 데이터 삽입
		list.add(1, 6); // 1번 인덱스에 6 삽입
		System.out.println(list);
		
		// 데이터 제거
		list.remove(2); // 2번 인덱스 데이터 삭제
		System.out.println(list);
		
		list.remove(3); // 3번 인덱스 데이터 삭제
		System.out.println(list);
		
		// 데이터 참조
		System.out.println("list 첫번째 데이터 : " + list.getFirst());
		System.out.println("list 2번 데이터 : " + list.get(1));
		System.out.println("list 3번 데이터 : " + list.get(2));
		System.out.println("list 마지막 데이터 : " + list.getLast());
		
		// 리스트 크기
		System.out.println("list 크기 : " + list.size());
		
		// 리스트 반복문
		for(int num : list) {
			System.out.print(num + ", ");
		}
		System.out.print("\n");
		
		//--------------------------------
		// 문자열 리스트 실습
		//--------------------------------
		List<String> names = new ArrayList<>();
		
		names.add("김유신");
		names.add("김춘추");
		names.add("장보고");
		names.add("강감찬");
		names.add("이순신");
		System.out.println(names);
		
		// 마지막에 '정약용' 추가
		names.add("정약용");
		System.out.println(names);
		
		// 강감찬 - 이순신 사이에 '정도전' 삽입
		names.add(4, "정도전");
		System.out.println(names);
		
		// 김유신 - 김춘추 사이에 '비담' 삽입
		names.add(1, "비담");
		System.out.println(names);
		
		// '장보고' 제거 후 '왕건' 삽입
		names.remove(3);
		System.out.println(names);
		
		names.add(3, "왕건");
		System.out.println(names);
		
		// '정도전'을 '세종대왕'으로 교체
		names.set(5, "세종대왕");
		System.out.println(names);
		
		
		//--------------------------------
		// 객체 리스트 실습
		//--------------------------------
		
		List<Apple> apples = new ArrayList<>();
		
		Apple a1 = new Apple("한국", 5000);
		Apple a2 = new Apple("일본", 3000);
		
		apples.add(a1);
		apples.add(a2);
		apples.add(new Apple("미국", 4000));
		
		System.out.println(apples);		
		System.out.println(apples.get(0));
		
		
		//--------------------------------
		// 링크드 리스트(LinkedList) 실습
		//--------------------------------
		
		List<String> linked = new LinkedList<>();
		
		linked.add("서울");
		linked.add("대전");
		linked.add("대구");
		linked.add("부산");
		linked.add("광주");
		System.out.println(linked);
		
		// 데이터 삽입
		linked.add(1, "인천");
		linked.addFirst("수원");
		linked.addLast("울산");
		System.out.println(linked);
		
	}
}












