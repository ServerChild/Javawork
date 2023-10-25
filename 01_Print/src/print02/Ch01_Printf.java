package print02;

public class Ch01_Printf {
	public static void main(String[] args) {
		// 형식화된 출력 : printf, format
		// %b(boolean), %d(10진수), %o(8진수), %x/%X(16진수), %f(실수형), %c(문자), %s(문자열)
		System.out.printf("%d\n", 10); // 10진수
		System.out.printf("%d, %d\n", 5, 1); // 10진수
		System.out.printf("%d-%s\n", 970000, "2******"); // 10진수 + 문자열
		
		System.out.printf("%o\n", 9); // 8진수 : 11
		
		System.out.printf("%x\n", 15); // 16진수 : f (소문자)
		System.out.printf("%X\n", 14); // 16진수 : E (대문자)
		
		System.out.printf("%f\n", 2.45123); // 실수(float), 소수점 6번째 자리까지 출력
		System.out.printf("%f\n", 1.01); // 실수(float)
		
		System.out.printf("%c\n", 'A'); // 문자 1개('')
		
		System.out.printf("%s\n", "=^._.^= ∫"); // 문자열("")
		
		System.out.printf("%b\n", false); // boolean(true or false) 타입
		System.out.printf("%b\n", 6 >= 3);
		
		// 올해는 2023년 10월 이고, 우리나라의 평균키는 164.8 입니다.
		System.out.printf("올해는 %d년 %d월 이고, 우리나라의 평균키는 %.1f 입니다.\n", 2023, 10, 164.8);
		
		// 이 과정의 정원은 '20'명이고, 현재는 '9'명 수강중 입니다. 평균 '23.5'% 달성했습니다.
		System.out.printf("이 과정의 정원은 '%d'명이고, 현재는 '%d'명 수강중 입니다. 평균 '%.1f'%% 달성했습니다.", 20, 9, 23.5);
	}
}
