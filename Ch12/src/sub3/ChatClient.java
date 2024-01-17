package sub3;

import java.net.Socket;

/*
 * 날짜 : 2024/01/17
 * 이름 : 김철학
 * 내용 : 채팅 프로그램 실습하기
 */
public class ChatClient {
	public static void main(String[] args) {
		
		System.out.println("[Client]");
		
		Socket socket = null;
		
		try {
			
			socket = new Socket("127.0.0.1", 9001);
			
			Thread t1 = new ThreadSender(socket);
			Thread t2 = new ThreadReceiver(socket);
			
			t1.start();
			t2.start();
			
			t1.join();
			t2.join();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Client 종료...");
	}
}







