// Q. 1 ~ 100까지 3의 배수의 합 구하기
package ex_20231023;

public class For_Ex01 {
	public static void main(String[] args) {
		// 변수 선언(합계)
		int sum = 0;
		
		// 3의 배수를 구해 합계를 구함
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) sum += i;
		}
		
		System.out.println("3의 배수의 합은 : " + sum);
	}
}
