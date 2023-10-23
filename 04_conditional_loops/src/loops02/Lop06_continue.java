package loops02;

public class Lop06_continue {
	public static void main(String[] args) {
		// break : 반복문을 빠져나올 때
		// continue : continue 하위의 실행문을 실행하지 않고 반복문을 다시 실행
		//		~ 을 제외 할때 많이 사용
		
		// 1 ~ 100까지의 숫자 중 3의 배수를 제외한 합계를 구하기
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0)
				continue;
			
			sum  += i;
		}
		System.out.println("1 ~ 100까지 3의 배수를 제외한 합계 = " + sum);
	}
}
