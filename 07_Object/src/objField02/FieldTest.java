package objField02;

public class FieldTest {
	public static void main(String[] args) {
		// 예시 1
		Car car1 = new Car();
		
		// 변수 선언 후 출력
		String company = car1.company;
		System.out.println("car1 회사명 : " + company);
		
		// 바로 출력
		System.out.println("car1 모델명 : " + car1.model);
		
		// 값 변경 후 출력
		car1.model = "SM9";
		System.out.println("car1 모델명 : " + car1.model);
		
		// car1.MAX_SPEED = 500; -> 상수는 한번 값을 넣으면 변경할 수 없음
		car1.maxSpeed = 500;
		
		System.out.println("--------------------");
		
		
		// 예시 2
		Car car2 = new Car();
		System.out.println("car2 회사명 : " + car2.company);
		
		System.out.println("car2 모델명 : " + car2.model);
	}
}
