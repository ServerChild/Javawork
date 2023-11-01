package ex_20231030.polymorphism_EX;

public class Product {
	// 필드 : 제품의 가격, 보너스
	int price;
	int bonusPoint;
	
	// 생성자
	// Product() { }
	
	Product(int price) {
		this.price = price;
		bonusPoint = price / 10;
	}
}
