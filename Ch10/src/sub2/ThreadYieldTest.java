package sub2;

/*
 * 
 * 날짜 : 2024/01/15
 * 이름 : 김철학
 * 내용 : Java Thread Yield 상태 실습하기
 */
class SubThread1 extends Thread {
	
	@Override
	public void run() {
		for(int i=1 ; i<=1000 ; i++) {
			System.out.println("SubThread1 : " + i);
			
			// 다른 스레드에게 실행 양보
			Thread.yield();
		}
	}
}

class SubThread2 extends Thread {
	@Override
	public void run() {
		for(int i=1 ; i<=1000 ; i++) {
			System.out.println("SubThread2 : " + i);
		}
	}
}

public class ThreadYieldTest {
	public static void main(String[] args) {
		
		SubThread1 sub1 = new SubThread1();
		SubThread2 sub2 = new SubThread2();
		
		sub1.start();
		sub2.start();
		
		try {
			sub1.join();
			sub2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}
}







