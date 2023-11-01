package ex_20231030.pet_Ex;

public class Frog extends Pet {
	// 생성자
	Frog() {
		super("개구리", "연두색");
	}
	
	// color 의 값만 입력받을 경우
	Frog(String color) {
		super("개구리", color);
	}
	
	// 부모 클래스에 있는 형과 똑같아야 함
	@Override
	void sound() {
		System.out.println("개굴");
	}
	
	@Override
	void pattern() {
		System.out.println("물가에 산다");
	}

}
