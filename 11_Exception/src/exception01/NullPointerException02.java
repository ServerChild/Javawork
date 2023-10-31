package exception01;

// NullPointerException : 객체 참조가 없는 상태
public class NullPointerException02 {
	public static void main(String[] args) {
		try {
			String str = null;
				
			System.out.println(str.toString());
			}
				
			catch(NullPointerException e) {
				System.out.println("데이터가 들어있지 않음");
				System.out.println(e);
			}
		
			System.out.println("끝까지 실행 완료");
	}
}
