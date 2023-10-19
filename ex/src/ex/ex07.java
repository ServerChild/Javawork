// Q. 선언 및 초기화된 5개의 변수를 가지고 알맞은 사칙연산(+, -, *, /)과 형변환을 이용하여 주석에 적힌 값과 같은 값이 나오도록 코드를 작성
package ex;

public class ex07 {
	public static void main(String[] args) {
		// 변수 선언
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1 / iNum2); // iNum1 iNum2 -> 2
		System.out.println((int)dNum); // dNum -> 2
		
		System.out.println(iNum2 * dNum); // iNum2 dNum -> 10.0
		System.out.println((double)iNum1); //iNum1 -> 10.0
		
		System.out.println((float)iNum1 / iNum2); // iNum1 iNum2 -> 2.5
		System.out.println(dNum); // dNum -> 2.5
		
		System.out.println((int)fNum); // fNum -> 3
		System.out.println(iNum1 / (int)fNum); // iNum1 fNum -> 3
		
		System.out.println(iNum1 / fNum); // iNum1 fNum -> 3.3333333
		System.out.println((double)iNum1 / fNum); // iNum1 fNum -> 3.3333333333333335
		
		System.out.println(ch); // ch -> 'A'
		System.out.println((int)ch); // ch -> 65
		System.out.println((int)ch + iNum1); // ch iNum1 -> 75 , (ch + iNum1) -> 자동 형변환
		System.out.println((char)(ch + iNum1)); // ch iNum1 -> 'K'
	}
}
