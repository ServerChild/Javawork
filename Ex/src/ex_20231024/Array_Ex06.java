// Q. 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고, 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력
// 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고 다시 정수를 받아야 함
package ex_20231024;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			// 3이상인 홀수 자연수를 사용자로부터 입력받음
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			int iArr[] = new int[num];
			
			// 입력한 정수가 홀수가 아니거나 3미만 -> "다시 입력하세요" 출력 후 다시 입력받음
			if(num % 2 == 1 && num >= 3) {
				int count = 1;
				
				for(int i = 0; i < num; i++) {
					// 배열 처음부터 중간 : 1 ~ 입력받은 자연수(1씩 증가해서 오름차순)
					if(i < num / 2)
						iArr[i] = count++;
					// 배열 중간부터 끝 : 입력받은 자연수 ~ 1(1씩 감소해서 내림차순)
					else
						iArr[i] = count--;
				}
			}
			else {
				System.out.println("다시 입력하세요");
				continue;
			}
			
			// 출력
			System.out.println(Arrays.toString(iArr));
			break;
		}
	}
}

/*	풀이2
 
  	System.out.print("정수 : ");
	int num = sc.nextInt();
			
	if(num % 2 == 1 && num > 3) {
		int iArr[] = new int[num];
		int count = 1;
			
		for(int i = 0; i < num; i++) {
			if(i < num / 2)
				iArr[i] = count++;
			else
				iArr[i] = count--;
		}
		System.out.println(Arrays.toString(iArr));
		}
 		else
 			System.out.println("다시 입력하세요");
  			System.out.print("정수 : ");
			int num = sc.nextInt();
  
  
*/
