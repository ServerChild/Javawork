// Q. 사용자로부터 숫자, 양수를 입력받아 1 ~ 입력받은 숫자까지 합계 구하기
package ex_20231023;

import java.util.Scanner;

public class If_Eles_Ex02 {
	public static void main(String[] args) {
		// 사용자 입력 받음
		Scanner sc = new Scanner(System.in);
		
		//숫자, 양수를 입력받음
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		// 합계 변수 선언
		int sum = 0;
		
		if(num >= 1) {
			for(int i = 1; i <= num; i++) {
				sum += i;
			}
			System.out.printf("1 ~ %d 까지의 합 = %d", num, sum);
		}
		else System.out.println("양수를 입력하세요.");
	}
}
