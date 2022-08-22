package sub2;

/*
 * 날짜 : 2022/08/22
 * 이름 : 김철학
 * 내용 : Java 다차원 배열 실습하기
 */
public class MultiArrayTest {
	public static void main(String[] args) {
		
		// 1차원 배열
		int []scores = {80, 60, 78, 62, 92};
		int total = 0;
		
		for(int score : scores) {
			total += score;
		}
		
		System.out.println("scores의 합 : "+total);
		
		// 2차원 배열
		int [][]arr2d = {{1,  2,  3,  4}, 
						 {5,  6,  7,  8}, 
						 {9, 10, 11, 12}};
		
		for(int a=0; a<3; a++) {
			for(int b=0; b<4; b++) {
				System.out.println("arr2d["+a+"]["+b+"] : "+arr2d[a][b]);		
			}
		}
		
		// 3차원 배열
		
		
		
	}
}
