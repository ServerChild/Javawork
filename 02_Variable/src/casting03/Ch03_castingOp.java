package casting03;

public class Ch03_castingOp {
	public static void main(String[] args) {
		// 크기 순서(byte) : byte(1) < short(2) < char < int(4) < long(8) < float(4) < double(8)
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
		
		System.out.println(c2); // 문자(char) 'B'
		System.out.println(c3); // 유니코드(int) 66
		
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
		
		int in4 = 100;
		int in5 = 3;
		double re = in4 / in5; // 33.0 -> int형으로 계산된 결과를 double형으로 바꿨기 때문에
		double re1 = (double)in4 / in5; // 33.333333333333336 -> 강제 형변환을 해줘야지 소수점 이하 자리까지 나옴
		System.out.println(re);
		System.out.println(re1);
	}
}
