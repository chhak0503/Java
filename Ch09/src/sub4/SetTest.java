package sub4;

import java.util.HashSet;
import java.util.Set;

/*
 * 날짜 : 2022/09/08
 * 이름 : 김철학
 * 내용 : 자료구조 집합 실습하기
 * 
 * Set
 *  - 입력된 데이터의 순서를 고려하지 않고, 중복을 허용하지 않은 자료구조
 *  - 중복된 데이터를 제거하거나 이미 데이터가 존재하는지 검사할때 사용
 */
public class SetTest {
	public static void main(String[] args) {
		
		// 집합 생성
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		set.add(2);
		set.add(3);
		
		// 집합 갯수
		System.out.println("set 집합 원소 갯수 : "+set.size());
		
		// 집합 출력
		System.out.println(set);
		
		for(int n : set) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
}
