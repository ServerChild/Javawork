package ex_20231030.pet_Ex;

public class Dog extends Pet {
	// 생성자
	Dog() {
		super("강아지", "얼룩이");
	}
	
	Dog(String color) {
		super("강아지", color);
	}
	
	// 부모 클래스에 있는 형과 똑같아야 함
	@Override
	void sound() {
		System.out.println("멍멍");
	}
	
	@Override
	void pattern() {
		System.out.println("귀엽다");
	}
}
