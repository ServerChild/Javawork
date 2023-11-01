package op01;

public class Ch02_Increase {
	public static void main(String[] args) {
		// 증가, 감소 연산자
		
		// ++ : 하나(1) 증가
		int num1 = 10;
		num1++;
		System.out.println(num1);
		
		
		// -- : 하나(1) 감소
		num1 = 10;
		num1--; // 9
		num1--; // 8
		num1++; // 9
		System.out.println(num1);
		
		// 단항일 때는 연산자가 앞에 붙거나 뒤에 붙어도 결과는 똑같음
		++num1;
		--num1;
		
		
		// 연산 시에는 연산자가 붙은 위치에 결과가 따라 달라짐
		int num2 = 10; // 11
		int num3 = 10; // 11
		// 연산자가 앞에 붙으면 자신부터 증가 or 감소함
		int result = ++num2 + ++num3;
		System.out.println(result); // 22
		
		
		//연산자가 뒤에 붙으면 연산을 한 후에 자신을 증가 or 감소함
		num2 = 10; // -> 11(먼저 증가)
		num3 = 10; // -> 11(연산을 다 한 후 증가)
		result = ++num2 + num3++;
		System.out.println(result); // 21
		
		num2 = 10; // 9
		num3 = 10; // 11
		result = num2-- + ++num3; 
		System.out.println(result); // 21
		
		num2 = 10; // 11
		num3 = 10; // 9
		result = ++num2 + --num3; 
		System.out.println(result); // 20
		
		num2 = 10; // 9
		num3 = 10; // 9
		result = --num2 + num3--; 
		System.out.println(result); // 19
	}
}
