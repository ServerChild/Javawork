// Q. 정수 두 개를 입력받아, 두 정수 중에 작은 값을 시작 값으로 큰 값을 종료 값으로 사용하여, 작은 값에서 큰 값까지 정수 합계 구하기
package ex_20231020;

import java.util.Scanner;

public class ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정수 두 개를 입력
		System.out.print("정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		// 입력받은 두 정수 중에 큰 값과 작은 값을 구분
		// 작은 값을 시작으로 큰 값까지 1씩 증가하여
		// 작은 값부터 큰 값까지의 합계 구함
		if(num1 < num2) {
			for(int i = num1; i <= num2;i++) {
				System.out.println("?");
			}
		}
	}
}
