package userDefineException02;

// 사용자 정의 예외
public class UserException extends Exception {
	public UserException() { }
	
	public UserException(String message) {
		super(message);
	}
}
