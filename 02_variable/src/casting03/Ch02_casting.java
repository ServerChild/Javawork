package casting03;

public class Ch02_casting {
	public static void main(String[] args) {
		// 강제(명시적) 타입 변환 : 큰 타입을 작은 타입 단위로 변환 - Casting
		// 형식 : (변환하고자 하는 타입)변수명
		// 강제 형변환
		int num1 = 12345;
		byte b1 = (byte)num1; // int -> byte
		System.out.println(b1);
		
		double d1 = 26.9988;
		num1 = (int)d1; // double -> int
		System.out.println(num1);
	}
}
