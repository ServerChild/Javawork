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
			System.out.println("1.학생수  2.점수입력  3.점수리스트  4.분석  5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {
				System.out.print("학생 수 > ");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
			}
			else if(selectNo == 2) {
				for(int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "] >");
					scores[i] = sc.nextInt();
				}
			}
			else if(selectNo == 3) {
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] >" + scores[i]);
				}
			}
			else if(selectNo == 4) {
				int max = 0, sum = 0;
				
				for(int i = 0; i < scores.length; i++) {
					max = scores[i];
					
					/*
					 // 최고 점수 : if 문
					if(max < scores[i])
						max = scores[i];
					*/
					
					// 최고 점수 : 삼항연산자 표현
					max = max < scores[i] ? scores[i] :max;
					
					sum += scores[i];
				}
				System.out.println("최고 점수 : " + max);
				System.out.printf("펑균 점수 : %.2f", (double)sum / scores.length);
			}
			else if(selectNo == 5) {
				System.out.println("종료");
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}
}
