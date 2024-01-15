package sub4;

public class Producer extends Thread {

	private Store store;
	
	public Producer(Store store) {
		this.store = store;
	}
	
	@Override
	public void run() {
		
		for(int i=1 ; i<=10 ; i++) {
			
			store.produce();
			
		}
		
	}
	
}