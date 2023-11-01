package inSuper03;

class Parent2 {
	int x = 10;
	
	// 오버라이딩
	void display() {
		System.out.println("부모클래스의 display() 메소드");
	}
}


class Child2 extends Parent2 {
	int x = 20;
	
	void display() {
		System.out.println("자식클래스의 display() 메소드");
	}
	
	void method() {
		// 내가 가지고 있는 메소드 호출
		display();
		
		// 부모가 가지고 있는 display() 메소드 호출 
		super.display();
		
		System.out.println("Child2 클래스의 x = " + this.x);
		System.out.println("Parent2 클래스의 x = " + super.x);
	}
}


public class SuperTest02 {
	public static void main(String[] args) {
		Child2 ch2 = new Child2();
		
		ch2.method();
		ch2.display();
	}
}
