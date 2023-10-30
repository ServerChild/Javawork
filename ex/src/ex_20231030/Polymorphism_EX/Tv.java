package ex_20231030.Polymorphism_EX;

public class Tv extends Product {
	Tv(int price) {
		super(1000);
	}
	
	@Override
	public String toString() {
		return "Tv";
	}
}
