package ex_20231030.Pet_Ex;

public class Frog extends Pet{
	// 생성자
	Frog() { }
	
	public void kind(Pet p) {
		System.out.println("개구리");
	}
	
	public void color(Pet p) {
		System.out.println("연두색 & 초록색");
	}
	
	public void sound(Pet p) {
		System.out.println("개굴");
	}
	
	public void pattern(Pet p) {
		System.out.println("민무늬");
	}
	
	@Override
	public String toString() {
		return "Frog";
	}
}
