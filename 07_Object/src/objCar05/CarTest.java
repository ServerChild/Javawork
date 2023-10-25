package objCar05;

public class CarTest {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("[ 내 차 정보 ]");
		
		System.out.println("회사 : " + car1.company);
		
		System.out.println("모델 : " + car1.model);
		
		System.out.println("색 : " + car1.color);
		
		System.out.println("최고 속도 : " + car1.MAX_SPEED);
		
		/*
		   car1.run // 변수
		   car1.run() // 메소드
		*/	
		
		System.out.println();
		car1.run();
		
		/*
		System.out.println("현재 속도 : " + car1.speedUp());
		System.out.println("현재 속도 : " + car1.speedUp());
		System.out.println("현재 속도 : " + car1.speedDown());
		*/
		
		System.out.println("현재 속도 : " + car1.speedUp(30));
		System.out.println("현재 속도 : " + car1.speedUp(50));
		System.out.println("현재 속도 : " + car1.speedDown(20));
		
		car1.run();
	}
}
