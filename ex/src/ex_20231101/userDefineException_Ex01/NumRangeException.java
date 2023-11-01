package ex_20231101.userDefineException_Ex01;

// 사용자 정의 예외
public class NumRangeException extends Exception {
	public NumRangeException() { }
	
	public NumRangeException(String message) {
		super(message);
	}
}
