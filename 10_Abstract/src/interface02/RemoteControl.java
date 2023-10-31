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
	
	
	// default 메소드 : 실행문을 넣을 수 있음(Jdk 1.8버전부터 추가)
	// 재정의 하지 않으면 아래 메소드 실행, 재정의하면 재정의한 메소드 호출
	default void setMute(boolean mute) {
		System.out.println("나중에 추가된 메소드입니다.");
		
		if(mute)
			System.out.println("무음 완료");
		else
			System.out.println("무음 해제");
	}
	
	
	// static 메소드 : 실행문을 넣을 수 있음(Jdk 1.8버전부터 추가)
	static void information() {
		System.out.println("static() 메소드 호출 가능");
	}
}
