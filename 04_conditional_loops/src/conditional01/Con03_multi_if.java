package conditional01;

import java.util.Scanner;

public class Con03_multi_if {
	public static void main(String[] args) {
		// 다중 if 문 
		/* 
		 	형식 : if(조건식)
		 			{ 실행문 } 
		 		  else if(조건식)
		 		  	{ 실행문 }
		 		  else { 실행문 }
		*/
		// 사용자로부터 점수를 입력받아 학점 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		// 방법 1(최적화)
		if(score > 100 || score < 0) 
			System.out.println("점수가 잘못 입력되었습니다.");
		else if(score >= 90) 
			System.out.println("A 학점"); // 100 ~ 90
		else if(score >= 80) 
			System.out.println("B 학점"); // 89 ~ 80
		else if(score >= 70) 
			System.out.println("C 학점"); // 79 ~ 70
		else if(score >= 60) 
			System.out.println("D 학점"); // 69 ~ 60
		else
			System.out.println("F 학점"); // 59 ~ 0
		
		// 방법 2
		if(score > 100 || score < 0) 
			System.out.println("점수가 잘못 입력되었습니다.");
		else if(score <= 100 && score >= 90) 
			System.out.println("A학점"); // 100 ~ 90
		else if(score <= 89 && score >= 80) 
			System.out.println("B 학점"); // 89 ~ 80
		else if(score <= 79 && score >= 70) 
			System.out.println("C 학점"); // 79 ~ 70
		else if(score <= 69 && score >= 60) 
			System.out.println("D 학점"); // 69 ~ 60
		else
			System.out.println("F 학점"); // 59 ~ 0
		
		
		// 예시 4 : 연산자(+, -, *, /, %)와 숫자 2개를 입력받아 연산결과 출력
		System.out.print("연산자(+, -, *, /, %) : ");
		char op = sc.next().charAt(0);
				
		System.out.print("숫자1 : ");
		int num1 = sc.nextInt();
				
		System.out.print("숫자2 : ");
		int num2 = sc.nextInt();
				
		if(op == '+')
			System.out.println("숫자1 + 숫자2 = " + (num1 + num2));
		else if(op == '-')
			System.out.println("숫자1 - 숫자2 = " + (num1 - num2));
		else if(op == '*')
			System.out.println("숫자1 * 숫자2 = " + (num1 * num2));
		else if(op == '/')
			System.out.println("숫자1 / 숫자2 = " + ((double)num1 / num2));
		else if(op == '%')
			System.out.println("숫자1 % 숫자2 = " + (num1 % num2));
	}
}
