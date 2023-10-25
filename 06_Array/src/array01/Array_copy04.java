package array01;

import java.util.Arrays;

public class Array_copy04 {
	public static void main(String[] args) {
		// 예시 1
		// 배열에 값을 더 넣고자 할때는
		int[] oldScore = {45, 67, 8, 3, 25};
		
		// 새로운 더 큰 배열을 선언
		int[] newScore = new int[10];
		
		/*
		// 배열 copy 하여 값 옮긴 후 값 추가
		for(int i = 0; i < oldScore.length; i++) {
			newScore[i] = oldScore[i];
		}
		
		newScore[5] = 78;
		System.out.println(Arrays.toString(newScore));
		*/
		
		// (복사할 배열명, 복사할 배열 시작위치, 복사한 배열명, 복사한 배열 시작위치, 복사한 배열 길이(몇개를 넣어서 복사?))
		System.arraycopy(oldScore, 0, newScore, 0, oldScore.length);
		System.out.println(Arrays.toString(newScore));
		
		
		// 예시 2
		String oldStr[] = {"java", "python", "oracle"};
		
		String newStr[] = new String[10];
		
		System.arraycopy(oldStr, 0, newStr, 2, 3);
		System.out.println(Arrays.toString(newStr));
	}
}
