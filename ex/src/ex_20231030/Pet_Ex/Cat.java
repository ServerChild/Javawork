package ex_20231030.Pet_Ex;

public class Cat extends Pet{
	// 생성자
	Cat() { }
	
	public void kind(Pet p) {
		System.out.println("고양이");
	}
	
	public void color(Pet p) {
		System.out.println("치즈색");
	}
	
	public void sound(Pet p) {
		System.out.println("야옹");
	}
	
	public void pattern(Pet p) {
		System.out.println("단색");
	}
	
	@Override
	public String toString() {
		return "Cat";
	}
}
