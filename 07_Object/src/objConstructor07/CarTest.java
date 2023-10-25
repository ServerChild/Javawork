package objConstructor07;

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
	}
}
