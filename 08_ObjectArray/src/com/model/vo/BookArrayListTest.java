package com.model.vo;

import java.util.*;

public class BookArrayListTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Book> al = new ArrayList<Book>();
		
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		
		System.out.print("저자 : ");
		String author = sc.next();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.print("출판사 : ");
		String publisher = sc.nextLine();
		
		Book b1 = new Book(title, author, price, publisher);

		al.add(b1);
	}
}
