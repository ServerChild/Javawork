package objMethod03;

public class Method {
	// 반환형이 없는 메소드
	// 출력, 저장 안됨
	void print1() {
		System.out.println("반환값이 없고 매개변수가 없는 메소드");
	}
	
	
	// 반환형 : int
	// 반환형이 있는 메소드는 반드시 return 값이 있어야 함
	int print2() {
		System.out.println("반환형이 int형이고 매개변수가 없는 메소드");
		int result = 1;
		return result;
	}
	
	
	// 반환형 : String
	String print3() {
		System.out.println("반환형이 문자열이고 매개변수가 없는 메소드");
		return "반환하는 문자";
	}
	
	
	// 반환형 : boolean
	boolean print4() {
		System.out.println("반환형이 불리언이고 매개변수가 없는 메소드");
		return true;
	}
	
	
	// 반환형이 없고 매개변수가 있는 메소드
	void print5(int x) {
		System.out.println(x);
	}
	
	
	// 반환형 있고 매개변수도 있는 메소드
	int print6(int x) {
		int y = 10;
		return x + y;
	}
	
	String print7(int x) {
		int re = x * 5;
		// System.out.println(re); -> 출력 없으면 연산결과 안나옴
		return "* 연산함";
	}
	
	int print8(int x, int y) {
		int re = x + y;
		return re;
	}
	
	void print9(String str, int x) {
		System.out.println("입력한 문자열 : " + str);
		System.out.println("입력한 숫자 : " + x);
	}
	
	String print10(double d1, String str, boolean b1, int x) {
		System.out.println(str);
		System.out.println(b1);
		System.out.println(d1 * x);
		return "여러 매개변수 받기";
	}
}
