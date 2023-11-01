package exception01;

//throw 키워드 : 강제로 예외를 발생시킬 때 사용
public class Throw09 {
	public static void main(String[] args) {
		try {
			int num = 3 / 0;
			
			Exception e = new Exception("고의로 예외 발생시킴");
			throw e;
		}
		
		catch(Exception e) {
			// printStackTrace() : 예외 발생 시 메서드의 정보와 예외 메시지를 화면에 출력
			e.printStackTrace();
			
			// getMessage() : 발생한 예외클래스의 인스턴스에 저장된 메시지를 얻어옴
			System.out.println(e.getMessage());
			System.out.println("예외 발생");
		}
		
	}
}
