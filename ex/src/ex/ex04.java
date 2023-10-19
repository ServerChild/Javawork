// Q. 영어 문자열 값을 키보드로 입력받아 앞에 세 개를 출력
package ex;

import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영어단어를 입력하세요 : ");
		
		String str = sc.next();
		
		char str1 = str.charAt(0);
		char str2 = str.charAt(1);
		char str3 = str.charAt(2);
		
		System.out.println("첫 번째 문자 : " + str1);
		System.out.println("두 번째 문자 : " + str2);
		System.out.println("세 번째 문자 : " + str3);
		
	}
}
