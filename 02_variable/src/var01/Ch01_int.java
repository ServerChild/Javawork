package var01;

public class Ch01_int {
	public static void main(String[] args) {
		/*
		  	- 변수(Variable) : 하나의 값을 저장하기 위한 공간
		  	- 상수(constant) : 한 번만 값을 저장할 수 있는 공간
			- 리터럴(literal) : 그 자체로 값을 의미하는 것
		 */
		// 정수형
		int num1;
		
		num1 = 10;
		System.out.println(num1);
		
		num1 = 30; // 덮어쓰워짐
		System.out.println(num1);
		
		int num2 = 100;
		System.out.println(num2);
		System.out.println(num1); // 30
		
		// 연산
		System.out.println("----------------------");
		System.out.println("30 + 100 = " + (num1 + num2));
		System.out.println("100 - 30 = " + (num2 - num1));
		System.out.println("30 * 100 = " + num1 * num2);
		System.out.println("100 / 30 = " + num2 / num1);
		
		System.out.println("----------------------");
		
		int result = num1 + num2;
		System.out.println("num1 + num2 = " + result);
		
		int result2 = result * 20;
		System.out.println("result * 20 = " + result2);
		
		int result3 = result2 + 100;
		System.out.println("result2 + 100 = " + result3);
		
		int result4 = result3 * 10;
		System.out.println("result3 * 10 = " + result4);
	}
}
