// Q. 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력, 만일 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"를 출력
package ex_20231023;

import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		//String str = ""; (주석 = 방법 1)
		
		if(num1 >= 1 && num2 >= 1) {
			if(num1 > num2) {
				for(int i = num2; i <= num1; i++) {
					//str += i; (방법 1)
					System.out.print(i + ", ");
				}
			}
			else if(num1 < num2) {
				for(int i = num1; i <= num2; i++) {
					//str += i; (방법 1)
					System.out.print(i + ", ");
				}
			}
			//System.out.println(str); (방법 1)
		}
		else if(num1 < 1 || num2 < 1)
			System.out.println("1 이상의 숫자를 입력해주세요.");
	}
}

/*
 // num1은 작은수 num2 큰수 넣을 때(자리바꿈)
 	 if(num1 > num2) {
 	 	int tmp = num1;
 	 	num1 = num2;
 	 	num2 = tmp;
 	 }
 	 
 	 for(int i = num1;i <= num2; i++) {
 	 	System.out.print(i + ", ")
 	 }
 	 
*/ 
