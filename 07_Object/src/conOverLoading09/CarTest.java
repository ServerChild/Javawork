package conOverLoading09;

import java.util.Scanner;

public class CarTest {
	public static void main(String[] args) {
		Car car1 = new Car("기아", "K7", "파랑");
		System.out.println(car1.company);
		System.out.println(car1.model);
		System.out.println(car1.color);
		
		System.out.println();
		
		Car car2 = new Car("현대", "H8", "노랑");
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println(car2.color);
		
		System.out.println();
		
		// 오버로딩
		Car car3 = new Car();
		Car car4 = new Car("삼성", "sm7", "흰색");
		Car car5 = new Car("벤츠");
		Car car6 = new Car("람보르기니", "머스탱");
		
		// 매개변수를 적어도 1개는 넣어야 함(비어놓을 수 없음)
		Scanner sc = new Scanner(System.in);
	}
}
