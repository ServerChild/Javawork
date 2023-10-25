package loops02;

import java.util.Scanner;

public class Lop04_Do_While {
	public static void main(String[] args) {
		// do-while 문 : 블록 내부 실행문을 우선 실행하고 그 결과에 따라 반복 실행 여부 결정(무한 반복 주의)
		/*
		 	- 조건을 나중에 확인하므로 무조건 조건과 상관없이 1번은 반드시 실행
		 	
		  	형식 : do {
		  			실행문;
		  		} while(조건식);
		 */
		boolean b1 = false;
		
		while(b1) { 
			System.out.println("while 조건식"); 
		}
		
		do {
			System.out.println("do-while 조건식");
		} while(b1);
		
		// 예시 1
		Scanner sc = new Scanner(System.in);
		
		int num = 0; // 전역 변수
		
		do {	
			System.out.println("1. for문 설명, 2. while문 설명, 3. do-while문 설명, 끝내려면 0 입력");
			num = sc.nextInt(); // 지역 변수
			
			switch(num) {
				case 1:
					System.out.println("조건이 정해져 있을 때 사용하면 좋음\n");
					break;
				case 2:
					System.out.println("특정 조건에 도달했을 때 break 사용하여 종료할 때 사용\n");
					break;
				case 3:
					System.out.println("조건을 나중에 따지므로 무조건 1번은 실행됨\n");
			}
		} while(num != 0);
		System.out.println("end");
	}
}
