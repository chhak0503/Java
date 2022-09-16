package sub04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 날짜 : 0000/00/00
 * 이름 : 홍길동
 * 내용 : 컬렉션 연습문제
 */
public class Test10 {
	public static void main(String[] args) {
		
		List<Apple> list1 = new ArrayList<>();
		list1.add(new Apple("파주", 3000));
		list1.add(new Apple("이천", 3000));
		list1.add(new Apple("수원", 3000));
		
		List<Apple> list2 = new ArrayList<>();
		list2.add(new Apple("청주", 3000));
		list2.add(new Apple("충주", 3000));
		list2.add(new Apple("단양", 3000));
		
		List<Apple> list3 = new ArrayList<>();
		list3.add(new Apple("밀양", 3000));
		list3.add(new Apple("함안", 3000));
		list3.add(new Apple("합천", 3000));
		
		Map<String, List<Apple>> map = new HashMap<>();
		map.put("gyeonggi", list1);
		map.put("chungbuk", list2);
		map.put("gyungnam", list3);
		
		// 수원 사과 출력
		List<Apple> list = map.get("gyeonggi");
		Apple apple = list.get(2);
		apple.show();
		
		// 충주 사과 출력
		map.get("chungbuk").get(1).show();
		
		// 밀양 사과 출력
		map.get("gyungnam").get(0).show();
	}
}


