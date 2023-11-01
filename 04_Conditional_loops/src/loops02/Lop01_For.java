package loops02;

public class Lop01_For {
	public static void main(String[] args) {
		// 반복문 : 어떤 작업을 반복적으로 실행하고 싶을 때 사용
		// for 문 : 주어진 횟수만큼 반복하고 싶을 경우
		/*
		  	형식 : for(초기식; 조건식; 증감식) {
		  				 실행문;
		  		  }
		 */
		
		// 예시 1 : 하나씩 증가
		for(int i = 1; i <= 100; i++) {
			System.out.println(i + ". 안녕하세요");
		}
		System.out.println();
		
		
		// 예시 2 : 2씩 증가
		for(int i = 1; i <= 10; i += 2) {
			System.out.println(i + "번 출력");
		}
		System.out.println();
		
		
		// 예시 3 : 하나씩 감소
		for(int i = 10; i >= 1; i--) {
			System.out.println(i + ". 하나씩 감소");
		}
		System.out.println();
		
		
		// 예시 4 : 1 부터 10 까지 합계 구하기
		int sum = 0;
				
		for(int i = 1; i <= 10; i++) {
			sum += i; // 누적합 : 55
		}
		
		System.out.println("1 ~ 10 까지의 합계 : " + sum);
	}
}
