package var01;

public class Ch03_char {

	public static void main(String[] args) {
		// 문자형, char 은 유니코드를 사용
		// '' : 글자 하나
		char ch1 = 'a';
		char ch2 = '허';
		char ch3 = '*';
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		char ch4 = 'A' + 1; // 아스키 코드 A(65)
		System.out.println(ch4);
		
		System.out.println("-----------");
		
		char ch6 = 'A' + '1'; // 유니코드 : 65(A) + 49(1) = 114(r) (아스키 코드에서 아스키 코드 값의 합에 해당하는 값 출력)
		System.out.println(ch6);
	}

}
