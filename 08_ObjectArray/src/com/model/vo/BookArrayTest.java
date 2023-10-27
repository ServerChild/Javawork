package com.model.vo;

import java.util.Scanner;

public class BookArrayTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 배열 3개 생성
		Book[] books = new Book[3];
		
		for(int i = 0; i < books.length; i++) {
			System.out.println(i + 1 + "번째 도서 정보 입력");
			
			System.out.print("도서명 : ");
			String title = sc.nextLine();
			
			System.out.print("저자 : ");
			String author = sc.next();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			// 배열에 객체 입력
			books[i] = new Book(title, author, price, publisher);
			
			
			System.out.println(books[i].information());
		}
		
		// 도서 제목으로 검색
		System.out.println("검색할 책 제목 : ");
		String search = sc.nextLine();
				
		for(int i = 0; i < books.length; i++) {
			if(books[i].getTitle().equals(search))
				System.out.println(books[i].information());
		}
		
	}
}
