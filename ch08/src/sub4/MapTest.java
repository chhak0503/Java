package sub4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;



/*
 * 날짜 : 2025/07/22
 * 이름 : 김철학
 * 내용 : 자바 맵 실습하기
 */
public class MapTest {

	public static void main(String[] args) {
		
		// Map 생성
		Map<Character, String> map = new HashMap();		
		
		// Map 데이터 추가
		map.put('A', "Apple");
		map.put('B', "Banana");
		map.put('C', "Cherry");
		
		System.out.println(map);
		
		// Map 크기(데이터 갯수)
		System.out.println("Map 크기 : " + map.size());
		
		// Map 데이터 출력
		System.out.println("Map의 A키값 : " + map.get('A'));;
		System.out.println("Map의 B키값 : " + map.get('B'));;
		System.out.println("Map의 C키값 : " + map.get('C'));;
		
		// Map 반복문
		Set<Character> keySet = map.keySet();
		Iterator<Character> it = keySet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}		
		
		for(char key : map.keySet()) {
			System.out.println(map.get(key));
		}
		
		
		// Map과 List 응용
		
		Map<Integer, Apple> m1 = new HashMap<Integer, Apple>();
		m1.put(101, new Apple("한국", 3000));
		m1.put(102, new Apple("중국", 2000));
		m1.put(103, new Apple("일본", 1000));
		
		Map<Integer, Apple> m2 = new HashMap<Integer, Apple>();
		m2.put(201, new Apple("미국", 3000));
		m2.put(202, new Apple("영국", 2000));
		m2.put(203, new Apple("호주", 1000));
		
		Map<Integer, Apple> m3 = new HashMap<Integer, Apple>();
		m3.put(301, new Apple("대만", 3000));
		m3.put(302, new Apple("태국", 2000));
		m3.put(303, new Apple("인도", 1000));
		
		List<Map<Integer, Apple>> list = new ArrayList();
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		// 한국 사과 출력
		Map<Integer, Apple> resultMap = list.get(0);
		Apple koreaApple = resultMap.get(101);
		koreaApple.show();
		
		// 호주 사과 출력
		list.get(1).get(203).show();
		
		// 태국 사과 출력
		list.get(2).get(302).show();
		
	}
}



















