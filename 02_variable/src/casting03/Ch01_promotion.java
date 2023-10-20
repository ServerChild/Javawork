package casting03;

public class Ch01_promotion {
	public static void main(String[] args) {
		// 타입 변환 : 값의 타입을 다른 타입으로 변환하는 것
		// 크기 순서(byte) : byte(1) < short(2) < char < int(4) < long(8) < float(4) < double(8)
		// 자동(묵시적) 타입 변환 : 작은 타입을 큰 타입으로 자동 변환 - Promotion
		// 자동 형변환
		byte b1 = 20;
		short s1 = b1;
		
		int in1 = b1; // byte -> int
		in1 = s1; // short -> int
		System.out.println(in1); 
		
		double d1 = in1; // int -> double
		System.out.println(d1);
		
		char c1 = 'A';
		int inCh = c1; // char -> int
		System.out.println("영문 A의 유니코드는 " + inCh); // 유니코드 숫자가 나옴, A(65)
		
		char c2 = '허';
		int inCh1 = c2; // char -> int
		System.out.println("한글 '허'의 유니코드는 " + inCh1); // 유니코드 숫자가 나옴
	}
}
