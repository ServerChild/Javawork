package ex_20231031.book_Ex03;

public class Book extends LibraryController {
	// 필드 : 도서명, 저자명, 출판사명
	private String title;
	private String author;
	private String publisher;
	
	// 생성자
	public Book(){}
	
	public Book(String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	
	public String toString() {
		return "도서명 : " + title + " " + "저자명 : " + author + " " + "출판사명 : " + publisher;
	}
}
