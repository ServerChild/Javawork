package meOverLoading08;

public class MethodTest {
	public static void main(String[] args) {
		MethodOp op = new MethodOp();
		
		// 더하기
		System.out.println("10 + 5 = " + op.add(10, 5));
		
		// 오버로딩 - 더하기
		op.add(89);
		
		// 오버로딩 - 더하기2, 더하기3
		// 둘 중에 하나라도 double 형이면 double 형으로 들어감
		op.add(89.56, 67);
		op.add(50, 68.8);
		
		
		// 빼기
		System.out.println("20 - 10 = " + op.sub(20, 10));
		
		// 오버로딩 - 빼기, 빼기2
		op.sub(30, 20.1);
		op.sub(100);
		
		
		// 곱하기
		System.out.println("3 * 7 = " + op.mul(3, 7));
		
		// 오버로딩 - 곱하기
		op.mul(1.5, 2);
		
		
		// 나누기(몫)
		System.out.printf("100 / 21 = " + "%.2f\n", op.div(100, 21));
		
		
		// 나누기(나머지)
		System.out.println("100 % 33 = " + op.rdiv(100, 33));
	}
}
