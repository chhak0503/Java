package sub1;

import java.util.Iterator;

/**
 * 날짜 : 2026/05/14
 * 이름 : 김철학
 * 내용 : Java 스레드(Thread) 실습
 */
public class ThreadTest {
	
	public static void main(String[] args) {
		
		// 스레드 객체 생성
		ChildThread ct1 = new ChildThread();
		ChildThread ct2 = new ChildThread();
		
		ct1.setName("Child1");
		ct2.setName("Child2");
		
		// 자식 스레드 실행
		ct1.start();		
		ct2.start();
		
		for(int i=0 ; i<10 ; i++) {
			
			System.out.println( "Main - 스레드 실행..." );
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}					
		
		System.out.println("Main Thread 종료...");
	}
}
