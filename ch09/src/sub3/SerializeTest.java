package sub3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
 * 날짜 : 2025/07/23
 * 이름 : 김철학
 * 내용 : 직렬화 실습 
 * 
 */
public class SerializeTest {
	
	public static void main(String[] args) {
		
		// 직렬화를 위해 Serializable 인터페이스 구현된 객체
		Apple apple = new Apple("한국", 3000);
		
		String path = "C:\\Users\\GGG\\Desktop\\apple.data";
		
		try {
			// 직렬화를 위한 기본스트림과 보조스트림 생성
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			// 객체 직렬화 : 내부의 생성된 객체를 외부 파일로 내보내기
			oos.writeObject(apple);
			
			// 스트림 종료
			oos.close();
			fos.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}
}



