package ex_20231103.library;

import java.util.*;

public class Run {
	public static void main(String[] args) {
		/*// 객체 생성
		BookMenu bMenu = new BookMenu();
		
		
		// 호출
		bMenu.mainMenu();*/
		
		
		// 컬렉션 정렬
		//  - 클래스별로 기본정렬(오름차순 정렬) : sort
		//  - 내림차순 정렬 : comparator 구현 클래스 작성
		ArrayList<Integer> list= new ArrayList<Integer>();
		
		// list 값 추가 후 출력
		list.add(3);
		list.add(5);
		list.add(2);
		list.add(1);
		list.add(4);
		System.out.println("정렬 전 : " + list);
		
		
		// 오름차순 정렬 : sort(), Collections.sort()
		list.sort(null);
		// Collections.sort(list); -> 동일한 오름차순 정렬
		System.out.println("정렬 후(오름차순) : " + list);
		
		
		// 내림차순 정렬 : Comparator -> Collections.reverseOrder()
		Comparator<Integer> comp = Collections.reverseOrder();
		list.sort(comp);
		
		list.sort(Collections.reverseOrder());
		System.out.println("정렬 후(내림차순) : " + list);
		System.out.println();
		
		
		// 예시 1
		List<String> strList = new ArrayList<String>();
		
		strList.add("김길동");
		strList.add("이길동");
		strList.add("박길동");
		strList.add("홍길동");
		
		System.out.println("정렬 전 : " + strList);
		
		strList.sort(null);
		System.out.println("정렬 후 : " + strList);
		
		
		// 예시 2
		List<Book> bList = new ArrayList<Book>();
		
		bList.add(new Book("혼자 공부하는 자바", "신동권", "학습서", 30000));
		bList.add(new Book("쉽게 배우는 알고리즘", "문병로", "학습서", 23000));
		bList.add(new Book("혼자 공부하는 파이썬", "신동권", "학습서", 30000));
		bList.add(new Book("대화의 기술", "다니엘", "인문", 17500));
		
		System.out.println("정렬 전 : " + bList);
		
		// Book에는 여러 필드가 있는데 그 중에 어떤 필드를 기준으로 정렬할 것인지 정해지지 않아서 예외 발생
		// implements Comparable : 정렬을 사용하기 위해 상속받아야 함
		// bookList.sort(null);
		Collections.sort(bList);
		System.out.println("정렬 후(오름차순) : " + bList);
		
		bList.sort(Collections.reverseOrder());
		System.out.println("정렬 후(내림차순) : " + bList);
	}
}
