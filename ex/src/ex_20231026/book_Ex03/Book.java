package ex_20231026.book_Ex03;

public class Book {
	// 필드(속성)
	private String title; // 책제목
	private int price; // 가격
	private double discountRate; // 할인율
	private String author; // 저자
	
	// 생성자
	public Book() { }
	
	public Book(String title, int price, double discountRate, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	// 모든 정보 출력
	public String information() {
		return title + " " + price + " " + discountRate + " " + author;
	}

	// 할인율 적용한 가격 출력
	public int getDiscountPrice() {
		return (int)(price - (price * discountRate));
	}
	
	// getter, setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
