package op01;

import java.util.Scanner;

public class Ch05_threeOp {
	public static void main(String[] args) {
		// 삼항 연산자 : 조건식 ? 조건이 참 일때 실행 : 조건이 거짓일 때 실행
		int num1 = 10;
		int num2 = 7;
		
		// 문자열
		String re = num1 > num2 ? "num1의 숫자가 더 크다" : "num1의 숫자가 더 작다";
		System.out.println(re);
		
		// 문자
		char re1 = num1 > num2 ? '대' : '소';
		System.out.println(re1);
		
		// 숫자
		int num3 = -8;
		int re2 = num3 < 0 ? -num3 : num3;
		System.out.println(re2);
		
		System.out.println("--------------------");
		
		// 점수 입력받아 결과 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		String re3 = score >= 80 ? "합격" : "불합격";
		
		System.out.println("결과 : " + re3);
		
		// 100 ~ 90 : A, 89 ~ 80 : B, 79 ~ 70 : C, 69 ~ 60 : D, 59 ~ : F
		String grade = score > 100 ? "입력할 수 있는 점수를 초과했습니다." :
					   score >= 90 ? "A 학점" : 
					   score >= 80 ? "B 학점" : 
					   score >= 70 ? "C 학점" : 
					   score >= 60 ? "D 학점" : 
					   score >= 0 ? "F 학점" : "입력할 수 있는 점수가 아닙니다.";
		
		System.out.println("학점 등급 : " + grade);
	}
}
