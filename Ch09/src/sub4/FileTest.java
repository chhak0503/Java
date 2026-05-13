package sub4;

import java.io.File;
import java.io.IOException;

/**
 * 날짜 : 2026/05/13
 * 이름 : 김철학
 * 내용 : Java File 클래스 실습
 */
public class FileTest {
	
	public static void main(String[] args) {
		
		String source = "C:\\Users\\GGG\\Desktop\\test3.txt"; // 파일
		String target = "C:\\Users\\GGG\\Desktop\\test"; // 디렉토리
		
		// 파일 객체 생성
		File file1 = new File(source);
		File file2 = new File(target);
		
		try {
			// 파일 또는 디렉토리 생성
			file1.createNewFile();
			file2.mkdir();
						
			// 파일 정보
			System.out.println("file1 존재 여부 : " + file1.exists());
			System.out.println("file2 존재 여부 : " + file2.exists());
			System.out.println("file1 파일 여부 : " + file1.isFile());
			System.out.println("file2 폴더 여부 : " + file1.isDirectory());
			System.out.println("file1 파일 이름 : " + file1.getName());
			System.out.println("file2 파일 이름 : " + file2.getName());
			System.out.println("file1 파일 경로 : " + file1.getPath());
			System.out.println("file2 파일 경로 : " + file2.getPath());
			System.out.println("file1 절대 경로 : " + file1.getAbsolutePath());
			System.out.println("file2 절대 경로 : " + file2.getAbsolutePath());
			
			// 파일 삭제
			file1.delete();
			file2.delete();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}









