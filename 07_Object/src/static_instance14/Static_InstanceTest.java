package static_instance14;

//static 과 instance 의 차이
class Stin {
	// 인스턴스 멤버 : 반드시 객체가 생성되야만 사용 o
	//		-> 객체가 생성될 때 객체에 저장공간 마련 
	// 인스턴스멤버와 정적멤버 모두 사용가능(= 클래스가 올라왔고 객체가 만들어졌다)
	int inNum = 10; 
	
	int plus(int x) {
		return inNum + x;
	}
	
	// 정적 멤버 : 객체 생성 없이 사용 o
	//		-> 클래스가 올라올 때 클래스에 저장공간 마련
	// 인스턴스 멤버 사용 불가 : 이유는 객체가 만들어졌다는 보장이 없기 때문에
	static int sNum = 30;
	
	static int plus() {
		// int re = inNum + 10; -> inNum 을 사용하려면 반드시 객체가 만들어져야만 사용 가능
		return sNum + 10;
	}
}

public class Static_InstanceTest {
	public static void main(String[] args) {
		// 정적 멤버 호출
		System.out.println(Stin.sNum);
		System.out.println(Stin.plus());
		
		// 인스턴스 멤버 호출 : 객체를 생성하지 않으면 저장공간이 없음
		Stin st = new Stin();
		
		System.out.println(st.inNum);
	}
}
