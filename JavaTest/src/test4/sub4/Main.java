package test4.sub4;

public class Main {
	
	public static void main(String[] args) {
		
		Book book = new Book("자바 프로그래밍", "제임스 고슬링", "101-1234-1001");
		
		Member member =  new Member("홍길동", "A001");
		
		book.getBookInfo();
		
		member.borrowBook(book);
		
		book.getBookInfo();
		
		// 회원정보
		member.getMemberInfo();
		
		// 도서대출
		member.borrowBook(book);
		
		// 도서반납
		member.returnBook(book);
		
	}

}
