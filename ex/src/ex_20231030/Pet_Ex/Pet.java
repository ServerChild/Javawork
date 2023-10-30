package ex_20231030.Pet_Ex;

public class Pet {
	// 필드
	String kind;
	String color;
	String sound;
	String pattern;
	
	// 생성자
	public Pet() {}
	
	public Pet(String kind, String color) {
		this.kind = kind;
		this.color = color;
	}
	
	public void sound(String sound) {
		this.sound = sound;
	}
	
	public void pattern(String pattern) {
		this.pattern = pattern;
	}
}
