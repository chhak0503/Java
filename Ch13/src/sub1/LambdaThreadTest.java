package sub1;

/*
 * 날짜 : 2022/09/20
 * 이름 : 김철학
 * 내용 : 람다식을 활용한 스레드 실습하기
 */
public class LambdaThreadTest {
	public static void main(String[] args) {
		
		Runnable r = () -> {
			
			for(int i=1 ; i<=10 ; i++) {
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("서브 스레드 실행...");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i=1 ; i<=10 ; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("메인 스레드 실행...");
		}
		
		System.out.println("프로그램 종료...");
	}
}
