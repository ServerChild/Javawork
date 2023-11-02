package ex_20231102.string_Ex02;

import java.util.Scanner;


public class StringEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("[ 반복문을 이용한 선택 메뉴 ]");
			System.out.println("1. 모든 문자를 대문자로 변환");
			System.out.println("2. 문자열에서 문자가 몇번 출현하는지 횟수 반환");
			System.out.println("3. 글자 변경하기");
			System.out.println("0. 프로그램 끝내기");
			System.out.println();
			
			System.out.print("메뉴를 선택하세요(번호 입력) : ");
			int select = sc.nextInt();
			
			if(select == 1) {
				System.out.println("1. 모든 문자를 대문자로 변환");
				
				System.out.print("문자를 입력하세요 : ");
				String str = sc.next();
				
				System.out.println("결과 : " + StringEx.toUpper(str));
				System.out.println();
			}
			
			else if(select == 2) {
				System.out.println("2. 문자열에서 문자가 몇번 출현하는지 횟수 반환");
				
				System.out.print("문자열을 입력하세요 : ");
				String str = sc.next();
				
				System.out.print("찾을 문자를 입력하세요 : ");
				char ch = sc.next().charAt(0);
				
				System.out.println("결과 : " + StringEx.charCount(str, ch));
				System.out.println();
			}
			
			else if(select == 3) {
				System.out.print("단어을 입력하세요 : ");
				String str = sc.next();

				System.out.print("변경할 원래 문자를 입력하세요 : ");
				String oldStr = sc.next();

				
				System.out.print("변경할 새로운 문자를 입력하세요 : ");
				String newStr = sc.next();
				
				System.out.println("결과 : " + StringEx.strReplace(str, oldStr, newStr));
				System.out.println();
			}
			
			else if(select == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
			else
				System.out.println("정해진 메뉴에서 골라주세요.");
		}
	}
	
	// 대문자 변환
	public static String toUpper(String str) {
		return str.toUpperCase();
	}
	
	// 문자열에서 문자 추출해 몇개인지 확인
	public static int charCount(String str, char ch) {
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch)
				count++;
		}
		return count;
	}
	
	// 문자(열) 변경
	public static String strReplace(String str, String oldStr, String newStr) {
		return str.replace(oldStr, newStr);
	}
}
