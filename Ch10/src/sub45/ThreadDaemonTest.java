package sub45;


class SubThread extends Thread {

	@Override
	public void run() {
		
		for(int i=0 ; i<10 ; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("SubThread 실행...");
		}
	}
}

public class ThreadDaemonTest {
	public static void main(String[] args) {
		
		SubThread st = new SubThread();
		st.setDaemon(true); // 데몬스레드 설정
		
		st.start();
		
		for(int i=1 ; i<=3 ; i++) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("MainThread 실행...");
		}
		
		System.out.println("프로그램 종료...");
	}
}
