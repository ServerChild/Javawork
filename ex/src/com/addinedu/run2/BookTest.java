package com.addinedu.run2;

import java.util.Scanner;
import com.addinedu.model.vo2.Book;

public class BookTest {
	public static void main(String[] args) {
		Book bo1 = new Book();
		Book bo2 = new Book("혼자 공부하는 자바", 25000, 0.3, "한빛미디어");
		
		// 값 입력
		Scanner sc = new Scanner(System.in);
				
		System.out.print("책제목 입력 : ");
		bo1.setTitle(sc.nextLine());
				
		System.out.print("가격 입력 : ");
		bo1.setPrice(sc.nextInt());
				
		System.out.print("할인율 입력 : ");
		bo1.setDiscountRate(sc.nextDouble());
				
		System.out.print("저자 입력 : ");
		bo1.setAuthor(sc.next());
		
		System.out.println();
		
		// 출력
		System.out.println("1번째 책 정보 : " + bo1.information());
		System.out.println("2번째 책 정보 : " + bo2.information());
		System.out.println();

		
		// 할인된 가격 출력
		System.out.println("1번째 책 할인 가격 : " + bo1.getDiscountPrice());
		System.out.println("2번째 책 할인 가격 : " + bo2.getDiscountPrice());
	}
}
