package conditional01;

import java.util.Scanner;

public class Con02_IfElse {
	public static void main(String[] args) {
		//if else 문
		/*
		   형식 : if(조건문) {
		   			 참일 때 실행문; 
		   		  } else { 거짓일 때 실행문; }
		 */
		
		// 예시 1 : 점수에 따라 합격, 불합격 구분
		int score = 89;
		
		if(score >= 70) {
			System.out.println("합격");
			System.out.println("축하합니다.");
		} 
		else {
			System.out.println("불합격");
			System.out.println("다음 기회에");
		}
		System.out.println();
		
		
		// 예시 2 : 양수, 음수 구분
		int num = 100;
		
		if(num >= 0) {
			System.out.println("양수입니다.");
		} 
		else {
			System.out.println("음수입니다.");
		}
		System.out.println();
		
		
		// 예시 3 : 짝수, 홀수 구분
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int number = sc.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("짝수입니다.");
		} 
		else { System.out.println("홀수입니다."); }
		
	}
}
