package op01;

public class Ch04_Logical {
	public static void main(String[] args) {
		// 논리합과 논리곱
		/*  0(거짓) 1(참)
		 * 	x	y	논리합(&&)	논리곱(||)
		 *  0	0	   0		   0
		 * 	0	1	   0		   1
		 * 	1	0	   0		   1
		 * 	1	1	   1		   1
		 */
		
		int num1 = 10;
		int num2 = 20;
		
		// && : 둘 다 참(true)이여야만 참(true)
		boolean re1 = num1 > num2 && num1 < num2;
		System.out.println(re1); // false
		
		// || : 하나라도 참(true)면 참(true)
		boolean re2 = num1 > num2 || num1 < num2;
		System.out.println(re2); //true
		
		System.out.println("--------");
		
		// !(not) : 참(true)이면 거짓(false), 거짓(false)이면 참(true)
		boolean b1 = num1 >= num2; 
		System.out.println(!b1); // false
		System.out.println(!!b1); // true
		
		System.out.println("--------");
		
		// A ~ Z : 65 ~ 90, a ~ z : 97 ~ 122
		char ch1 = 'A';
		System.out.println("ch1 : " + ch1);
		System.out.println("ch1은 소문자인가? " + (ch1 >= 'a' && ch1 <= 'z'));
		System.out.println("ch1은 대문자인가? " + (ch1 >= 'A' && ch1 <= 'Z'));
	}
}
