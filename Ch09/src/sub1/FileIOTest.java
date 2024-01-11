package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜 : 2024/01/11
 * 이름 : 김철학
 * 내용 : Java 데이터 입출력 스트림 실습
 */
public class FileIOTest {
	
	public static void main(String[] args) {
		
		String source = "C:\\Users\\java\\Desktop\\Test1.txt";
		String target = "C:\\Users\\java\\Desktop\\Test2.txt";
		
		try {
			// 스트림 생성(연결)
			FileInputStream  fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target); 
			
			
			while(true) {
				
				// 파일 읽기
				int data = fis.read();
				
				if(data == -1) {
					// 파일 모두 읽었을 때 반복 종료
					break;
				}
				
				char ch = (char) data;
				//System.out.print(ch);
				
				// 파일 쓰기
				fos.write(data);
			}
			
			// 스트림 해제
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		System.out.println("프로그램 종료...");
	}
}
