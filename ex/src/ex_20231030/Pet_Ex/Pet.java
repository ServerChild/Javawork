package ex_20231030.Pet_Ex;

public class Pet {
	// 필드
	String kind; // 종류
	String color; // 색
	String sound; // 울음소리
	String pattern; // 생김새
	
	// 생성자
	Pet() { }
	
	Pet(String kind, String color) {
		this.kind = kind;
		this.color = color;
	}
}
