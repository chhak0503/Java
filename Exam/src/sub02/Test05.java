package sub02;

import java.util.Scanner;

/*
 * 날짜 : 0000/00/00
 * 이름 : 홍길동
 * 내용 : 자바 배열 이진탐색 연습문제
 * 
 * 이진탐색
 *  - 이진탐색은 전체 원소가 정렬된 상태에서 중앙값을 기준으로 절반은 버리고 
 *    나머지 절반을 대상으로 검색을 수행하는 알고리즘이다.
 * 
 * 검색단계
 *  1단계 : 배열의 중앙값을 찾는다.
 *  2단계 : 검색하고자 하는 값보다 중앙값이 크면 중앙값의 오른쪽을 버린다.
 *  3단계 : 다시 왼쪽 절반에 대해서 중앙값을 찾는다.
 *  4단계 : 위와 같이 반복 수행을 통해 검색하고자하는 값을 발견할 수 있다.
 */
public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {5, 10, 18, 22, 35, 55, 75, 103, 152};
		
		System.out.print("검색할 값 입력 : ");
		int value = sc.nextInt();
		
		int start = 0;
		int end = arr.length - 1;
		int loc = 0;
		boolean state = false;
		
		while(start <= end) {
			
			int mid = (start + end) / 2;
			
			if(arr[mid] > value) {
				end = mid - 1;
			}else if(arr[mid] < value) {
				start = mid + 1;
			}else {
				loc = mid;
				state = true;
				break;						
			}
		}
		
		if(state) {
			System.out.printf("찾은 위치 : %d번째 있습니다.", loc+1);
		}else {
			System.out.println("찾는 숫자가 없습니다.");
		}
		sc.close();
	}
}
