package loops02;

import java.util.Scanner;

public class Lop03_while {
	public static void main(String[] args) {
		// while 문 : 조건식에 따라 반복 여부 결정(무한 반복 주의)
		/*
		 	형식 : while(조건식) {
		 				참일 때 실행문;
		 				
		 				거짓일 때 빠져나오게 하는 실행문;
		 			}
		 */
		// for 문을 while 문으로 고칠 수 있음
		// 예시 1
		int flag = 1; // 초기값
		
		while(flag <= 5) { // 조건문
			System.out.println("flag의 값은 " + flag);
			flag ++; // 증감식
		}
		System.out.println();
		
		// 예시 2
		int sum = 0; // 초기값
		int i = 0; // 초기값
		
		while(i <= 100) { // 조건문
			sum += i; // 실행문
			++i; // 증감식
		}
		
		System.out.println("1부터 100까지의 합 : " + sum);
		System.out.println();
		
		// 예시 3 : 1 ~ 하나씩 증가하면서 합계
		// 그 합이 100 이상이 되는 순간 while문 빠져나옴
		// 합과 어디까지 더했을 때 100이 되었는지 그 숫자 출력
		// 출력 : 1 ~ 34 까지 더한 합 = 102 
		int sum1 = 0;
		int i1 = 0;
		
		while(sum1 <= 100) {
			//sum1 += ++i1;
			++i1; // = i1++ (똑같은 결과)
			sum1 += i1;
		}
		
		System.out.println("1 ~ " + i1 + " 까지 더한 합 = " + sum1);
		System.out.println();
		
		// break : 반복문(for, while, do-while)을 빠져나온다
		int count = 0;
		
		while(true) {
			System.out.println(count++);
			
			if(count == 3)
				break;
		}
		System.out.println();
		
		// 예시 1
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("멈추려면 'q' : ");
			char ch = sc.next().charAt(0);
			
			if(ch == 'q')
				break;
		}
		System.out.println("end");
		System.out.println();
		
		while(true) {
			System.out.print("연산할 숫자와 연산자 입력 (ex> + 4 5) : ");
			char op = sc.next().charAt(0); // 연산자
			int num1 = sc.nextInt(); // 연산 숫자 1
			int num2 = sc.nextInt(); // 연산 숫자 2
			
			if(op == '@')
				break;
			
			// 자동 형변환으로 인해 num 과 op 사이에 ""(공백) 추가
			System.out.println(num1 + "" + op + num2 + "=" + (num1 + num2));
			// System.out.printf("%d %s %d = %d\n", num1, op, num2, num1 + num2);
		}
		System.out.println("end");
	}
}
