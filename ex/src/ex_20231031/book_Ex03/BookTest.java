package ex_20231031.book_Ex03;

import java.util.ArrayList;

public class BookTest {
	public static void main(String[] args) {
		LibraryController lc = new LibraryController();
		
		// 책 추가
		lc.insertBook(); 
		
		// 책 모두 선택해서 배열에 넣음
		ArrayList<Book> bList = lc.selectAll();
		
		for(int i = 0; i < bList.size(); i++) {
			System.out.println(bList.get(i));
		}
		
		// 회원 추가후 정보 출력
		Member mem = new Member("아무개", 23, '남');
		lc.insertMember(mem);
		lc.myInfo();
		
		// 책 찾기
		Book searchBook = lc.searchBook("Python");
		
		if(searchBook == null) 
			System.out.println("찾는 책이 없습니다.");
		else
			System.out.println(searchBook);
		
		// 책 빌리기
		int index = lc.rentBook(4);
		if(index < bList.size())
			System.out.println("[빌려주는 책 정보] " + bList.get(index));
		else
			System.out.println("빌려줄 책이 없습니다.");
	}
}
