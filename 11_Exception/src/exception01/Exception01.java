package exception01;

// 에러 : 하드웨어 관련 고장으로 인해 실행 오류가 발생하는 것
// 예외(Exception) : 프로그램 자체에서 발생하는 오류
//		-> 사용자의 잘못된 조작 또는 개발자의 잘못된 코딩으로 인해 발생하는 프로그램 오류
//		-> 예외 처리 프로그램 통해 정상 실행상태 유지 가능
// 일반 예외(exception) : 컴파일러 체크 예외 -> 자바 소스 컴파일 과정에서 해당 예외 처리 코드 있는지 검사
// 실행 예외(runtime exception) : 컴파일러 넌 체크 예외 -> 실행 시 예측할 수 없이 갑자기 발생
public class Exception01 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		// try {} : 예외가 발생할 수 있는 경우
		try {
			System.out.println(3);
			int result = 30 / 0;
			System.out.println(4);
		} 
		
		// catch(){} : 예외가 발생했을 때 실행
		catch(Exception e) {
			System.out.println(5);
		}
		
		System.out.println(6);
	}
}
