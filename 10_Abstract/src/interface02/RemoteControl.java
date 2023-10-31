package interface02;

// 인터페이스(Interface) : 객체의 사용 방법을 정의한 타입
// 인터페이스 선언 : [public] interface 인터페이스이름 { }
// 		변수 사용 불가, 상수랑 추상메소드만 사용 가능
//		객체로 생성할 수 없으므로 생성자 가실 수 없음
public interface RemoteControl {
	// 상수 : [public static final] 타입 상수이름 = 값;
	//		-> []을 생략하면 컴파일 할때 자동으로 인식해줌
	// 인스턴스 혹은 정적필드(final이 붙지 않은) 선언 x, 정적/상수필드만 선언 o
	public static final int MAX_VOLUME = 100;
	int MIN_VOLUME = 0; // [public static final]이 생략
	
	// 추상 메소드 : [public abstract] 리턴타입 메소드이름(매개변수, ...);
	public abstract void turnOn();
	void turnOff(); // [public abstract]이 생략
	
	void setVolume(int volume);
}
