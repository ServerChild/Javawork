package ex_20231101.userDefineException_Ex01;

import java.util.Scanner;

public class NumberMenu {
	public static void main(String[] args) {
		// 해당 클래스에 menu() 메소드 호출해 값 출
		NumberMenu.menu();
		
	}
	
	public static void menu() {
		NumberController nc = new NumberController();
		
		// 예외가 발생할 수 있는 경우
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			
			boolean cd = nc.checkDouble(num1, num2);
			
			System.out.println(num1 + "은(는) " + num2 + "의 배수인가 ? " + cd);
		}
		
		// 예외가 발생했을 때 실행 -> 사용자 정의 예외처
		catch(NumRangeException e) {
			System.out.println(e.getMessage());
		}
	}
}
