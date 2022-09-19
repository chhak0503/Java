package sub1;

/**
 * 날짜 : 2022/09/19
 * 이름 : 김철학
 * 내용 : 스레드 실습하기
 * 
 * 스레드(Thread)
 *  - 하나의 프로세스 안에서 실행되는 실행 흐름
 *  - Thread 클래스를 상속받아 start로 run메서드 실행
 */
public class ThreadTest {
	public static void main(String[] args) {
		
		SubThread st1 = new SubThread("Sub1");
		SubThread st2 = new SubThread("Sub2");
		
		// 비동기(Asyncronize) 방식으로 실행
		st1.start();		
		st2.start();
		
		for(int i=1 ; i<=10 ; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Main 스레드 실행...");
		}
		
		System.out.println("Main 스레드 종료...");
	}
}
