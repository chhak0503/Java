package sub2;

/*
 * 
 * 날짜 : 2024/01/15
 * 이름 : 김철학
 * 내용 : Java Thread 상태 실습하기
 */

class ChildThread extends Thread {
	
	@Override
	public void run() {
		
		for(int i=1 ; i<=10 ; i++) {
			
			System.out.println("i : " + i);
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("자식 스레드 종료...");
	}
}

public class ThreadJoinTest {

	public static void main(String[] args) {
		
		ChildThread ct = new ChildThread();
		
		// 자식 스레드 실행
		ct.start();
		
		
		// 자식 스레드 종료 대기
		try {
			ct.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램(메인 스레드) 종료...");
	}
}








