package com.run;

import java.util.Scanner;

import com.model.vo.Book;

public class BookTest {
	public static void main(String[] args) {
		Book bo1 = new Book();
		Book bo2 = new Book("마이바티스 프로그래밍", "이동국", 22000, "에이콘");
		Book bo3 = new Book();
		
		// setter 이용
		bo1.setTitle("혼자 공부하는 자바");
		bo1.setAuthor("신용권");
		bo1.setPrice(24000);
		bo1.setPublisher("한빛미디어");
		
		// 사용자 입력 받아서 값 저장
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[책 정보 입력]");
		System.out.print("도서명 : ");
		bo3.setTitle(sc.nextLine());
		
		System.out.print("저자 : ");
		bo3.setAuthor(sc.next());
		
		System.out.print("가격 : ");
		bo3.setPrice(sc.nextInt());
		
		System.out.print("출판사 : ");
		bo3.setPublisher(sc.next());
		
		System.out.println();
		
		System.out.println("첫번째 책 정보 : " + bo1.information());
		System.out.println("두번째 책 정보 : " + bo2.information());
		System.out.println("세번째 책 정보 : " + bo3.information());
		
		
	}
}
