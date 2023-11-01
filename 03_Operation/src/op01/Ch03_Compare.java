package op01;

public class Ch03_Compare {
	public static void main(String[] args) {
		// 비교 연산자 : >(크다), <(작다), ==(같음), !=(같지 않음)
		int num1 = 10;
		int num2 = 50;
		
		boolean re1 = num1 == num2; 
		System.out.println("num1과 num2의 값이 같은가? " + re1); // false
		
		
		// == : 같다
		System.out.println("num1과 num2의 값이 같은가? " + (num1 == num2));
		
		
		// != : 같지 않다
		System.out.println("num1과 num2의 값이 같지 않은가? " + (num1 != num2));
	}
}
