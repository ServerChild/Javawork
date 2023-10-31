package interface02;

// 구현(Implement) 클래스 : 인터페이스에서 정의된 추상 메소드를 재정의해서 실행내용을 가지고 있는 클래스
// 인터페이스를 상속 받을 때 : implements 키워드 사용, 여러개의 인터페이스 상속 가능, 클래스는 한개
// public class 구현클래스이름 implements 인터페이스이름 { 인터페이스에 선언된 추상 메소드의 실체 메소드 선언 }
public class Tv implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME)
			this.volume = RemoteControl.MAX_VOLUME;
		
		else if(volume < RemoteControl.MIN_VOLUME)
			this.volume = RemoteControl.MIN_VOLUME;
		
		else
			this.volume = volume;
		
		System.out.println("현재 Tv 볼륨 : " + this.volume);
	}
	
}
