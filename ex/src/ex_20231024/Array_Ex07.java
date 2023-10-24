// Q. 사용자가 입력한 값이 배열에 있는지 검색하여, 있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력
// 단, 치킨 메뉴가 들어가있는 배열은 본인 스스로
package ex_20231024;

import java.util.Scanner;

public class Array_Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 치킨 메뉴가 들어가있는 배열 선언
		String arr[] = {"후라이드", "슈프림", "양념", "불닭", "간장"};
		
		// 사용자가 치킨 입력
		System.out.print("치킨 이름을 입력하세요 : ");
		String menu = sc.next();
		
		// 일치 여부 확인용
		boolean flag = false;
		
		// 사용자가 입력한 치킨이 배열 안에 있는지 확인
		for(int i = 0; i < arr.length; i++) {
			// 있으면 -> "OOO 치킨 배달 가능"
			if(menu.equals(arr[i])) {
				flag = true;
				break;
			}	
		}
		if(flag)
			System.out.println(menu + "치킨 배달 가능");
		else
			// 없으면 -> "OOO 치킨은 없는 메뉴입니다"
			System.out.println(menu + "치킨은 없는 메뉴입니다.");
	}
}
