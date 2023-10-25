// Q. 키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력
package ex_20231018;

import java.util.Scanner;

public class Print_Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사각형의 세로를 입력하세요 : ");
		double col = sc.nextDouble();
		
		System.out.print("사각형의 가로를 입력하세요 : ");
		double low = sc.nextDouble();
		
		System.out.println("사각형의 면적 : " + (low * col));
		
		System.out.println("사각형의 둘레 : " + ((low + col) * 2));
	}
}
