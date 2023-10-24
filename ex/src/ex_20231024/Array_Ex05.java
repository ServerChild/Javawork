// Q. 사용자가 배열의 길이를 직접 입력해 그 값만큼 정수형 배열을 선언 및 할당
// 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화
// 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력
package ex_20231024;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 사용자가 배열의 길이 입력 및 배열 선언
		System.out.print("배열의 길이(정수) : ");
		int num = sc.nextInt();
		
		int sum = 0;
		int arr[] = new int[num];
		
		// 배열 안에 넣을 값 입력 및 초기화
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("배열 [" + i + "]번째 인덱스에 넣을 값 : ");
			
			// 한줄 : arr[i] = sc.nextInt();
			int index = sc.nextInt();
			arr[i] = index;
			
			// 저장된 값의 합
			sum += arr[i];
		}
		
		// 배열 전체 값 나열, 각 저장된 값들의 합 출력
		System.out.println(Arrays.toString(arr));
		System.out.println("총 합 : " + sum);
	}
}
