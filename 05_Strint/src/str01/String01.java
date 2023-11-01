package str01;

public class String01 {
	public static void main(String[] args) {
		// 참조 타입 : 객체의 번지(주소)를 참조하는 타입
		// String 클래스
		/*
		   String 클래스 주요 메서드
		 	 - char charAt(index) : 해당 위치(index)에 있는 문자
		 	 - int length() : 문자열 길이
		 	 - boolean equals(String str) : 문자열의 내용 일치 여부
		 */
		String name = "홍길동";
		String hobby = "공부하기";
		
		System.out.println(name);
		System.out.println(name == hobby); // false
		
		
		// 주소 동일여부 물어봄, 주소가 동일함
		String str1 = "Java";
		String str2 = "Java";
		System.out.println(str1 == str2); // true
		
		String str5 = "홍길동";
		System.out.println(str5 == name); // true
		
		
		// 객체 생성, 주소가 각각 생성됨
		String str3 = new String("Java");
		String str4 = new String("Java");
		System.out.println(str3 == str4); // str3과 str4의 주소가 같은가? false
		System.out.println(str3.equals(str4)); // 값이 같은가? true
	}
}
