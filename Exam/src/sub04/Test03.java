package sub04;

/*
 * 날짜 : 0000/00/00
 * 이름 : 홍길동
 * 내용 : 문자열 처리 연습문제
 */
public class Test03 {
	public static void main(String[] args) {

		String fileName = "자바 프로그래밍.pdf";
		
		int idx = fileName.lastIndexOf(".");
		
		String title = fileName.substring(0, idx);
		String ext   = fileName.substring(idx+1);
		
		System.out.println("파일명 : "+title);
		System.out.println("확장자 : "+ext);
	}	
}

