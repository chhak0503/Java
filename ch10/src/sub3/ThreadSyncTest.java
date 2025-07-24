package sub3;


/*
 * 날짜 : 2025/07/24
 * 이름 : 김철학
 * 내용 : 자바 스레드 동기화 실습하기
 */
public class ThreadSyncTest {

	
	public static void main(String[] args) throws InterruptedException {
		
		Count count = new Count();
		
		CountThread c1 = new CountThread(count);
		CountThread c2 = new CountThread(count);
		CountThread c3 = new CountThread(count);
		
		c1.start();		
		c2.start();		
		c3.start();
		
		c1.join();
		c2.join();
		c3.join();
		
		
		System.out.println("최종 결과 : " + count.getNum());
	}
}








