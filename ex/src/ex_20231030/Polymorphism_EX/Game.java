package ex_20231030.Polymorphism_EX;

public class Game extends Product {
	Game(int price) {
		super(500);
	}
	
	@Override
	public String toString() {
		return "game";
	}
}
