package sub3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 날짜 : 2025/07/22
 * 이름 : 김철학
 * 내용 : 자바 집합(Set) 실습하기
 */
public class SetTest {

	public static void main(String[] args) {
		
		
		// 집합 기본
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(1); // Auto-boxing
		set.add(2);
		set.add(3);
		set.add(3);
		set.add(4);
		set.add(2);
		
		System.out.println(set);
		
		// 반복자(Iterator)를 이용한 출력
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			// 집합에 데이터가 없을때 까지 반복			
			System.out.println(it.next());			
		}
		
		for(int num : set) {
			System.out.println("num : " + num);
		}
		
		////////////////////////////////////////////
		// 집합연산 실습
		////////////////////////////////////////////
		
		Set<String> setA = new HashSet<String>(Arrays.asList("사과", "바나나", "딸기", "포도"));
		Set<String> setB = new HashSet<String>(Arrays.asList("딸기", "수박", "바나나", "오렌지"));		
		
		// 합집합
		Set<String> union = new HashSet<String>(setA);
		union.addAll(setB);
		System.out.println("합집합 : " + union);
				
		// 교집합
		Set<String> intersection = new HashSet<String>(setA);
		intersection.retainAll(setB);
		System.out.println("교집합 : " + intersection);
				
		// 차집합
		Set<String> minus = new HashSet<String>(setA);
		minus.removeAll(setB);
		System.out.println("차집합 : " + minus);		
	}	
}














