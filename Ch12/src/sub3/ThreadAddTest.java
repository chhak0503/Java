package sub3;

/*
 * 날짜 : 2022/09/19
 * 이름 : 김철학
 * 내용 : 스레드 활용 실습하기
 */
public class ThreadAddTest {
	public static void main(String[] args) throws InterruptedException {
		
		AddThread at1 = new AddThread(1, 50);
		AddThread at2 = new AddThread(51, 100);
		
		Thread t1 = new Thread(at1);
		Thread t2 = new Thread(at2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		int tot1 = at1.getNum();
		int tot2 = at2.getNum();
		
		int total = tot1 + tot2;
		System.out.println("1부터 100까지 합 : " + total);
	}
}
