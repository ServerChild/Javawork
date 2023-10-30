package inSuper03;

class Parent {
	int x = 10;
}

class Child extends Parent {
	int x = 20;
	
	void method() {
		int x = 30;
		
		// 지역변수
		System.out.println("x= " + x);
		
		// this : 객체를 생성한 나 자신
		System.out.println("this.x = " + this.x);
		
		// super : 상속받은 부모를 의미
		System.out.println("super.x = " + super.x);
	}
}

public class SuperTest01 {
	public static void main(String[] args) {
		Child ch = new Child();
		
		ch.method();
	}
}
