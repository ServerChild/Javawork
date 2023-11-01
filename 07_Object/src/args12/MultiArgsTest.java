package args12;

public class MultiArgsTest {
	public static void main(String[] args) {
		// 다중 인수 : 여러개의 인수(자료형... 변수명)
		// MultiArgsTest mt = new MultiArgsTest();
		// String str = mt.concatenate("", "", "", "");
		String str = concatenate("a", "b", "c");
		System.out.println(str);
		
		
		// 문자열을 이어서 출력하는 메소드 출력
		String strArr[] = {"홍길동", "아무개", "이순신"};
		System.out.println(concatenate(strArr));
		
		
		// 문자열과 부호를 연결하는 메소드 출력
		System.out.println(con2("-", "홍길동", "아무개", "이순신"));
		System.out.println(con2("/", new String[]{"1", "2", "3"}));
		
		
		// 합계를 구하는 메소드 출력
		// 합계 : 숫자가 몇 개가 들어올지 모름
		System.out.println(sum(10, 5, 2, 1));
		System.out.println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
	}
	
	
	/*	인스턴스 메소드
	 	String concatenate(String i, String a, String b, String c) {
			String result = "";
			result = i + a + b + c;
			
			return result;
		}
	*/
	
	
	// 문자열을 이어서 출력하는 메소드 구현
	// 다중값이 들어올때 하나는 적고, 다른 값은 '자료타입... 변수명'을 이용해 넣어준다(... -> 배열로 값이 들어옴)
	static String concatenate(String... a) {
		String result = "";

		for(String str : a) {
			result += str + " ";
		}
		return result;
	}

	
	// 문자열과 부호를 연결하는 메소드 구현
	static String con2(String delim, String... b) {
		String result = "";
		
		for(String str : b) {
			result += str + delim;
		}
		
		return result;
	}
	
	
	// 합계를 구하는 메소드 구현
	static int sum(int... a) {
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}
	
}
