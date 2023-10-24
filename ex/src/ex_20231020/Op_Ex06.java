// Q. 나이를 키보드로 입력 받아, 13세 이하면 "어린이"를 출력, 13세초과 ~ 19세 이하이면 "청소년" 출력, 19세초과이면 "성인" 출력
package ex_20231020;

import java.util.Scanner;

public class Op_Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 나이 입력
		System.out.println("나이 입력하세요 : ");
		int age = sc.nextInt();
		
		// 13세 이하(age <= 13) = "어린이", 13세 초과 ~ 19세 이하(13 < age <= 19) = "청소년", 19세 초과(age > 19) = "성인"
		String re1 = age <= 13 ? "어린이" : age <= 19 ? "청소년" : age > 19 ? "성인" : " ";
		
		System.out.println(re1);
	}
}
