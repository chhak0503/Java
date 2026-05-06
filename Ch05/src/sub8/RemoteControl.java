package sub8;


// 인터페이스: 오직 추상메서드만 갖는 구조체
public interface RemoteControl {
	
	// 인터페이스는 속성을 갖지 않음

	public abstract void powerOn();
	public abstract void powerOff();
	
	public void chUp();		// abstract 키워드 생략 가능
	public void chDown();
	
	public void soundUp();
	public void soundDown();
}
