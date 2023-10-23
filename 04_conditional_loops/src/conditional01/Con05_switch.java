package conditional01;

import java.util.Scanner;

public class Con05_switch {
	public static void main(String[] args) {
		// switch 문 : 변수가 어떤 값을 갖는가에 따라 실행문 선택
		// 경우의 수가 2 ~ 5 가지일 경우 사용
		// break 가 없으면 모든 구문을 실행함
		/*
		 	형식 : switch(변수) {
		 			case (변수값):	
		 					실행문;
		 					break;
		 			case (변수값):	
		 					실행문;
		 					break;			
		 			default:
		 					실행문;
		 		  }
		 */
		
		// 예시 1
		int num = 0;
		
		switch(num) {
			case 1:
				System.out.println("1 입니다.");
				break; // switch 문을 빠져나옴
				
			case 2:
				System.out.println("2 입니다.");
				break;
				
			default:
				System.out.println("1과 2가 아닌 수");
		}
		System.out.println();
		
		
		// 예시 2
		char ch = 'k'; // k, l, p
		
		switch(ch) {
			case 'k':
				System.out.println("김씨입니다.");
				break;
				
			case 'l':
				System.out.println("이씨입니다.");
				break;
				
			case 'p':
				System.out.println("박씨입니다.");
				break;
				
			default:
				System.out.println("성이 김, 이, 박이 아닙니다.");
		}
		System.out.println();
		
		
		// 예시 3
		int month = 3;
		
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.println("겨울에 태어남");
			break;
			
		case 3:
		case 4:
		case 5:
			System.out.println("봄에 태어남");
			break;
			
		case 6:
		case 7:
		case 8:
			System.out.println("여름에 태어남");
			break;
			
		default: // 9, 10, 11 해당
			System.out.println("가을에 태어남");
		}
		System.out.println();
		
		
		// 예시 4 : 연산자(+, -, *, /, %)와 숫자 2개를 입력받아 연산결과 출력
		Scanner sc = new Scanner(System.in);
		
		// 숫자 두개와 연산자 입력받음
		System.out.print("연산자(+, -, *, /, %) : ");
		String op = sc.next(); // 연산자
		// char op = sc.next().charAt(0) -> 연산자를 문자형으로 받을 때
		
		System.out.print("숫자1 : ");
		int num1 = sc.nextInt(); // 숫자 1
		
		System.out.print("숫자2 : ");
		int num2 = sc.nextInt(); // 숫자 2
		
		// 연산결과 출력
		switch(op) {
			case "+":
				System.out.printf("숫자1(%d) + 숫자2(%d) = %d\n",num1, num2, (num1 + num2));
				break;
				
			case "-":
				System.out.printf("숫자1(%d) - 숫자2(%d) = %d\n",num1, num2, (num1 - num2));
				break;
				
			case "*":
				System.out.printf("숫자1(%d) * 숫자2(%d) = %d\n",num1, num2, (num1 * num2));
				break;
				
			case "/":
				System.out.printf("숫자1(%d) / 숫자2(%d) = %.2f\n",num1, num2, ((double)num1 / num2));
				break;
				
			case "%":
				System.out.printf("숫자1(%d) % 숫자2(%d) = %d\n",num1, num2, (num1 % num2));
				break;
			default:
				System.out.println("end");
		}
	}
}
