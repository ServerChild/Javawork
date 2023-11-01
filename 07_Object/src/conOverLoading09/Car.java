package conOverLoading09;

public class Car {
	// 생성자 오버로딩
	String company;
	String model;
	String color;
	int speed;
	
	
	// 오버로딩 - 매개변수 없음
	// this() : 다른 생성자 호출(매개변수의 갯수와 자료형이 같은 생성자를 찾아감)
	Car() {
		this("삼성", "sm7", "흰색"); // 무조건 첫번째 줄에 입력
		System.out.println("매개변수가 없는 생성자");
	}

	
	// 오버로딩2 - 매개변수 1개
	Car(String company) {
		this(company, "sm7", "흰색");
		System.out.println("매개변수 1개");
		// 매개변수 3개에서 이미 company 값을 넣었기때문에 중복으로 넣어줄 필요가 없음
		// this.company = company;
	}
	
	
	// 오버로딩3 - 매개변수 2개
	Car(String company, String model) {
		this(company, model, "흰색");
		System.out.println("매개변수 2개");
		// 동일한 이유로 company, model에 대한 'this.'이 필요없음
	}
	
	
	// 생성자 - 매개변수 3개
	Car(String company, String model, String color) {
		System.out.println("매개변수 3개");
		this.company = company;
		this.model = model;
		this.color = color;
	}
}
