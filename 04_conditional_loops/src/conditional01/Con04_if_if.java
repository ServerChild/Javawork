package conditional01;

public class Con04_if_if {
	public static void main(String[] args) {
		// 중첩 if 문 : if문 안에 if문이 들어감
		int num1 = 0;
		
		// if 조건이 참일 경우 if문에 해당하는 구문을 실행, 거짓일 경우 else에 해당하는 구문 실행
		if(num1 > 100) { // 100보다 큰 수 모두
			if(num1 > 200) // 200보다 큰 수 모두
				System.out.println("200보다 큰 숫자");
			else // 100 ~ 200
				System.out.println("100보다는 크고 200보다는 작은 숫자");
		} 
		else { // 100보다 작은 수 모두
			if(num1 > 0) // 100 ~ 0
				System.out.println("100보다 작은 양수");
			else if(num1 == 0) // 0
				System.out.println("0이다");
			else
				System.out.println("음수");
		}
	}
}
