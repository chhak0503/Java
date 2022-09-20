package sub2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * 날짜 : 2022/09/20
 * 이름 : 김철학
 * 내용 : 컬렉션 스트림 실습하기
 * 
 * 컬렉션 스트림(Stream)
 *  - 배열이나 컬렉션 원소를 람다식을 이용해서 처리할 수 있는 반복자
 *  - 스트림을 이용하면 병렬처리가 가능하기 때문에 대용량의 데이터 처리에 더나은 성능 제공
 */
public class CollectionStreamTest {
	public static void main(String[] args) {
		
		String[] people = {"김유신", "김춘추", "장보고", "강감찬", "이순신"};
		
		// 반복문을 이용한 출력
		for(String name : people) {
			System.out.println(name);
		}
		
		// 스트림을 이용한 출력
		Stream<String> peopleStream = Arrays.stream(people);
		peopleStream.forEach((name) -> {System.out.println(name);});
		
		
		List<Person> list = new ArrayList<>();
		list.add(new Person("김유신", 25));
		list.add(new Person("김춘추", 23));
		list.add(new Person("장보고", 35));
		list.add(new Person("강감찬", 45));
		list.add(new Person("이순신", 55));
		
		Stream<Person> pStream = list.stream();
		pStream.forEach((p)->{System.out.println(p.getName());});
	}
}
