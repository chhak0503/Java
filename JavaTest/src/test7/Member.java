package test7;

public class Member {

	private String name;
	private String memberId;
	private Book borrowedBook;
	
	public Member(String name, String memberId) {
		this.name = name;
		this.memberId = memberId;
		borrowedBook = null;
	}
	
	public void borrowBook(Book book) {
		book.borrowBook();
		borrowedBook = book;
	}
	
	public void returnBook(Book book) {
		book.returnBook();
		borrowedBook = null;
	}
	
	public void getMemberInfo() {
		System.out.println("이름 : " + name);
		System.out.println("회원ID : " + memberId);
		
		
		if(borrowedBook != null) {
			System.out.println("대출한 도서 : " + borrowedBook.getTitle());	
		}else {
			System.out.println("대출한 도서 : 없음");
		}
	}
	
}












