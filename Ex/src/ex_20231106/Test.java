package ex_20231106;

class A {
	int a1;
	int a2;
	
	A (int a1, int a2) {
		this.a1 = a1;
		this.a2 = a2;
	}
}

class B extends A {
	int b1;
	int b2;
	
	B(int a1, int a2, int b1, int b2) {
		super(a1, a2);
		this.b1 = b1;
		this.b2 = b2;
	}
}

public class Test {
	public static void main(String[] args) {
		B b = new B(1, 2, 3, 4);
	}
}
