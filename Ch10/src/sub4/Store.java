package sub4;

public class Store {

	private int count = 0;
	private int max = 3;
	private int min = 0;
	
	public synchronized void produce() {		
		System.out.println("생산 전 : " + count);

		while(count >= max) {			
			try {
				System.out.println("produce 대기...1");
				
				// 현재 실행 스레드는 대기상태로 전환
				wait();
				System.out.println("produce 대기...2");
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		count++;
		
		// 대기 상태의 스레드를 실행 준비상태로 전환
		notifyAll();		
		
		System.out.println("생산 후 : " + count);
	}
	
	public synchronized void consume() {		
		System.out.println("소비 전 : " + count);

		while(count <= min) {			
			try {
				System.out.println("consume 대기...1");
				wait();
				System.out.println("consume 대기...2");
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		count--;
		notifyAll();		
		System.out.println("소비 후 : " + count);
	}
	
}
