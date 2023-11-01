package scanner02;

import java.util.*;

public class Ch01_Scanner {
	public static void main(String[] args) {
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		// 문자열 단어로 입력받을 때 : next()
		String name = sc.next();
		System.out.println("이름 : " + name);
		
		
		System.out.print("나이를 입력하세요 : ");
		// 정수로 입력받을 때 : nextInt()
		int age = sc.nextInt();
		System.out.println("나이 : " + age);
		
		
		System.out.print("키를 소수점 2번째 자리까지 입력하세요 : ");
		// 실수로 입력받을 때 : nextDouble()
		double cm = sc.nextDouble();
		System.out.println("키 : " + cm);
		
		
		System.out.print("여자인가요?(true or false) : ");
		// 참 or 거짓을 입력받을 때 : nextBoolean()
		boolean lm = sc.nextBoolean();
		System.out.println("여자인가요? : " + lm);
		sc.nextLine();
		
		
		System.out.print("주소를 입력하세요 : ");
		// 한 줄을 입력받을 때 : nextLine()
		String address = sc.nextLine();
		System.out.println("주소 : " + address);
		
		
		// chatAt(index 값) : index 값에 해당하는 문자 하나를 출력함 
		System.out.print("성별을 입력하세요(남 or 여) : ");
		/*
		  String gender = sc.next();
		  char gender1 = gender.charAt(0);
		*/
		char gender = sc.next().charAt(1);
		System.out.println("당신은 " + gender + "자 입니다.");
		
		System.out.println("이름을 영문으로 쓰시오 : ");
		char name2 = sc.next().charAt(3);
		System.out.println("영문 이름 4번째 글자는 " + name2 + " 입니다.");
		
	}	
}
