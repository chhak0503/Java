package sub1;

/*
 * 날짜 : 2025/07/08
 * 이름 : 김철학
 * 내용 : 자료구조 Stack 실습하기
 */
public class StackTest {

	public static void main(String[] args) {
	
		int[] stack = new int[5];
		int top = 0; // top 포인트 위치
		
		// 데이터 10 저장(Push)
		stack[top] = 10;
		top++;
		
		// 데이터 연속 삽입
		stack[top++] = 20;
		stack[top++] = 30;
		stack[top++] = 40;
		stack[top++] = 50;
		
		// 출력
		System.out.println("현재 top : " + top);
		
		for(int i=0 ; i<stack.length ; i++) {			
			System.out.println("stack["+i+"] : " + stack[i]);			
		}
		
		// 데이터 삭제		
		int removed = stack[--top];
		stack[--top] = 0;
		
		System.out.println("삭제 데이터 : " + removed);
		
		System.out.println("삭제 데이터 : " + stack[--top]);
		
	}
}







