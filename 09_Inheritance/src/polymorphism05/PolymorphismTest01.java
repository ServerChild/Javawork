package polymorphism05;

class A { 
	int a = 10;
}

class B extends A {
	int b = 20;
}

class C extends A { 
	int c = 30;
}

class D extends C {
	int b = 40;
}

class E extends B {
	int e = 50;
}


public class PolymorphismTest01 {
	public static void main(String[] args) {
		// 다형성 : 사용 방법은 동일하지만 다양한 객체 활용해 여러 실행결과가 나오게 하는 성질
		//		-> 메소드 재정의와 타입 변환으로 구현
		
		// 자동 타입 변환(Promotion) : 실행 중 자동으로 타입 변환
		//  	-> 부모타입 변수 = 자식 타입; // 자식타입을 부모타입으로 형변환
		//  	-> 두 클래스 사이에 아무런 상관이 없으면 타입 변환 불가
		
		// 예시 1
		B b1 = new B();
		A a1 = b1; // A클래스로 형변환 : A클래스의 인스턴스 멤버만 사용가능
		a1.a = 100;
		// a1.b = 200; -> 필드를 찾을 수 없음(A 클래스에 있는 것만 사용할 수 있고 B 클래스에 있는 건 사용 x)
		System.out.println(a1.a);
		
		
		// 예시 2
		C c1 = new C();
		a1 = c1; // C클래스(자식)를 A클래스(부모)로 형변환
		System.out.println(a1.a);
		
		
		// 예시 3
		D d1 = new D();
		C c2 = d1; // D타입을 C타입으로 형변환(D 사용 x, A / C 사용 o)
		
		c2.c = 300;
		c2.a = 2000;
		
		A a2 = d1; // D타입을 A타입으로 형병환(C / D 사용 x, A 사용 o)
		a2.a = 10000;
		// a2.c = 43; -> C 클래스 사용 불가
		
		
		// 예시 4
		E e1 = new E();
		A a3 = e1; // A클래스의 멤버만 사용가능
		B b3 = e1; // B클래스와 A클래스의 멤버 사용가능
	}
}
