package loops02;

import java.util.Scanner;

public class Lop05_Math {
	public static void main(String[] args) {
		// Math(수학에 관련된 클래스)
		double rand1 = Math.random(); // 랜덤함수 : 실수형(0 ~ 0.9999999999)
		System.out.println(rand1);
		
		System.out.println("====================");
		
		double rand2 = Math.random() * 10; // 0 ~ 9.9999999999
		System.out.println(rand2);
		
		
		int reRand2 = (int)rand2; // 0 ~ 9(소수점 이하 버림)
		System.out.println(reRand2);
		
		
		// 1 ~ 10까지의 숫자를 얻고자 한다면
		int re2Rand2 = (int)rand2 + 1; // 1 ~ 10
		System.out.println(re2Rand2);
		
		System.out.println("====================");
		
		// 0 ~ 4까지의 숫자를 얻고자 한다면
		double rand3 = Math.random() * 5; // 0 ~ 4.9999999999
		System.out.println(rand3);
		
		int reRand3 = (int)rand3; // 0 ~ 4
		System.out.println(reRand3);
		
		int re2Rand3 = (int)rand3 + 1; // 1 ~ 5
		System.out.println(re2Rand3);	
		
		System.out.println("====================");
		
		double rand4 = Math.random() * 100; // 0 ~ 99.9999999999
		System.out.println(rand4);
		System.out.println();
		
		// 주사위의 숫자 맞추기 게임
		// 랜덤으로 주사위 숫자 만들기
		// 사용자로부터 숫자 입력받아서
		// 숫자 맞추면 "축하합니다. 맞췄습니다." 하고 끝냄, 못 맞추면 계속하기
		
		// 랜덤으로 1 ~ 6까지의 숫자 추출
		int com = (int)(Math.random() * 6) + 1;
		int user = 0;
		do {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("주사위의 숫자를 맞춰보세요. : ");
			user = sc.nextInt();
			
			if(com == user) 
				System.out.println("축하합니다. 맞췄습니다.");
			else 
				System.out.println("틀렸습니다. 다시 입력하세요.");
		} while(com != user);
	}
}
