package ex_20231103.library;

import java.util.*;

public class BookMenu {
	// 객체 선언
	Scanner sc = new Scanner(System.in);
	
	BookController bc = new BookController();
	
	// 생성자
	// 사용자가 메인 메뉴 선택
	public void mainMenu() { 
		System.out.println("== Welcome Book Library ==");
		
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("9. 종료");
			System.out.println("");
			
			
			System.out.print("메뉴 번호 선택 : ");
			int selectNum = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			
			switch(selectNum) {
				case 1:
					insertBook();
					break;
				case 2:
					seletList();
					break;
				case 3:
					searchBook();
					break;
				case 4:
					deleteBook();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					return;	
				default:
					System.out.println("잘못 입력했습니다. 다시 입력해주세요.");	
			}
		}
	}
	
	
	// 도서 추가를 위해 정보 받음
	public void insertBook() { 
		System.out.println("==== 새 도서 추가 ====");
		System.out.println("책 정보를 입력해주세요.");
		
		System.out.print("도서 명 : ");
		String title = sc.nextLine();
		
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		
		System.out.print("장르(1. 인문 / 2. 과학 / 3. 학습서 / 4. 기타) : ");
		int categoryNum = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		// 장르번호 선택시에 번호에 해당하는 장르명으로 출력
		String category = null;
		
		switch(categoryNum) {
		case 1:
			category = "인문";
			break;
		case 2:
			category = "과학";
			break;
		case 3:
			category = "학습서";
			break;
		default :
			category = "기타";
		}
		
		// BookController의 insertBook로 객체 전달
		bc.insertBook(new Book(title, author, category, price));
	}
	
	
	// 전체 도서 목록 출력
	public void seletList() { 
		System.out.println("==== 도서 전체 조회 ====");
		
		ArrayList<Book> selectList = bc.selectList();
		
		// 비어있는 경우, 비어있지 않은 경우 출력
		if(selectList.isEmpty())
			System.out.println("존재하는 도서가 없습니다.");
		else {
			for(Book book : selectList) {
				System.out.println(book);
			}
		}
	}
	
	
	// 특정 도서 검색 결과
	public void searchBook() { 
		System.out.println("==== 도서 검색 ====");
		System.out.println("검색 키워드 : ");
		
		String keyWord = sc.nextLine();
		
		ArrayList<Book> searchList = bc.searchBook(keyWord);
		
		// 결과가 없는 경우, 결과가 있는 경우
		if(searchList.isEmpty())
			System.out.println("검색 결과가 없습니다.");
		else {
			for(Book book : searchList) {
				System.out.println(book);
			}
		}
	}
	
	
	// 툭정 도서 삭제
	public void deleteBook() {
		System.out.println("==== 도서 삭제 ====");
		
		System.out.print("삭제할 도서명 : ");
		String title = sc.nextLine();
		
		System.out.print("삭제할 저자명 : ");
		String author = sc.nextLine();
		
		Book deleteBook = bc.deleteBook(title, author);
		
		// 존재하지 않은 경우, 존재하는 경우
		if(deleteBook == null)
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		else
			System.out.println(deleteBook + "을 성공적으로 삭제하였습니다.");
	}
}
