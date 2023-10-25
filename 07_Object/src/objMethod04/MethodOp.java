package objMethod04;

public class MethodOp {
	// 5칙연산 메소드 만들기
	
	// 더하기
	int add(int x, int y) {
		return x + y;
	}
	
	// 빼기
	int sub(int x, int y) {
		return x - y;
	}
	// 곱하기
	int mul(int x, int y) {
		return x * y;
	}
	
	// 나누기(몫)
	double div(int x, int y) {
		return (double)x / y;
	}
	
	// 나누기(나머지)
	int rdiv(int x, int y) {
		return x % y;
	}
}
