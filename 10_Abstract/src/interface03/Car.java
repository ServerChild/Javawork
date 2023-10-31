package interface03;

public class Car {
	Tire frontLeftTire = new HankookTire(); // 앞왼
	Tire frontRightTire = new HankookTire(); // 앞오
	Tire backLeftTire = new HankookTire(); // 뒤왼
	Tire backRightTire = new HankookTire(); // 뒤오
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
