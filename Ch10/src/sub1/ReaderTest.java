package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/*
 * 날짜 : 2022/09/13
 * 이름 : 김철학
 * 내용 : 문자 스트림 실습하기
 *  
 */
public class ReaderTest {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\java1\\Desktop\\Sample1.txt";
		
		try {
			// 파일과 스트림 연결
			FileReader fr = new FileReader(path);
			
			while(true) {
				// 파일 읽기
				int value = fr.read();
				
				if(value == -1) { 
					// 파일을 모두 읽었으면
					break;
				}
				
				char c = (char) value;
				System.out.print(c);
			}
			
			// 스트림 해제
			fr.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
