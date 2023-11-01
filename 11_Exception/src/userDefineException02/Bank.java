package userDefineException02;

public class Bank {
	// 필드 : 잔액
	private int balance;
	
	// 입금
	public void deposit(int money) {
		balance += money;
	}
	
	// 출금
	public void withdraw(int money) throws UserException {
		if(balance < money)
			throw new UserException("[잔고 부족] " + (money - balance) + "원이 모자랍니다.");
		else
			balance -= money;
	}

	// 잔액 확인(getter)
	public int getBalance() {
		return balance;
	}
}
