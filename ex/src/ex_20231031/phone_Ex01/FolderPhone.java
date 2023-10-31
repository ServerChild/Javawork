package ex_20231031.phone_Ex01;

public class FolderPhone extends Phone {
	// 생성자
	FolderPhone() { }
	
	FolderPhone(String owner) {
		super(owner);
	}

	@Override
	public void turnOn() {
		System.out.println("위로 뚜껑을 열고 통화버튼을 눌러 전화를 받습니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("종료 버튼을 눌러 전화를 끊습니다.");
	}

	void message(String mms) {
		System.out.println(mms + " 라는 문자가 왔습니다.");
	}
}
