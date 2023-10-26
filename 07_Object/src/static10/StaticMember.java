// 라이브러리용
package static10;

public class StaticMember {
	// 인스턴스 멤버 : 객체마다 가지고 있는 멤버
		// 객체를 생성한 후 사용할 수 있는 필드와 메소드
		// 인스턴스 필드(속성) : 힙 영역의 객체마다 가지고 있음, 객체마다 다른 데이터 저장 
		// 인스턴스 메소드 : 객체가 있어야 호출 가능한 메소드
	
	// 정적(Static) 멤버 : 객체와 상관없는 멤버, 클래스 코드(메소드 영역)에 위치
		// 클래스에 고정되어 객체 생성하지 않고 사용할 수 있는 필드와 메소드
		// 정적 필드 : static 타입 필드 [=초기값];
		// 정적 메소드 : static 리턴타입 메소드(매개변수 선언, ...) { }
	
	// 인스턴스 필드
	int num = 1;
	String name = "홍길동";
	
	// 정적 필드
	static int sNum = 2;
	static String sName = "아무개";
	
	// 인스턴스 메소드(반드시 객체를 생성해야 사용 o)
	// new 를 사용해 객체를 생성해야 저장공간이 생김
	// 인스턴스 멤버, 정적 멤베 모두 호출 가능
	void Me1() {
		System.out.println("인스턴스 메소드 Me1()");
	}
	
	String Me2() {
		System.out.println("인스턴스 메소드 Me2()");
		return "Me2()";
	}
	
	// 정적 메소드(객체를 생성 or 생성하지 않고 사용 o)
	// 클래스 내부에 저장공간이 생김
	// 정적 메소드와 필드만 호출가능
	static void sMe1() {
		System.out.println("정적 메소드 sMe1()");
	}
	
	static int sMe2() {
		System.out.println("정적 메소드 sMe2()");
		return 0;
	}
}
