// Q. 정수를 입력 받아, 그 정수가 짝수이면 "짝수"를 출력, 짝수가 아니면 "홀수"를 출력
package ex_20231020;

import java.util.Scanner;

public class Op_Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		String re = num % 2 == 0 ? "짝수" : "홀수";
		
		System.out.println("입력한 정수는 " + re);
	}
}
