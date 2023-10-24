// Q. 키보드로 입력 받은 값을 변수에 저장하고, 저장된 변수의 값을 성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력
package ex_20231020;

import java.util.Scanner;

public class Op_Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 이름 입력
		System.out.print("이름 : ");
		String name = sc.next();
		
		// 학년(숫자만) 입력
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		// 반(숫자만) 입력
		System.out.print("반(숫자만) : ");
		int classNum = sc.nextInt();
		
		// 번호(숫자만) 입력
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		
		// 성별(M/F) 입력
		System.out.print("성별(M / F) : ");
		char gender = sc.next().charAt(0);
		
		// 성적(소수점 둘째 자리까지) 입력
		System.out.print("성적(소수점 둘째 자리까지) : ");
		double score = sc.nextDouble();
		
		// 성별이 'M' 이면 남학생, 'M'이 아니면 여학생
		String re = gender == 'M' ? "남학생" : "여학생";
		
		System.out.println(grade + "학년 " + classNum + "반 " + num + "번 " + name + " " + re + "의 성적은 " + score + "이다.");
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", grade, classNum, num, name, re, score);
	}
}
