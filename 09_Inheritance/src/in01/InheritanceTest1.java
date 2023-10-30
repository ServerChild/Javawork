package in01;

// 상속 : 이미 개발된 클래스를 재사용하여 새로운 클래스를 만들기에 중복되는 코드를 줄임 
// extend 키워드 사용, 상속은 한개만 가능
class A {
	int a = 1;
}

class B extends A {
	int b = 2;
}

class C extends B {
	int c = 3;
}

public class InheritanceTest1 {
	public static void main(String[] args) {
		C objC = new C();
		System.out.println("C클래스 객체에서 a 속성 값 : " + objC.a);
		System.out.println("C클래스 객체에서 b 속성 값 : " + objC.b);
		System.out.println("C클래스 객체에서 c 속성 값 : " + objC.c);
		
		B objB = new B();
		System.out.println("B클래스 객체에서 a 속성 값 : " + objB.a);
		System.out.println("B클래스 객체에서 b 속성 값 : " + objB.b);
		// System.out.println("B클래스 객체에서 c 속성 값 : " + objB.c); -> 사용 x
		
		A objA = new A();
		System.out.println("A클래스 객체에서 a 속성 값 : " + objA.a);
		// System.out.println("A클래스 객체에서 b 속성 값 : " + objA.b); -> 사용 x
		// System.out.println("A클래스 객체에서 c 속성 값 : " + objA.c); -> 사용 x
	}
}
