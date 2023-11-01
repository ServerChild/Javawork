package exception01;


public class Finally07 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		// try { 예외 발생 가능 코드 } : 예외가 발생할 수 있는 경우
		try {
			System.out.println(3);
			int result = 30 / 0;
			System.out.println(4);
			// return; -> 메소드가 void 형일때 사용 가능 = 메소드를 종료 
		} 
		
		// catch(예외클래스 e){ 예외 처리 } : 예외가 발생했을 때 실행
		catch(Exception e) {
			System.out.println(5);
		}
		
		// finally { 항상 실행 } : 항상 실행
		// try 구문 안에 return문 유무에 따라 다름(return문이 있을 때 finally{} 블록 실행 o)
		finally {
			// 실행되지 않는 경우 없음
			System.out.println(6);
		}
		// try 구문 안에 return이 있으면 실행되지 않음
		System.out.println(7);
	}
}
