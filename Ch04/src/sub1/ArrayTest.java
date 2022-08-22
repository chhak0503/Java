package sub1;

/*
 * 날짜 : 2022/08/22
 * 이름 : 김철학
 * 내용 : Java 배열 실습하기
 * 
 * 배열(Array)
 *  - 하나 이상의 데이터를 하나의 변수에 저장할 수 있는 자료구조
 *  - 현대 프로그래밍에서는 Array 대신 List를 더 많이 사용
 */
public class ArrayTest {
	public static void main(String[] args) {
		
		// 배열
		int[]    arr1 = {1, 2, 3, 4, 5};
		char[]   arr2 = {'A', 'B', 'C'};
		String[] arr3 = {"서울", "대전", "대구", "부산", "광주"};
		
		// 배열 원소 출력
		System.out.println("arr1[0] : "+arr1[0]);
		System.out.println("arr1[2] : "+arr1[2]);
		System.out.println("arr1[4] : "+arr1[4]);

		System.out.println("arr2[0] : "+arr2[0]);
		System.out.println("arr2[1] : "+arr2[1]);
		
		System.out.println("arr3[0] : "+arr3[0]);
		System.out.println("arr3[3] : "+arr3[3]);
		System.out.println("arr3[4] : "+arr3[4]);
		
		// 배열 길이
		System.out.println("arr1의 배열 길이 : "+arr1.length);
		System.out.println("arr2의 배열 길이 : "+arr2.length);
		System.out.println("arr3의 배열 길이 : "+arr3.length);
		
		// 배열 반복문
		for(int i=0; i<arr1.length; i++) {			
			System.out.println("arr1["+i+"] : "+arr1[i]);
		}
		
		for(char ch : arr2) {
			System.out.print(ch+" ");
		}
		System.out.println();
		
		for(String city : arr3) {
			System.out.printf("%s ", city);
		}
		System.out.println();
	}
}



















