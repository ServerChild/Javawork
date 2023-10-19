package print01;

public class Ch02_println_String {
	public static void main(String[] args) {
		System.out.println("문자열 " + "두번째 문자열");
		
		// 문자열이 먼저 나오면 그 뒤는 모두 문자열로 인식
		System.out.println("문자열 " + 10 + 20);
		
		// 숫자로 시작하면 문자열이 나오기 전까지 숫자로 인식
		System.out.println(10 + 20 + " 문자열");
		
		// 앞 숫자는 연산된 결과, 뒷 숫자는 문자열로 출력
		System.out.println(10 + 20 + "문자열" + 10 + 20);
		
		// 뒷 숫자를 연산된 결과로 출력할 시에는 ()로 연산을 묶음
		System.out.println(10 + 20 + "문자열" + (10 + 20));
	}
}
