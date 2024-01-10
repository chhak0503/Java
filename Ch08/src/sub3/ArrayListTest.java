package sub3;

import java.util.ArrayList;
import java.util.List;

import sub1.Apple;


/**
 * 날짜 : 2024/01/10
 * 이름 : 김철학
 * 내용 : Java ArrayList 실습하기
 */
public class ArrayListTest {

	public static void main(String[] args) {
		
		// ArrayList 생성
		List<Integer> list = new ArrayList<>();
		
		// 데이터 입력
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		
		// 데이터 삽입
		list.add(1, 6);
		System.out.println(list);
		
		// 데이터 삭제
		list.remove(2);
		System.out.println(list);
		
		// 데이터 추출
		System.out.println("1번째 원소 : " + list.get(0));
		System.out.println("2번째 원소 : " + list.get(1));
		System.out.println("4번째 원소 : " + list.get(3));
		
		// 리스트 크기
		System.out.println("list 크기 : " + list.size());
		
		// 리스트 반복문
		for(int num : list) {
			System.out.print(num + " ");
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
		
		// 객체 리스트
		List<Apple> apples = new ArrayList<>();
		
		Apple a1 = new Apple("한국", 3000);
		Apple a2 = new Apple("미국", 3000);
		Apple a3 = new Apple("일본", 3000);
		
		apples.add(a1);
		apples.add(a2);
		apples.add(a3);
		
		System.out.println(apples);
		
		for(Apple apple : apples) {
			System.out.println(apple);
		}
		
	}
}













