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

		System.out.println("[현재 가지고 있는 책]");
		System.out.println(bo1.getTitle());
		System.out.println(bo2.getTitle());
		System.out.println(bo3.getTitle());
		
		System.out.println();
		
		System.out.println("[모든 책 정보]");
		System.out.println("첫번째 책 정보 : " + bo1.information());
		System.out.println("두번째 책 정보 : " + bo2.information());
		System.out.println("세번째 책 정보 : " + bo3.information());
		
		
		// 일반 변수에 3권의 책을 입력
		Book boo1 = null;
		Book boo2 = null;
		Book boo3 = null;
		
		for(int i = 1; i <= 3; i++) {
			System.out.println("[책 정보 입력]");
			System.out.print("도서명 : ");
			String title = sc.nextLine();
			
			System.out.print("저자 : ");
			String author = sc.next();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			
			System.out.print("출판사 : ");
			String publisher = sc.next();
			
			System.out.println();
			
			// 매번 검사
			if(i == 1) 
				boo1 = new Book(title, author, price, publisher);
			else if(i == 2)
				boo2 = new Book(title, author, price, publisher);
			else
				boo3 = new Book(title, author, price, publisher);
		}
		
		System.out.println(boo1.information());
		System.out.println(boo2.information());
		System.out.println(boo3.information());

		
		// 도서 제목으로 검색
		System.out.println("검색할 책 제목 : ");
		String search = sc.nextLine();
		
		if(boo1.getTitle().equals(search))
			System.out.println(boo1.information());
		else if(boo2.getTitle().equals(search))
			System.out.println(boo2.information());
		else
			System.out.println(boo3.information());
	}
}
