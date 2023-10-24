// Q. 정수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력
// 이 때 총점은 정수형, 평균은 실수형으로 소수점 3째 자리에서 반올림하여 2째 자리까지

package ex_20231019;

import java.util.Scanner;

public class Variable_Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 국어점수
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		// 영어점수
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		// 수학점수
		System.out.print("수학 : ");
		int mat = sc.nextInt();
		
		
		// 총점, 평균
		int sum = kor + eng + mat;
		double avg = sum / 3.0; // = (double)sum / 3;
		
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f", avg);
	}
}
