package meOverLoading08;

public class MethodOp {
	// 5칙연산 메소드 만들기
	// 메소드 오버로딩(Overloading) : 같은 이름의 메소드를 여러 개 선언
	// 매개값을 다양하게 받아 처리할 수 있도록 하기 위함
	// 리턴타입(상관없음), 메소드이름(동일), 매개 변수의 타입/개수/순서(중 하나가 달라야 함)

	int j = 10;

	
	// 더하기
	int add(int x, int y) {
		return x + y;
	}

	// 오버로딩 - 더하기
	void add(int x) {
		System.out.println(x + " + 10 = " + (x + 10));
		System.out.println(x + " + " + j + " = " + (x + j));
	}

	// 오버로딩 - 더하기2
	void add(double x, double y) {
		System.out.println("double, double");
		System.out.println(x + " + " + y + " = " + (x + y));
	}

	// 오버로딩 - 더하기3
	void add(int x, double y) {
		System.out.println("int, double");
		System.out.println(x + " + " + y + " = " + (x + y));
	}

	
	// 빼기
	int sub(int x, int y) {
		return x - y;
	}
	
	// 오버로딩 - 빼기
	void sub(int x, double y) {
		System.out.println(x + " - " + y + " = " + (x - y));
	}
	
	// 오버로딩 - 빼기2
	void sub(int x) {
		System.out.println(x + " - 10 = " + (x - 10));
	}

	
	// 곱하기
	int mul(int x, int y) {
		return x * y;
	}
	
	// 오버로딩 - 곱하기
	void mul(double x, double y) {
		System.out.println(x + " * " + y + " = " + (x * y));
	}

	
	// 나누기(몫)
	double div(int x, int y) {
		return (double) x / y;
	}

	
	// 나누기(나머지)
	int rdiv(int x, int y) {
		return x % y;
	}
}
