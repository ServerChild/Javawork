package objConstructor07;

public class Car {
	// 생성자(constructor) : 클래스로부터 new 연산자로 객체를 생성할 때 호출되어 객체의 초기화 당담
	// 생성자 선언 : 클래스(매개변수 선언, ...) { 객체 초기화 코드 }
	// 클래스 이름과 동일한 이름으로 선언, 반환형 없음
	// 매개변수는 속성에 들어갈 값을 넣음 -> 변수
	String company;
	String model;
	String color;
	int speed;
	
	// 생성자
	Car(String company, String model, String color) {
		System.out.println("생성자 호출");
		// 클래스변수와 지역변수가 동일한 이름일때는
		// '.this'를 붙임으로써 이 변수가 클래스변수를 가르킴을 표시함
		this.company = company;
		this.model = model;
		this.color = color;
	}
	
	
}
