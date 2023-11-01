package exception01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch08 {
	public static void main(String[] args) {
		// catch문이 여러개 : 오류가 여러개가 나는 경우
		// 예외가 발생할 수 있는 경우
		try {
			String[] strNum = {"3", "4", "a123"};
			
			// 예외 1. NumberFormatException
			int num = Integer.parseInt(strNum[2]);
			
			// 예외 2. ArrayIndexOutOfBoundsException
			System.out.println(strNum[4]);
			
			// 예외 3. InputMismatchException
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 입력 : ");
			int num2 = sc.nextInt();
		}
		
		// 예외가 발생했을 때 실행
		// catch문이 여러개일 때는 위에서부터 순서대로 내려가면서 해당하는 exception을 찾음
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 넘어섰습니다.");
		}
		catch(InputMismatchException e) {
			System.out.println("입력값은 정수로 넣으세요.");
		}
		catch(NumberFormatException e) {
			System.out.println("정수로 변환할 수 없습니다.");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		// 예외클래스를 |(or)로 여러개 써도 됨
		// catch(ArrayIndexOutOfBoundsException | InputMismatchException | NumberFormatException e) { System.out.println(e); }
	}
}
