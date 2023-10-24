package array01;

import java.util.Arrays;

public class Array_Ex04 {
	public static void main(String[] args) {
		int arr[] = new int[10];
		
		// 랜덤으로 1 ~ 10까지의 숫자 배열에 넣기
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
