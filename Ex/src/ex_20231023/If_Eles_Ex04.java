// Q. 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력(단, 입력한 수는 1보다 크거나 같아야 함)
package ex_20231023;

import java.util.Scanner;

public class If_Eles_Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 사용자로부터 한 개의 값 입력 받음
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		//String str = "";(주석 : 방법 1) 
		
		// 입력한 수가 1보다 크면 그 숫자까지 모든 숫자를 거꾸로 출력
		if(num >= 1) {
			for(int i = num; i >= 1;i--)
				//str += i; (방법 1)
				//System.out.println(str); (방법 1)
				System.out.print(i + " ");
			} 
		else System.out.println("1 이상의 숫자를 입력해주세요.");
	}
}
