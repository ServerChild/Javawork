package ex_20231030.Polymorphism_EX;

public class ProductTest01 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Game());
		// b.buy(new Product());
		
		System.out.println("현재 남은 돈 : " + b.money + "원 입니다.");
		System.out.println("보너스 점수 : " + b.bonusPoint + "점 입니다.");
		
		b.buy(new Tv());
		
	}
}
