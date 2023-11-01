package exception01;

import java.util.InputMismatchException;
import java.util.Scanner;

// InputMismatchException : 자료형을 잘못 넣었을 경우
public class InputMismatch06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 3개 입력하세요");
		
		int sum = 0;
		
		for(int i = 1; i <= 3; i++) {
			// 예외가 발생할 수 있는 경우
			try {
			System.out.print(i + "번째 점수 : ");
			
			int num = sc.nextInt();
			
			sum += num;
			}
			
			// 예외가 발생했을 때 실행
			catch(InputMismatchException e) {
				System.out.println("0 ~ 100점 사이의 정수만 입력가능");
				sc.next(); // 엔터가 들어온걸 한번 비워주고 값 받음
				i--;
			}
		}
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.2f", sum / 3.0);
	}
}
