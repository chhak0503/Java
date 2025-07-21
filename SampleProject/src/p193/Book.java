package p193;

/*
 * 날짜 : 2025/07/18
 * 이름 : 김철학 
 * 내용 : 교재 p193 생성자 실습하기
 */
public class Book {

	String title;
	String author;

	public Book(String t) {
		title = t;
		author = "작자미상";
	}

	public Book(String t, String a) {
		title = t;
		author = a;
	}

	public static void main(String[] args) {

		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book("춘향전");

		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);

	}
}











