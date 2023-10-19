package op01;

public class Ch01_assignment {
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
	}
}
