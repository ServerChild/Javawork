// Q. 주민등록번호 성별자리 이후부터 *로 가리고 출력
// 단, 원본 배열 값은 변경 없이 배열 복사본으로 변경
package ex_20231024;

import java.util.Scanner;

public class Array_Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 주민등록번호를 입력받음
		System.out.println("주민등록번호(- 포함) : ");
		String num = sc.next();
		
		// 주민등록번호가 저장된 배열
		char[] oldArr = new char[num.length()];
		
		// 배열에 저장
		for(int i = 0; i < oldArr.length; i++) {
			oldArr[i] = num.charAt(i);
		}
		
		char[] copy = new char[oldArr.length];
		
		for(int i = 0; i < copy.length; i++) {
			if(i < 8)
				copy[i] = oldArr[i];
			else
				copy[i] = '*';
		}
		System.out.println(copy);
	}
}


/* 반복문 하나로 합치기
 
    char[] oldArr = new char[num.length()];
    char[] copy = new char[oldArr.length];
    
    for(int i = 0; i < oldArr.length; i++) {
		oldArr[i] = num.charAt(i);
			
		if(i < 8)
			copy[i] = oldArr[i];
		else
			copy[i] = '*';
	} 
	
 */
