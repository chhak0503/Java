package sub3;

public class Count {
	
	private int num = 0;
	
	public int getNum() {
		return num;
	}	
	
	// synchronized : 동기화 블럭, 스레드의 경합(Race Condition)을 막고 순차적으로 스레드 실행
	public synchronized void setNum() {
		// 임계영역 : 하나의 스레드가 해당 영역에 들어올때 Lock걸고 영역을 빠져나갈때 해제 		
		this.num++;
	}

}
