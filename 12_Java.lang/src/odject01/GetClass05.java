package odject01;


public class GetClass05 {
	public static void main(String[] args) {
		// getClass() 메서드 : 객체 자신의 클래스 정보를 담고 있는 Class 인스턴스 반환
		Card c1 = new Card("HEART", 10);
		
		
		// Class의 객체를 얻어옴, 재정의한 것은 가져오지 않음
		Class cObj = new Card().getClass();
		Class cObj2 = c1.getClass();
		
		// Class의 클래스 이름을 얻어옴
		try {
			Class cObj3 = Card.class.forName("Card");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		
		System.out.println(c1);
		System.out.println(cObj.getName());
		System.out.println(cObj.toString());
	}
}
