package objCar05;

public class Car {
	// 필드
	String company = "현대 자동차";
	String model = "그랜저";
	String color = "검정";
	final int MAX_SPEED = 350;
	int speed; // 0
	boolean run; // false
	
	// 메소드
	
	// 시동 유무
	void run() {
		run = !run;
		if(run)
			System.out.println("출발합니다. 부릉-");
		else
			System.out.println("운행을 멈춥니다. 끼익-");
	}
		
	/*
	// 속도 올림
	int speedUp() {
		++speed;
		return speed;
	}
		
	// 속도 내림
	int speedDown() {
		--speed;
		return speed;
	}
	*/
	
	int speedUp(int speed) {
		this.speed = speed;
		return this.speed;
	}
	
	int speedDown(int speed) {
		this.speed = speed;
		return this.speed;
	}
}
