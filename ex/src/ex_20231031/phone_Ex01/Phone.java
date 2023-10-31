package ex_20231031.phone_Ex01;

// 추상 클래스
public abstract class Phone {
	// 필드
	private String owner; // 누구껀지
	
	// 생성자
	Phone() { }
	
	Phone(String owner) {
		this.owner = owner;
	}
	
	// 추상 메소드
	public abstract void turnOn();
	
	public abstract void turnOff();
	
	// 메소드
	void information() {
		System.out.println(owner);
	}
}
