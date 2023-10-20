// Q. 정수를 입력받아, 그 정수가 음수이면 "음수"를 출력, 음수가 아닌 경우 중 0이면 "0이다"를 출력, 0이 아니면 "양수"를 출력
package ex_20231020;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		String re = num < 0 ? "음수" : num == 0 ? "0 이다" : "양수";
		
		System.out.println("입력한 정수는 " + re);
	}
}
