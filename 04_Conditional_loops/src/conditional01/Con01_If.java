package conditional01;

public class Con01_If {
	public static void main(String[] args) {
		// 조건문(if)
		// 경우의 수 범위가 넓을 경우 사용
		/* 
			형식 : if(조건식) {
					조건식이 참일 때 실행문;
				   }
		*/
	
		int num1 = 100;
		
		
		// 실행문이 하나일 때 {}(중괄호) 생략 가능
		if(num1 == 100) { System.out.println("100입니다."); }
		
		
		// 실행문이 한 줄 이상일 때는 반드시 {}(중괄호)로 묶어줘야 함
		if(num1 >= 80) {
			System.out.println("합격");
			System.out.println("축하합니다.");
		}
		
		
		// 중괄호가 없을 때 if문과 상관 없이 참이던 거짓이던 출력
		System.out.println("if문과 상관없이 실행");
	}
}
