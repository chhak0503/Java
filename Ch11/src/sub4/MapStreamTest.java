package sub4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 날짜 : 2026/05/14
 * 이름 : 김철학
 * 내용 : Java 컬렉션 맵 스트림 실습
 */
class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

public class MapStreamTest {

	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("김유신", 25));
		persons.add(new Person("김춘추", 23));
		persons.add(new Person("장보고", 35));
		persons.add(new Person("강감찬", 45));
		persons.add(new Person("이순신", 55));
		
		System.out.println(persons);
		
		// mapXXX() - 하나의 원소를 다른값으로 변환
		persons
			.stream()
			.map( person -> {				
				return person.getName();				
			})
			.forEach( name -> {
				System.out.print(name + ", ");
			});
	
		System.out.print("\n");
		
		int sum = persons
					.stream()
					.mapToInt( person -> {
						return person.getAge();
					})
					.sum();
		
		System.out.println("전체 나이 합 : " + sum);
		
		
		// flatMapXXX() - 하나의 원소를 하나 이상 다른값으로 변환
		List<String> cities = List.of("서울,대전", "대구,부산", "광주,인천", "울산,수원", "양산,김해");
		System.out.println(cities);
		System.out.println(cities.size());
		
		List<String> resultList = cities
									.stream()
									.flatMap( city -> {
										String[] values = city.split(",");
										return Arrays.stream(values);
									})
									.collect(Collectors.toList());
		
		System.out.println(resultList);
		System.out.println(resultList.size());
		
	}
}



















