package accessModifier11;

import ex02.Car;
// import objCar05.Car; -> ?????????(예시 1)

public class AccessModifierTest {
	public static void main(String[] args) {
		AccessModifier bank = new AccessModifier();
		
		// 입금
		bank.deposit(50000);
		System.out.println("현재 잔액 : " + bank.getBalance());
		
		// 출금
		bank.withdraw(30000);
		
		int balance = bank.getBalance();
		System.out.println("현재 잔액 : " + balance);
		
		/*
		// 예시 1. ????????
		Car car = new Car();
		
		System.out.println(car.getCompany());
		// System.out.println(car.company()); -> ??????
		*/
		
		// 예시 2. 다른 프로젝트에 있는 패키지 import
		Car car = new Car();
		
		car.getCompany();
	}
}
