package ex_20231024;

public class Array_Ex03 {
	public static void main(String[] args) {
		// 배열(Array) - 1차원
		// 로또 번호 추첨하기(45개)
		int lotto[] = new int[45];
		
		for(int i = 0; i <= lotto.length; i++) {
			lotto[i] = i + 1;
		}
		
		int index = 0;
		
		// 45개의 숫자 중 6개 숫자(인덱스) 추출
		for(int i = 0; i < 6; i++) {
			index = (int)(Math.random() * 45) + 1; // 1 ~ 45
		}
		
		
	}
}
