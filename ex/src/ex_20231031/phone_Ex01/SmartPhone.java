package ex_20231031.phone_Ex01;

public class SmartPhone extends Phone {
	// 생성자
	SmartPhone() { }
	
	SmartPhone(String owner) {
		super(owner);
	}

	@Override
	public void turnOn() {
		System.out.println("화면에 통화버튼을 옆으로 밀어 전화를 받습니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("종료를 눌러 전화를 끊습니다.");
	}
	
	void search(String search) {
		System.out.println(search + "의 검색 결과입니다.");
	}
}
