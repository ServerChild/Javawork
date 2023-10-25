// Q. 키보드로부터 학생 수와 각 학생들 점수를 입력받아, 최고 점수 및 평균 점수를 구하여 출력
package ex_20231024;

import java.util.Scanner;

public class Array_Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {
				// 작성
			}
			else if(selectNo == 2) {
				//작성
			}
			else if(selectNo == 3) {
				//작성
			}
			else if(selectNo == 4) {
				//작성
			}
			else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}
}
