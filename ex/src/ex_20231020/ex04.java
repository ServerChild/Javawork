// Q. 인원 수와 사탕의 개수를 키보드로 입력 받고, 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력
package ex_20231020;

import java.util.*;

public class ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 인원 수, 사탕 개수 입력
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		// 1인당 사탕 개수, 남은 사탕 개수 출력
		System.out.println("1인당 사탕 개수 : " + (candy / people));
		
		System.out.println("남은 사탕 개수 : " + (candy % people));
	}
}
