// 실행용
package polymorphism06;

public class CarTest {
	public static void main(String[] args) {
		Car car = null; // 저장공간만
		FireCar fc1 = new FireCar("K9", "Black"); // 객체 생성
		
		fc1.getPower();
		fc1.water();
		fc1.speedUp();
		System.out.println(fc1.information());
		
		FireCar fc2 = new FireCar();
		System.out.println(fc2.information());
		
		System.out.println();
		
		
		// 다형성 : 호출은 같은 이름이지만 어떤 객체가 있느냐에 따라 값이 달라짐
		// 자동형변환 : 자손타입 -> 부모타입으로 형변환
		car = fc1;
		System.out.println(car.information());
		
		car = fc2;
		System.out.println(car.information());
		
		
		// 강제형변환 : 부모타입 -> 자손타입으로 형변환
		// 안 쓰던 공간인(FireCar)을 다시 쓰겠다
		FireCar fc3 = null;
		fc3 = (FireCar)car; // 자식타입으로 객체 생성 -> Car 타입으로 형변환 -> 자식타입으로 형변환
		
		/* 강제형변환 o : firecar 타입의 객체를 생성하면 car 객체도 같이 생성함, 형변환을 하여 car 객체만 사용하겠다고 선언한 후 다시 firecar를 사용하겠다고 형변환한 경우
		  	FireCar fc = new FireCar();
		  	Car car = fc;
		  	fc = (FireCar)car;
		 */
		
		
		Car car2 = new Car();
		// 형변환 불가
		// fc2 = (FireCar)car2; -> Car타입으로 생성(car 객체), 자식객체로 변환(자식객체, car 객체) 불가
		
		/* 강제형변환 x : Car 타입을 가진 객체를 생성하면 FireCar 타입의 객체는 생성 안하므로 없는 firecar 타입으로 강제 형변환한 경우
		  	Car car2 = new Car();
		  	FireCar fc2 = (FireCar)car2;
		 */
	}
}
