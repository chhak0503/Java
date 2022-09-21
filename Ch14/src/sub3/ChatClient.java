package sub3;

import java.net.Socket;

/*
 * 날짜 : 2022/09/21
 * 이름 : 김철학
 * 내용 : 채팅 프로그램 실습하기 
 */
public class ChatClient {
	public static void main(String[] args) {
		System.out.println("[Client]");
		
		Socket socket = null;
		
		try {
			socket = new Socket("localhost", 9001);
			
			Thread t1 = new SenderThread(socket);
			Thread t2 = new ReceiverThread(socket);
			
			t1.start();
			t2.start();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
