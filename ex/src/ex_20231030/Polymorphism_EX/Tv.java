package ex_20231030.Polymorphism_EX;

public class Tv extends Product {
	Tv() {
		super(3000);
	}
	
	@Override
	public String toString() {
		return "Tv";
	}
}
