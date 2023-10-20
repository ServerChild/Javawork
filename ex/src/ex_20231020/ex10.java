// Q. 정수를 입력 받아, 그 수가 양수일 때만 입력된 수를 줄 수로 적용하여 출력
package ex_20231020;

import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			for(int i = num; i <= num; i++) {
				System.out.println("?");
			}
		} else
			System.out.println("양수가 아닙니다.");
	}
}
