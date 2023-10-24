// Q. 키보드로 문자 하나를 입력 받아 그 문자의 유니코드를 출력
package ex_20231019;

import java.util.Scanner;

public class Variable_Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 하나를 입력하세요 : ");
		
		char c1 = sc.next().charAt(0);
		
		System.out.println(c1 + "의 유니코드는 " + (int)c1);
	}
}