package ex_20231030.Polymorphism_EX;

public class ProductArrayTest02 {
	public static void main(String[] args) {
		Buyer2 b2 = new Buyer2();
		
		b2.buy(new Computer());
		b2.buy(new Tv());
		b2.buy(new Game());
		
		b2.buyList();
	}
}
