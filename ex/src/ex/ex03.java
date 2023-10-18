// Q. 키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력
package ex;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("세로를 입력하세요 : ");
		double col = sc.nextDouble();
		
		System.out.print("가로를 입력하세요 : ");
		double low = sc.nextDouble();
		
		System.out.println("면적 : " + (low * col));
		
		System.out.println("둘레 : " + ((low + col) * 2));
	}

}
