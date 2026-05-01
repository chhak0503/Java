package sub1;

/**
 * 날짜 : 2026/04/28
 * 이름 : 김철학
 * 내용 : Java 배열 실습
 */
public class ArrayTest {

	public static void main(String[] args) {
		
		// 배열 생성
		int[]    arr1 = {1, 2, 3, 4, 5};
		char[]   arr2 = {'A', 'B', 'C'};
		String[] arr3 = {"서울", "대전", "대구", "부산", "광주"};
		
		// 배열 원소 출력
		System.out.println("arr1 첫번째 원소 : " + arr1[0]);
		System.out.println("arr1 두번째 원소 : " + arr1[1]);
		System.out.println("arr1 네번째 원소 : " + arr1[3]);
		System.out.println("arr2 첫번째 원소 : " + arr2[0]);
		System.out.println("arr2 세번째 원소 : " + arr2[2]);
		System.out.println("arr3 첫번째 원소 : " + arr3[0]);
		System.out.println("arr3 네번째 원소 : " + arr3[3]);
		
		// 배열 길이
		System.out.println("arr1 길이 : " + arr1.length);
		System.out.println("arr2 길이 : " + arr2.length);
		System.out.println("arr3 길이 : " + arr3.length);
		
		// 배열 반복문
		for(int i=0 ; i<arr1.length ; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		for(char c : arr2) { // for-each : 배열 전용 반복문
			System.out.println("arr2 원소 : " + c);
		}
		
		for(String city : arr3) { // for-each : 배열 전용 반복문
			System.out.println("arr3 원소 : " + city);
		}
		
		// 1차원 배열
		int[] scores = {80, 60, 75, 62, 90}; // 배열명은 끝에 s 표기(복수형으로 나타냄)
		
		int sum = 0;
		
		for(int score : scores) {
			sum += score;
		}
		
		System.out.println("scores 배열합 : " + sum);
		
		
		// 2차원 배열
		int[][] arr2d = {{ 1,  2,  3,  4}, 
						 { 5,  6,  7,  8}, 
						 { 9, 10, 11, 12}};
		
		System.out.println("arr2d[0][0] : " + arr2d[0][0]);
		System.out.println("arr2d[0][1] : " + arr2d[0][1]);
		System.out.println("arr2d[1][2] : " + arr2d[1][2]);
		System.out.println("arr2d[2][3] : " + arr2d[2][3]);
				
		// 3차원 배열
		int[][][] arr3d = {{{1,2,3}, 
							{4,5,6}, 
							{7,8,9}}, 
						   {{10,11,12}, 
							{13,14,15}, 
							{16,17,18}}, 
						   {{19,20,21}, 
							{22,23,24},
							{25,26,27}}};
		
		System.out.println("arr3d[0][0][0] : " + arr3d[0][0][0]);
		System.out.println("arr3d[0][1][1] : " + arr3d[0][1][1]);
		System.out.println("arr3d[0][2][2] : " + arr3d[0][2][2]);
		System.out.println("arr3d[1][1][2] : " + arr3d[1][1][2]);
		System.out.println("arr3d[1][2][1] : " + arr3d[1][2][1]);
		System.out.println("arr3d[2][1][1] : " + arr3d[2][1][1]);
		System.out.println("arr3d[2][2][2] : " + arr3d[2][2][2]);
		
		
	}
}











