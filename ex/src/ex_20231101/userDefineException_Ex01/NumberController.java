package ex_20231101.userDefineException_Ex01;

public class NumberController {
	private int num1;
	private int num2;
	
	public NumberController() { }
	
	public boolean checkDouble(int num1, int num2) throws NumRangeException {
		// 입력받은 두 정수 중에 하나라도 1 ~ 100 사이의 정수가 아닐 때 예외처리 
		if(num1 < 1 || num1 > 100 || num2 < 1 || num2 > 100) {
			throw new NumRangeException("1 ~ 100 사이값만 입력할 수 있음");
		}
		
		// num1이 num2의 배수(나눴을 때 나머지 0)
		 else if(num1 % num2 == 0) {
			return true;
		}
		
		// 배수가 아니라면
		return false;
	}
	
}
