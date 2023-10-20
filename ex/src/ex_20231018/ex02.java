// Q. 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기 한 몫을 출력
package ex_20231018;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
	}
}
