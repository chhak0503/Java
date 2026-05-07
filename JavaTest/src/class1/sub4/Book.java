package class1.sub4;

public class Book {

	private String title;
	private String author;
	private String isbn;
	private boolean isBorrowd;
	
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isBorrowd = false;
	}

	public void borrowBook() {
		
		if(!isBorrowd) {
			this.isBorrowd = true;
			System.out.println("도서대출 : " + title);
		}else {
			System.out.println(title + "이미 대출됨");
		}
	}
	
	public void returnBook() {
		if(isBorrowd) {
			this.isBorrowd = false;
			System.out.println("도서반납 : " + title);
		}else {
			System.out.println("도서 대출 됨");
		}
	}
	
	public void getBookInfo() {
		System.out.println("도서제목 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("도서번호 : " + isbn);
		System.out.println("대출여부 : " + (isBorrowd ? "불가능" : "가능"));
	}
	
	public String getTitle() {
		return title;
	}
}














