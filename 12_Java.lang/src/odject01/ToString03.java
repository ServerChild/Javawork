package odject01;

import java.util.Date;

class Card {
	// 필드
	String kind; // 카드 종류
	int number; // 카드 번호
	
	// 생성자
	Card() {
		this("SPADE", 1);
	}
	
	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	// 오버라이딩
	@Override
	public String toString() {
		return "카드 종류는 " + kind + ", 카드 번호는 " + number;
	}
}


public class ToString03 {
	public static void main(String[] args) {
		// toString() 메서드 : 객체 자신의 정보를 문자열로 반환
		// 구성 : 패키지이름.클래스이름@16진수해시코드
		
		Card c1 = new Card();
		Card c2 = new Card("HEART", 10);
		
		System.out.println(c1);
		System.out.println(c2);
		
		
		// String, Date 클래스는 toString() 오버라이딩이 되어있음
		String str = new String("Korea");
		Date today = new Date();
		
		System.out.println(str);
		System.out.println(today);
	}
}
