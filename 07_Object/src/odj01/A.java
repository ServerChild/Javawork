// 라이브러리 클래스 or API 클래스 : 객체 생성 및 메소드 제공 역할
	// => main() 메소드가 없음, 단독 실행 x
package odj01;

public class A {
	// 객체(Object) : 속성을 가지며 식별 가능한것 -> 속성(필드(field) + 메소드(method))로 구성
	// 속성 or 필드
	int var1; // 초기값 : 0
	String name; // 초기값 : null
	boolean b1 = true; // 초기값 : false
	
	
	// 메소드 정의
	public void Method1() {
		System.out.println("Method1 호출");
	}
}


/* 클래스(Class) :  자바의 설계도
	- 인스턴스(instance) : 클래스로부터 만들어진 객체
	- 객체 지향 프로그래밍 단계 : 클래스 설계 - 사용할 객체 생성 - 객체 이용
	- 멤버
		-> 필드(Field) : 객체의 데이터가 저장되는 곳(변수) = 속성
		-> 생성자(Constructor) : 객체 생성 시 초기화 역할
		-> 메소드(method) : 객체의 동작(기능)에 해당하는 실행 블록 = 함수
			=> 메소드 선언부 : 리턴 타입, 메소드 이름, 매개변수 선언, 메소드 실행 블록
*/