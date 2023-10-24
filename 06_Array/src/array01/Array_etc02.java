package array01;

import java.util.Arrays;
import java.util.Scanner;

public class Array_etc02 {
	public static void main(String[] args) {
		// 배열(Array) : char, String, boolean, double
		int iArr[] = {1, 2, 3, 4, 5};
		char chArr[] = {'a', 'b', 'c', 'd'};
		String strArr[] = {"홍길동", "kim", "@#$"};
		boolean bArr[] = {true, false, false, true};
		double dArr[] = {3.14, 6.54, 9.234};
		
		String sArr[] = new String[3];
		
		sArr[0] = "아무개";
		sArr[1] = "강남길";
		sArr[2] = "이순남";
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < sArr.length; i++) {
			System.out.print((i + 1) + "번째 이름 입력 : ");
			
			sArr[i] = sc.next();
			// String name = sc.next();
			// sArr[i] = name;
		}
		for(int i = 0; i < sArr.length; i++) {
			System.out.print(sArr[i] + ", ");
		}
		
		// 배열 출력문 : Arrays.toString(배열명)
		System.out.println(Arrays.toString(sArr)); // String 배열 출력
		System.out.println(Arrays.toString(bArr)); // boolean 배열 출력
		System.out.println(chArr); // char 배열은 toString 사용 안해도 출력 가능
		System.out.println(iArr); // 주소가 나옴, char를 제외한 나머지 해당
	}
}
