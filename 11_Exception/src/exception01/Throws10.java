package exception01;

// throws 키워드 : 메소드에서 처리되지 않은 예외를 호출한 곳으로 넘기는 역할(예외 떠넘기기)
// 	-> 메소드 선언부 끝에 작성
//	-> throws 키워드 뒤에 예외클래스를 ,(쉼표)로 구분해서 나열
//	-> 1 ~ 2개의 예외처리라면 예외클래스를 나열해서 작성, 여러개라면 Exception 클래스로 작성
public class Throws10 {
	public static void main(String[] args) {
		try {
			change();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 없음");
		}
	}
	
	// 형식 1 : 리턴타입 메소드이름(매개변수, ...) throws 예외클래스1, 예외클래스2, ... { }
	// 형식 2 : 리턴타입 메소드이름(매개변수, ...) throws Exception { }
	public static void change() throws ClassNotFoundException {
		Class class01 = Class.forName("java.lang.String");
	}
}