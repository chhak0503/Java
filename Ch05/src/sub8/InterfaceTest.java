package sub8;
 
/*
 * 날짜 : 2024/01/04
 * 이름 : 김철학
 * 내용 : Java 인터페이스 실습하기
 */

class Computer {
	public void boot() {
		System.out.println("시스템 부팅...");
	}
}

interface Internet {
	public void access();
}

class Tv extends Computer implements Internet {

	@Override
	public void access() {
		System.out.println("인터넷 접속...");
	}
	
	public void show() {
		System.out.println("Tv 시청...");
	}
}

public class InterfaceTest {
	
	public static void main(String[] args) {
		
		// 인터페이스 예제1 - 표준화된 클래스 설계
		RemoteControl lg = new RemoteLG();
		lg.powerOn();
		lg.chUp();
		lg.soundUp();
		lg.powerOff();
		
		RemoteControl samsung = new RemoteSamsung();
		samsung.powerOn();
		samsung.chDown();
		samsung.soundDown();
		samsung.powerOff();
		
		// 인터페이스 예제2 - 유연성(결합도 완화)
		Bulb buld = new Bulb();
		Socket socket = new Cable(buld);
		
		socket.switchOn();
		socket.switchOff();
		
		// 인터페이스 예제3 - 다중상속 효과
		Tv smartTv = new Tv();
		smartTv.boot();
		smartTv.access();
		smartTv.show();
	}
}












