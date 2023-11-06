package ex_20231103.library;

import java.util.Objects;

// <Book>을 넣으면 부모에서 자식으로 형변환을 따로하지 않아도 됨
public class Book implements Comparable<Book> {
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
	
	
	// 책 정렬 기준
	/* 정렬 기준
	  - 특정 필드를 기준으로 정수값 반환
		-> 정수 일 때 : this.price < o.price -> -1
					 this.price == o.price -> 0
					 this.price > o.price -> 1
		-> 문자열 일 때 : 문자가 같을 때 0
					  문자가 다를 때 음수 또는 양수
	*/
	@Override
	public int compareTo(Book o) {
		// 숫자일 때
		// return this.getPrice() - o.getPrice();
		
		// 문자열 비교할 때
		// compareTo()가 오버라이딩 되어있음
		return this.getTitle().compareTo(o.getTitle());
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
