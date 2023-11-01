package array01;

import java.util.Arrays;

public class Array2_03 {
	public static void main(String[] args) {
		// 2차원 배열 : 자료형[][] 배열명 = new 자료형[행][열]
		int iArr[][] = new int[2][3]; 
		int[][] score = {{1, 2, 3}, {4, 5, 6}};
		
		int iArr1[][] = new int[3][5];
		int[][] score1 = {{1, 2, 3, 4, 5},       // [0]
						  {4, 5, 6, 7, 8},      // [1]		-> 행
						  {9, 10, 11, 12, 13}}; // [2]
						// [0] [1] [2] [3] [4]	 -> 열
		
		System.out.println(score1[1][2]); // 6
		System.out.println(score1[2][3]); // 12
		
		System.out.println("score1의 길이(행길이) : " + score1.length); // 3 -> 행길이
		System.out.println("score1[0]의 길이(열길이) : " + score1[0].length); // 5 -> 열길이
		System.out.println("=================");
		
		
		// 2차원 배열 안에 값 출력
		for(int i = 0; i < score1.length; i++) {
			for(int j = 0; j < score1[i].length; j++) {
				System.out.print(score1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("=================");
		
		
		// 값 넣기
		score1[0][2] = 6;
		
		int iArr3[][] = new int[4][3];
		int count = 1;
		
		for(int i = 0; i < iArr3.length; i++) {
			for(int j = 0; j < iArr3[i].length; j++) {
				iArr3[i][j] = count++;
				System.out.print(iArr3[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("=================");
		
		
		// 열의 길이 다르게 o
		int iArr4[][] = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
		
		for(int i = 0; i < iArr4.length; i++) {
			for(int j = 0; j < iArr4[i].length; j++) {
				System.out.print(iArr4[i][j] + " ");
			}
			System.out.println();
		}
	}						
}
