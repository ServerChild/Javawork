package singleton13;

// - 싱글톤(Singleton) : 전체 프로그램에서 단 하나의 객체만 만들도록 보장하는 코딩 기법
//		-> 실행 클래스에서 객체를 만들지 못하도록 해야 함
//		-> 정적 필드에서 참조하는 자신의 객체 리턴(정적 필드 - 정적 메소드 사용)
//		-> new 키워드 사용 x
//		-> 외부에서 호출할 수 있는 getIstance() 선언
class Singleton {
	// 인스턴스 필드
	private Singleton signLeton1; // = new Singleton();
	
	// 정적 필드 : 객체 생성 x
	private static Singleton signLeton2;
	
	// 생성자에 private을 붙여 객체를 생성할 수 없게 만듬
	private Singleton() {}
	
	// 인스턴스 메소드 : 현재 메소드가 호출되었다는 것은 객체가 이미 생성되었다는 의미
	// 인스턴스 필드랑 정적 필드랑 다 사용 o
	Singleton getInstance1() {
		System.out.println(signLeton1);
		return signLeton2; 
	}
	
	// 정적 메소드 -> 정적 필드만 사용할 수 있음
	static Singleton getInstance2() {
		return signLeton2;
	}
}


public class SingletonTest01 {
	public static void main(String[] args) {
		// Singleton s1 = new Singleton(); -> 불가
		Singleton sing1 = Singleton.getInstance2();
		Singleton sing2 = Singleton.getInstance2();
		
		// 객체를 가리키고 있는 주소가 같은가?
		if(sing1 == sing2)
			System.out.println("같은 객체를 가리키고 있음");
		else
			System.out.println("다른 객체임");
	}
}
