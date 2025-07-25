package sub4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 날짜 : 2025/07/24
 * 이름 : 김철학
 * 내용 : 맵 스트림 실습하기
 */


class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
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
		
		// 불변 리스트
		List<Person> persons = List.of( new Person("김유신", 23),
										new Person("김춘추", 21),
										new Person("장보고", 33),
										new Person("강감찬", 43),
										new Person("이순신", 53));
		
		// 불변 리스트는 추가적인 데이터 지원 안함 -> UnsupportedOperationException 발생
		//persons.add(new Person("adsf", 22));
		
		System.out.println(persons);
		
		// mapXXX : 컬렉션(리스트) 원소를 다른 원소로 변환
		persons.stream().map(person -> {
			
			return person.getName();			
			
		}).forEach( name -> {
			
			System.out.println(name);
		});
		
		
		int total = persons.stream().mapToInt(Person::getAge).sum();
		System.out.println("total : " + total);
		
				
		// flatMapXXX : 컬렉션(리스트) 원소를 여러개의 다른 원소로 변환
		List<String> fruits = List.of("Apple,Banana", "Cherry,Grape", "Orange,Mango");
				
		List<String> result = fruits
								.stream()
								.flatMap(line -> {
			
									String[] values = line.split(",");
									
									return Arrays.stream(values);
									
								}).collect(Collectors.toList());
		
		System.out.println(result);
		
	}
}














