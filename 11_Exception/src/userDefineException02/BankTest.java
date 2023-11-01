package userDefineException02;

public class BankTest {
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		// 입금
		bank.deposit(10000);
		System.out.println("현재 잔액 : " + bank.getBalance() + "원");
		
		// 출금
		try {
			bank.withdraw(9700);
			System.out.println("현재 잔액 : " + bank.getBalance() + "원");
		} catch (UserException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
