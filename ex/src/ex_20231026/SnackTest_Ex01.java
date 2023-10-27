package ex_20231026;

import java.util.Scanner;

public class SnackTest_Ex01 {
	public static void main(String[] args) {
		// 객체 생성
		Snack_Ex01 sn = new Snack_Ex01();
		Snack_Ex01 sn1 = new Snack_Ex01("비스켓", "새우깡", "매운 새우", 1, 2000);
		
		// 값 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("종류 입력 : ");
		sn.setKind(sc.next());
		
		System.out.print("이름 입력 : ");
		sn.setName(sc.next());
		
		System.out.print("맛 입력 : ");
		sn.setFlavor(sc.next());
		
		System.out.print("개수 입력 : ");
		sn.setNumOf(sc.nextInt());
		
		System.out.print("가격 입력 : ");
		sn.setPrice(sc.nextInt());
		
		// 출력
		System.out.println("sn객체의 정보 : " + sn.information());
		System.out.println("sn1객체의 정보 : " + sn1.information());
		System.out.println();
		
		// sn객체의 수량 변경, 가격 변경, 정보 출력
		sn.setNumOf(3);
		sn.setPrice(7500);
		System.out.println("sn객체의 변경정보 : " + sn.information());
		
		// sn1객체의 이름 변경, 금액 변경, 정보 출력
		sn1.setName("고구마깡");
		sn1.setPrice(1800);
		System.out.println("sn1객체의 변경정보 : " + sn1.information());
		
	}
}
