// Q. 주민번호 입력(123456-1234567)받아 출력(ex. 123456-1******)
package ex_20231102.string_Ex02;

import java.util.Scanner;

public class SubstringEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		String str = sc.next();
		
		// substring() 사용
		String st1 = str.substring(0, 8) + "******";
		
		System.out.println(st1); // 출력만
		System.out.println(str.substring(0, 8) + "******"); // 출력 및 저장
	}
}
