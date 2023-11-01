package in01;

class D {
	int x;
	static int sx;
}


// 부모보다 자식이 우선순위가 더 높음
class E extends D {
	String x;
	static String sx;
}


public class InheritanceTest3 {
	public static void main(String[] args) {
		E e = new E();
		e.x = "혼자 공부하는 자바";
		// 우선 객체가 생성된 필드부터 보고 있으면 그 필드를 사용
		// 만약 객체가 생성된 필드명이 없으면 상속받은 부모 필드를 봄
		// e.x = 1234;
		
		System.out.println(e.x);
		
		
		D d = new D();
		d.x = 9;
	
		System.out.println(d.x);
		
		
		E.sx = "마이바티스";
		D.sx = 123;
	}
}
