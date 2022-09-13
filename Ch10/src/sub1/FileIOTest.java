package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜 : 2022/09/13
 * 이름 : 김철학
 * 내용 : 파일 입출력 스트림 실습하기
 * 
 * 파일 입출력(I/O)
 *  - 파일(File)은 컴퓨터 저장매체에 저장되는 데이터 묶음
 *  - 프로그램은 데이터 처리와 함께 저장하기 위해 파일 입출력을 수행
 *  - 파일 입출력을 위해 스트림(Stream)을 연결해야 됨 
 */
public class FileIOTest {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\java1\\Desktop\\Sample1.txt";
		String target = "C:\\Users\\java1\\Desktop\\Sample2.txt";
		
		try {
			// 파일과 스트림 연결
			FileInputStream fis = new FileInputStream(path);
			FileOutputStream fos = new FileOutputStream(target);
			
			while(true) {
				// 파일 읽기
				int value = fis.read();
				
				if(value == -1) { 
					// 파일을 모두 읽었으면
					break;
				}
				
				//char c = (char) value;
				//System.out.print(c);
				
				// 파일 쓰기
				fos.write(value);
			}
			
			// 스트림 해제
			fis.close();
			fos.close();
			
			System.out.println("쓰기 완료!");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
