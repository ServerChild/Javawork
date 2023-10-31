package interface03;

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		System.out.println();
		
		myCar.backLeftTire = new KumhoTire();
		myCar.run();
	}
}
