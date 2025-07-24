package sub5;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 날짜 : 2025/07/24
 * 이름 : 김철학
 * 내용 : 자바 스레드풀 실습하기
 */

class Task implements Runnable {

	private String job;
	
	public Task(String job) {
		this.job = job;
	}	
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + " - " + this.job);		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();			
			Thread.currentThread().interrupt();
		}		
	}
}


public class ThreadPoolTest {

	public static void main(String[] args) {
		
		// 스레드풀 생성
		ExecutorService ex = Executors.newFixedThreadPool(10); // 고정된 스레드 갯수로 생성
		
		// 작업 제출(요청)
		for(int i=1 ; i<=10 ; i++) {			
			ex.execute(new Task("Task - " + i));			
		}
		
		// 모든 작업이 끝난 후 스레드풀 종료
		ex.shutdown();
		
		System.out.println("프로그램 종료...");
	}	
}











