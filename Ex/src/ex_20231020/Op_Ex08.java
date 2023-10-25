// Q. 주민번호를 입력받아, 남자인지 여자인지 출력
package ex_20231020;

import java.util.Scanner;

public class Op_Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 주민번호 입력
		System.out.println("주민번호를 입력하세요(- 포함) : ");
		String num = sc.next();
		
		//남자인지 여자인지
		String re = num.charAt(7) == 1 ? "남자" : "여자";
		
		System.out.println(re);
	}
}
