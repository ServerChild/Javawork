package op01;

public class Ch05_threeOp {
	public static void main(String[] args) {
		// 삼항 연산자 : 조건식 ? 조건이 참 일때 실행 : 조건이 거짓일 때 실행
		int num1 = 10;
		int num2 = 7;
		
		String re = num1 > num2 ? "num1의 숫자가 더 크다" : "num2의 숫자가 더 크다";
		
		System.out.println(re);
	}
}
