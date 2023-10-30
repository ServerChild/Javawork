package ex_20231030.Pet_Ex;

public class Dog extends Pet{
	// 생성자
	Dog() { }
	
	public void kind(String kind) {
		this.kind = kind;
		kind = "강아지";
	}
	
	public void color(String color) {
		this.color = color;
		color = "흰색 & 갈색";
	}
	
	public void sound(String sound) {
		this.sound = sound;
		sound = "멍멍";
	}
	
	public void pattern(Pet p) {
		System.out.println("얼룩이");
	}
	
	@Override
	public String toString() {
		return "Dog";
	}
}
