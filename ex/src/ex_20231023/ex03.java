// Q. 1 ~ 100 까지 숫자 맞추기 게임, 랜덤으로 1부터 100까지의 숫자 추출하고, 사용자로부터 숫자 입력받아 숫자 맞추기
// 랜덤보다 큰 숫자 입력 시 : 더 작은 숫자를 입력해보세요
// 랜덤보다 작은 숫자 입력 시 : 더 큰 숫자를 입력해보세요
// 맞추면 : 축하합니다 맞췄습니다 , 종료
package ex_20231023;

import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {
		// 1 ~ 100까지의 숫자 랜덤 추출
		int com = (int)(Math.random() * 100) + 1;
		
		// 사용자로부터 숫자 입력
		Scanner sc = new Scanner(System.in);
		int user = 0;
		
		do {
			System.out.print("숫자를 입력하세요 : ");
			user = sc.nextInt();
			
			// 사용자가 큰 숫자 입력 : 더 작은 숫자 입력하라
			if(user > com)
				System.out.println("더 작은 숫자를 입력하세요.");
			// 사용자가 작은 숫자 입력 : 더 큰 숫자 입력하라
			else if(user < com)
				System.out.println("더 큰 숫자를 입력하세요.");
		} while(user != com);
		
		// 맞추면 : 축하축하
		System.out.println("맞췄습니다. 축하합니다.");
	}
}
