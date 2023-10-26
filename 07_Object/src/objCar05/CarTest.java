package objCar05;

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car();
		Car fCar = new Car();
		
		fCar.company = "기아자동차";
		fCar.model = "K5";
		fCar.color = "흰색";
		
		System.out.println("[ 내 차 정보 ]");
		System.out.println("회사 : " + myCar.company);
		System.out.println("모델 : " + myCar.model);
		System.out.println("색 : " + myCar.color);
		System.out.println("최고 속도 : " + myCar.MAX_SPEED);
		System.out.println();
		
		System.out.println("[ 친구 차 정보 ]");
		System.out.println("회사 : " + fCar.company);
		System.out.println("모델 : " + fCar.model);
		System.out.println("색 : " + fCar.color);
		System.out.println("최고 속도 : " + fCar.MAX_SPEED);
		
		/*
		   myCar.run // 변수
		   myCar.run() // 메소드
		*/	
		
		System.out.println();
		System.out.print("내차가 ");
		myCar.run();
		
		/*
		System.out.println("내차의 현재 속도 : " + myCar.speedUp());
		System.out.println("내차의 현재 속도 : " + myCar.speedUp());
		System.out.println("내차의 현재 속도 : " + myCar.speedDown());
		*/
		
		System.out.println("내차의 현재 속도 : " + myCar.speedUp(30));
		System.out.println("내차의 현재 속도 : " + myCar.speedUp(50));
		System.out.println("내차의 현재 속도 : " + myCar.speedDown(20));
		
		System.out.print("내차를 ");
		myCar.run();
		
		System.out.println();
		
		System.out.print("친구차가 ");
		fCar.run();
		
		System.out.println("친구차의 현재 속도 : " + fCar.speed);
		System.out.println("친구차의 현재 속도 : " + fCar.speedUp(40));
		System.out.println("친구차의 현재 속도 : " + fCar.speedDown(30));
		System.out.println("친구차의 현재 속도 : " + fCar.speedDown(10));
		
		System.out.print("친구차가 ");
		fCar.run();
		
	}
}
