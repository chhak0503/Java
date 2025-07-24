package sub4;

/*
 * 날짜 : 2025/07/24
 * 이름 : 김철학
 * 내용 : 자바 스레드 제어 실습하기
 */
class WorkObject {
	
	public synchronized void method1() {
		
		Thread th = Thread.currentThread();
		System.out.println(th.getName() + " - method1 실행...");
			
		// 다른 스레드를 실행 상태로 전환
		notify();
		
		try {
			// 자신은 일시 정지 상태로 전환
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void method2() {
		
		synchronized (this) {
			
			Thread th = Thread.currentThread();
			System.out.println(th.getName() + " - method2 실행...");
				
			// 다른 스레드를 실행 상태로 전환
			notify();
			
			try {
				// 자신은 일시 정지 상태로 전환
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}		
	}	
}

class ThreadA extends Thread {
	
	private WorkObject work;
	
	public ThreadA(WorkObject work) {
		this.work = work;
		setName("ThreadA"); // 부모클래스 메서드로 스레드명 초기화
	}
	
	@Override
	public void run() {
		
		for(int i=0 ; i<10 ; i++) {			
			work.method1();			
		}
	}	
}

class ThreadB extends Thread {
	
	private WorkObject work;
	
	public ThreadB(WorkObject work) {
		this.work = work;
		setName("ThreadB"); // 부모클래스 메서드로 스레드명 초기화
	}
	
	@Override
	public void run() {
		
		for(int i=0 ; i<10 ; i++) {			
			work.method2();			
		}
	}	
}

public class ThreadNotifyTest {

	public static void main(String[] args) throws InterruptedException {
		
		WorkObject work = new WorkObject();
		
		ThreadA thA = new ThreadA(work);
		ThreadB thB = new ThreadB(work);
		
		thA.start();
		thB.start();
		
		thA.join();
		thB.join();
		
		System.out.println("프로그램 종료...");
	}
	
}




















