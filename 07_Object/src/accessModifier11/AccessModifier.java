package accessModifier11;

public class AccessModifier {
	// 접근 제한자(access modifier) : 클래스와 인터페이스 및 이들이 가진 멤버의 접근 제한
		// public : 외부 클래스가 자유롭게 사용 가능
		// protected : 같은 패키지 또는 자식 클래스에서 사용 가능
		// private : 외부에서 사용할 수 없음
		// default : 같은 패키지에 소속된 클래스에서만 사용 가능
	
	// 잔액
	private int balance;
	
	// 입금
	void deposit(int money) {
		balance += money;
	}
	
	// 출금
	void withdraw(int money) {
		if(balance < money) {
			System.out.println("잔액이 부족합니다.");
		}
		else balance -= money;
	}
	
	// getter(변수의 값을 얻어올 때)
	int getBalance() {
		return balance;
	}
	
	// setter(변수에 값을 넣을 때)
	void setBalance(int balance) {
		this.balance = balance;
	}
}
