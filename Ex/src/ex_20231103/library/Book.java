package ex_20231103.library;

import java.util.Objects;

public class Book {
	// 필드(속성) : 도서명, 저자명, 장르, 가격
	private String title;
	private String author;
	private String category;
	private int price;
	
	
	// 생성자
	public Book() { }
	
	public Book(String title, String author, String category, int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	
	// 객체 정보 출력
	public String toString() {
		return "[ " + "도서명 : " + title + "  " + "저자명 : " + author + "  " + "장르 : " + category + "  " + "가격 : " + price + " ]";
	}
	
	
	// 해시코드 출력
	@Override
	public int hashCode() {
		return Objects.hash(title, author, category, price);
	}
	
	
	// 객체가 같은지 여부 확인
	@Override
	public boolean equals(Object o) {
		if(o instanceof Book) {
			Book b = (Book)o;
			return (title.equals(b.title)) && (author.equals(b.author)) && (category.equals(b.category)) && (price == b.price);
			// (category == ((Book)o).category) && (price == ((Book)o).price) -> 이 형식도 가능
		}
		return false;
	}
	
	
	// getter, setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
