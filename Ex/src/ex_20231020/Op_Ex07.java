// Q. 국어, 영어, 수학에 대한 점수를 입력받아, 세 과목에 대한 합계와 평균을 구하고, 세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력
package ex_20231020;

import java.util.Scanner;

public class Op_Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 국어, 영어, 수학 점수 입력
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		
		// 세 과목에 대한 합계와 평균 구함
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.1f\n",avg);
		
		// 각 점수가 40점 이상, 평균이 60점 이상일 때 = "합격", 아니면 "불합격"
		String re = kor >= 40 && eng >= 40 && math >= 40 && avg >= 60 ? "합격" : "불합격";
		
		System.out.println(re);
	}
}
