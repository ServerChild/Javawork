package op01;

public class Ch01_Assignment {
	public static void main(String[] args) {
		// 대입 연산자
		int num1 = 10;
		
		// 덧셈 : +=
		num1 += 10; // num1 = num1 + 10
		System.out.println("num1 + 10 = " + num1); 
		
		// 뺄셈 : -=
		num1 = 10;
		num1 -= 5; // num1 = num1 - 5
		System.out.println("num1 - 5 = " + num1);
		
		// 곱셈 : *=
		num1 = 10;
		num1 *= 3; // num1 = num1 * 3
		System.out.println("num1 * 3 = " + num1);
		
		// 나눗셈 : /=
		num1 = 10;
		num1 /= 3; // num1 = num1 / 3
		System.out.println("num1 / 3 = " + num1);
		
		// 나머지 : %=
		num1 = 10;
		num1 %= 3; // num1 = num1 % 3
		System.out.println("num1 % 3 = " + num1);
		
		// _ : 숫자 자리를 사람이 볼 때 편하게 하기 위해, 컴퓨터는 인식 x
		int num2 = 3_000_000; // = 100,000,000
		int num3 = 2_000;
		System.out.println((long)(num2 * num3));
	}
}
