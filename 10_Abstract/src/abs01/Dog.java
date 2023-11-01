package abs01;

public class Dog extends Pet {
	// 생성자
	Dog(String color) {
		super("강아지", color);
	}

	
	// 추상 메소드는 반드시 오버라이딩하여 구현해야 함
	// 구현할 내용이 없다면 {}(빈 상태)로라도 선언을 해야함
	@Override
	public void sound() {
		System.out.println("멍멍");
	}

	@Override
	public void pattern() {
	}
}
