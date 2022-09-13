package sub3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * 날짜 : 2022/09/13
 * 이름 : 김철학
 * 내용 : 직렬화/역직렬화 실습하기
 * 
 * 객체의 직렬화
 *  - 자바 객체를 스트림을 통해 외부 파일로 생성하는 작업
 *  - 스트림으로 전송될 객체는 Serializable 인터페이스 구현
 */
public class SerializeTest {
	
	public static void main(String[] args) {
		
		Apple a1 = new Apple("한국", 5000);
		Apple a2 = new Apple("일본", 3000);
		
		String path = "C:\\Users\\java1\\Desktop\\Apple.dat";

		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			// 객체 내보내기(직렬화)
			oos.writeObject(a1);
			oos.writeObject(a2);
			
			oos.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("직렬화 완료...");
	}
}
