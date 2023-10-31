package ex_20231030.pet_Ex;

public class Cat extends Pet {
	// 생성자
	Cat() {
		super("고양이", "치즈색");
	}
	
	// color 의 값만 입력받을 경우
	Cat(String color) {
		super("고양이", color);
	}
	
	// 부모 클래스에 있는 형과 똑같아야 함
	@Override
	void sound() {
		System.out.println("야옹");
	}
	
	@Override
	void pattern() {
		System.out.println("도도하다");
	}
}
