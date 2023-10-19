// Q. 이름, 성별, 나이, 키를 사용자로부터 입력받아 각각 변수를 담아 출력
package ex;

import java.util.*;

public class ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = sc.next();
		
		System.out.print("성별 입력(남 , 여) : ");
		String lm = sc.next();
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		System.out.print("키 입력(cm) : ");
		double cm = sc.nextDouble();
		
		System.out.println("키 " + cm + "cm인 " + age + "살 " + lm + " " + name + "님 반갑습니다." );
	}
}
