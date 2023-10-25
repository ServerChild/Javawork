// 실행용 클래스2
package odj01;

class B {
	int b1 = 10;
}

// 두개의 클래스가 있을때는 하나의 클래스에만 접근제어자(public)를 붙일 수 있음
public class Main2Test {
	public static void main(String[] args) {
		// 같은 패키지 안에 있으면 클래스 객체로 생성 가능
		B bb = new B();
		A aa = new A();
	}
}
