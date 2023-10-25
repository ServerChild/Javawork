package objMethod04;

public class MethodTest {
	public static void main(String[] args) {
		MethodOp op = new MethodOp();
		
		// 더하기
		System.out.println("10 + 5 = " + op.add(10, 5));
		
		// 빼기
		System.out.println("20 - 10 = " + op.sub(20, 10));
		
		// 곱하기
		System.out.println("3 * 7 = " + op.mul(3, 7));
		
		// 나누기(몫)
		System.out.printf("100 / 21 = " + "%.2f\n", op.div(100, 21));
		
		// 나누기(나머지)
		System.out.println("100 % 33 = " + op.rdiv(100, 33));
	}
}
