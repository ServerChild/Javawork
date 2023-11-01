package ex_20231031.book_Ex03;

import java.util.*;

public class LibraryController {
	// 필드
	private Member mem = new Member();
	// private Book bok = new Book();
	private ArrayList<Book> bList = new ArrayList<Book>();
	private ArrayList<Member> mList = new ArrayList<Member>();
	
	
	/*	// insertMember(멤버 추가)
		public void insertMember() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("추가할 회원명을 입력해주세요 : ");
			String inName = sc.next();
			
			System.out.print("추가할 회원나이를 입력해주세요 : ");
			int inAge = sc.nextInt();
			
			System.out.print("추가할 회원성별을 입력해주세요 : ");
			char inGender = sc.next().charAt(0);
			
			// 객체에 데이터를 넣은 후 그 객체의 주소를 List에 넣어줌
			Member m = new Member();
			
			m.setName(inName);
			m.setAge(inAge);
			m.setGender(inGender);
			
			mList.add(m);
		}*/
	
		// insertMember 풀이 2
		public void insertMember(Member m) {
			this.mem = m;
		}
	
	
	// myInfo(내 정보)
	public void myInfo() {
		System.out.println(mem);
	}
	
	
	// insertBook(책 정보 추가)
	public void insertBook() {
		bList.add(new Book("Java", "신용권", "한빛미디어"));
		bList.add(new Book("Oracle", "아무개", "DBi"));
		bList.add(new Book("Spring", "홍길동", "스프링"));
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.print("추가할 도서명을 입력해주세요 : ");
		String inTitle = sc.next();
		
		System.out.print("추가할 저자명를 입력해주세요 : ");
		String inAuthor = sc.next();
		
		System.out.print("추가할 출판사명을 입력해주세요 : ");
		String inPublisher = sc.next();
		
		Book b = new Book();
		
		b.setTitle(inTitle);
		b.setAuthor(inAuthor);
		b.setPublisher(inPublisher);
		
		bList.add(b);*/
	}
	
	
	// selectAll(책 리스트 전부 출력)
	public ArrayList<Book> selectAll() {
		return bList;
	}
	
	
	// searchBook(책 검색)
	public Book searchBook(String keyword) {
		Book book = null;
		
		for(int i = 0; i < bList.size(); i++) {
			if(bList.isEmpty()) {
				System.out.println("책이 없습니다.");
				break;
			}
			else if(keyword.equals(bList.get(i).getTitle())) {
				book = bList.get(i);
				break;
			}
		}
		return book;
	}
	
	
	// rentBook(책 빌리기)
	public int rentBook(int index) {
		return index;
	}
	
}
