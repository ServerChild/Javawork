package ex_20231026.product_Ex02;

public class Product {
	private String productId; // 제품 Id
	private String productName; // 제품 이름
	private String productArea; // 제품 판매 장소
	private int price; // 가격
	private double tax; // 세금
	
	// 생성자
	public Product() { }
	
	public Product(String productId, String productName, String productArea, int price, double tax) {
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}
	
	// 부가세 포함 가격 계산
	public int getRePrice() {
		return (int)(price + (price * tax));
	}
	
	// 모든 정보 읽어오기
	public String information() {
		return productId + " " + productName + " " + productArea + " " + price + " " + tax;
	}

	// getter, setter
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductArea() {
		return productArea;
	}

	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
}
