package ex_20231103.library;

import java.util.*;

public class BookController {
	// 객체 선언	
	ArrayList<Book> bookList = new ArrayList<Book>();
	
	
	// 생성자(초기값)
	public BookController() {
		bookList.add(new Book("혼자 공부하는 자바", "신동권", "학습서", 30000));
		bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "학습서", 23000));
		bookList.add(new Book("혼자 공부하는 파이썬", "신동권", "학습서", 30000));
		bookList.add(new Book("대화의 기술", "다니엘", "인문", 17500));
	}
	
	
	// 메소드
	// 리스트에 값 저장
	public void insertBook(Book bk) {
		bookList.add(bk);
	}
	
	// 모든 리스트 출력
	public ArrayList<Book> selectList() {
		return bookList;
	}
	
	// 키워드로 책 검색
	public ArrayList<Book> searchBook(String keyword) {
		ArrayList<Book> searchList = new ArrayList<Book>();
		
		for(Book bk : bookList) {
			if(bk.getTitle().contains(keyword))
				searchList.add(bk);
		}
		return searchList;
	}
	
	// 책 제목과 저자명으로 책 삭제
	public Book deleteBook(String title, String author) {
		Book bk = null;
		
		for(int i = 0; i < bookList.size(); i++) {
			if ((title.equals(bookList.get(i).getTitle())) && (author.equals(bookList.get(i).getAuthor()))) {
				bk = bookList.remove(i);
				break;
			}
		}
		return bk;
	}
	
	// 책명 오름차순 정렬
	public int ascBook() {
		bookList.sort(null);
		return 1;
	}
}
