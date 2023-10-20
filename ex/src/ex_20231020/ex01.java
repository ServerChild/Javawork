// Q. 정수를 입력받아, 그 정수가 음수이면 "음수"를 출력, 음수가 아니면 "음수가 아니다"를 출력
package ex_20231020;

import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		String re = num < 0 ? "음수" : "음수가 아니다";
		
		System.out.println("입력한 정수는 " + re);
	}
}
