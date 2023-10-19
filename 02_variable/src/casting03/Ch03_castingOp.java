package casting03;

public class Ch03_castingOp {
	public static void main(String[] args) {
		// 연산식에서 자동타입 변환 : 크기가 큰 타입으로 자동 타입 변환
		// int 이하(byte, char, short, int)의 타입 연산(+, -, *, %) -> int 형으로 변환
		// 실수(double) 타입 연산 -> double 형으로 변환
		// float 타입 연산 -> float 형으로 변환
		byte b1 = 10;
		byte b2 = 20;
		
		// 강제 형변환을 해주거나, 변수의 타입을 더 큰 타입으로 바꿔줘야 함
		byte result = (byte)(b1 + b2);
		int result1 = b1 + b2;
		
		char c1 = 'A';
		char c2 = (char)(c1 + 1);
		int c3 = c1 + 1;
		
		System.out.println(c2); // B(char)
		System.out.println(c3); // 66(int)
		
		int in1 = 100;
		int in2 = 3;
		int result2 = in1 / in2;
		System.out.println(result2); // 33(int)
		
		int in3 = 100;
		double d3 = 3;
		double result3 = in3 / d3;
		int result4 = (int)(in3 / d3);
		System.out.println(result3); // 33.333333333333336
		System.out.println(result4); // 33
	}
}
