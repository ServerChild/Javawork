package ex_20231030.pet_Ex;

public class Pet {
	// 필드
	private String kind; // 종류
	private String color; // 색
	
	// 생성자
	Pet() { }
	
	Pet(String kind, String color) {
		this.kind = kind;
		this.color = color;
	}
	
	// 오버라이딩 받음, 빈 값으로 둬도 o
	void sound() { } // 울음소리
	
	void pattern() { } // 특징
	
	// 필드가 private 일 경우
	// 	1. getter/setter를 이용
	String getKind() { 
		return kind; // 반환타입이 있는 경우 kind 값을 리턴
	}
	
	void getColor() { 
		System.out.println(color); // 반환타입이 없으므로 바로 출력
	}
	
	// 	2. toString()을 오버라이딩
	// 무조건 public 사용
	@Override
	public String toString() {
		return "종류는 " + kind + ", " + "색상은 " + color;
	}
	
	// 	3. 별도의 메소드 정의 출력
	void information() {
		System.out.println("종류는 " + kind + ", " + "색상은 " + color);
	}
}
