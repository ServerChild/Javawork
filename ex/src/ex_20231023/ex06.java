// Q. 길이가 5인 배열에 값을 for문으로 {0, 3, 6 ,9 ,12}를 넣고 합계를 구하여 출력 
package ex_20231023;

public class ex06 {
	public static void main(String[] args) {
		// 배열 선언
		int arr[] = new int[5];
		
		// 배열 값 넣음
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i * 3;
			if(i == 4)
				System.out.println(arr[i]);
			else
				System.out.print(arr[i] + ", ");
		}
		
		// 합계
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
}
