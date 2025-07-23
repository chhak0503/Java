package sub4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/*
 * 날짜 : 2025/07/23
 * 이름 : 김철학
 * 내용 : 파일 처리 실습 
 * 
 */
public class FileTest {

	
	public static void main(String[] args) {
		
		String path1 = "C:\\Users\\GGG\\Desktop\\source.txt";
		String path2 = "C:\\Users\\GGG\\Desktop\\Sample";
		
		// 파일 객체 생성
		File file1 = new File(path1);
		File file2 = new File(path2);		
		
		// 파일 작업
		try {
			file1.createNewFile();  // 파일 생성
			file2.mkdir();			// 디렉터리 생성
			
			System.out.println("file1 존재여부 : " + file1.exists());
			System.out.println("file2 존재여부 : " + file2.exists());
			System.out.println("file1 파일여부 : " + file1.isFile());
			System.out.println("file2 디렉터리 여부 : " + file2.isDirectory());
			System.out.println("file1 이름 : " + file1.getName());
			System.out.println("file2 이름 : " + file2.getName());
			System.out.println("file1 상대 경로 : " + file1.getPath());
			System.out.println("file2 상대 경로 : " + file2.getPath());
			System.out.println("file1 시스템 경로 : " + file1.getAbsolutePath());
			System.out.println("file2 시스템 경로 : " + file2.getAbsolutePath());
			
			//file1.delete(); // 파일 삭제
			//file2.delete(); // 파일 삭제		
			
			// Files 실습
			Path source = Paths.get("C:\\Users\\GGG\\Desktop\\source.txt");
			Path target = Paths.get("C:\\Users\\GGG\\Desktop\\target.txt");
			Path dest = Paths.get("C:\\Users\\GGG\\Desktop\\dest.txt");
						
			// 파일 복사
			Files.copy(source, target);
			
			// 파일 이동
			Files.move(source, dest, StandardCopyOption.REPLACE_EXISTING);
			
			// 파일 삭제
			Files.delete(target);			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
	}
	
}



























