package var01;

public class Ch02_Double {
	public static void main(String[] args) {
		// 기본 자료형 : 실수형(8byte)
		// 소수점 12자리까지 정확
		double dou1 = 12.345;
		double dou2 = 35.456;
		
		System.out.println(dou1 + ", " + dou2);
		
		
		/* 나누기(형)
		 	int / int = int
		 	double / double = double
		 	double / int = double
		 	int / double = double
		 */
		
		System.out.println(dou2 / dou1); // double / double = double
		System.out.println(10 / 3); // int / int = int (몫만)
		System.out.println(10 / 3.0); // int / double = double
		
		
		// / : 몫 , % : 나머지
		int num1 = 30;
		int num2 = 5;
		
		System.out.println(num1 + " / " + num2 + "의 몫 = " + (num1 / num2));
		System.out.println(num1 + " % " + num2 + "의 나머지 = " + (num1 % num2));
		
	}
}
