package ex_20231030.Polymorphism_EX;

public class ProductArrayListTest03 {
	public static void main(String[] args) {
		Buyer3 b3 = new Buyer3();
		Tv tv = new Tv();
		Computer com = new Computer();
		Game game = new Game();
		
		b3.buy(tv);
		b3.buy(com);
		b3.buy(game);
		
		b3.buyList();
		
		b3.re(com);
		b3.buyList();
	}
}
