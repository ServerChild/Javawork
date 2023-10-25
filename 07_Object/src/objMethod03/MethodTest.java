package objMethod03;

public class MethodTest {
	public static void main(String[] args) {
		Method m1 = new Method();
		
		// print1
		m1.print1();
		
		// print2
		int re = m1.print2();
		System.out.println(re);
		
		// print3
		System.out.println(m1.print3());
		
		// print4
		boolean re1 = m1.print4();
		System.out.println(re1);
		
		// print5
		m1.print5(5);
		
		// print6
		int re2 = m1.print6(5);
		System.out.println(re2);
		
		// print7
		String str = m1.print7(2);
		System.out.println(str);
		
		// print8
		System.out.println(m1.print8(5, 8));
		
		// print9
		m1.print9("Java", 100);
		
		// print10
		m1.print10(13.8, "Java", true, 2);
	}
}
