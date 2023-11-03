package string03;

import java.util.Arrays;

public class String01 {
	public static void main(String[] args) {
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		// 배열에 있는 값을 String형으로 출력
		String str = new String(bytes);
		System.out.println(str);
		
		
		// 시작 index 번호부터 글자 개수만큼 출력 : String(문자열 객체명, 시작 index번호, 츨력할 글자 갯수)
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
		
		
		// 해당 index 번호 문자 추출 : 문자열 객체명.charAt(index 번호)
		String str3 = "abcdefg";
		char ch = str3.charAt(3);
		System.out.println(ch);
		
		
		// 대문자로 변환 : 문자열 객체명.toUpperCase()
		String upperCase = str3.toUpperCase();
		System.out.println(upperCase);
		
		
		// 찾는 문자(열)에 해당하는 인덱스 출력 : 문자열 객체명.indexOf(찾을 문자(열))
		int indexCD = str3.indexOf("cd");
		int indexD = str3.indexOf('d');
		System.out.println(indexCD);
		System.out.println(indexD);
		
		// 해당 문자열 유무 : 문자열 객체명.indexOf(찾을 문자(열))
		// 1(true), -1(false)
		String bookName = "자바 프로그램";
		
		if(bookName.indexOf("자바") > -1)
			System.out.println("자바 책 입니다.");
		else
			System.out.println("자바 책이 아닙니다.");
		
		
		// concat(String) : 2개의 문자열 연결
		String str4 = "java";
		String str5 = str4.concat(" Programming");
		String str6 = str4 + " Programming";
		System.out.println(str5);
		
		
		// contains(charSequence s) : 글자가 포함되어 있는지 확인
		// 포함되어 있으면 true, 포함되어 있지 않으면 false
		boolean re = str6.contains("java");
		System.out.println(re);
		
		
		// replace(char Old, char New) : old 문자를 new 문자로 바꿔서 출력
		System.out.println(str5.replace('a', 'e'));
		
		
		// split(String regex) : regex를 기준으로 나눠서 배열로 반환
		String str7 = "Cat/Dog/Hamster/Bear";
		String[] strArr = str7.split("/");
		System.out.println(Arrays.toString(strArr));
		System.out.println(strArr[1]);
		
		// split(String regex, int limit) : regex를 기준으로 limit(갯수)만큼 나눠서 배열로 반환
		String[] strArr2 = str7.split("/", 2);
		System.out.println(Arrays.toString(strArr2));
		System.out.println(strArr2[1]);
		
		
		// substring(int index) : index를 기준으로 끝까지 가져와서 문자열 반환
		String str8 = "JavaOracleSpringBoot";
		System.out.println(str8.substring(4));
		
		// substring(int startIndex, int endIndex) : startIndex를 기준으로 endIndex까지의 글자를 가져와 문자열 반환
		// endIndex 바로 직전까지 얻어옴 = endIndex는 포함하지 않음
		System.out.println(str8.substring(4, 10));
	}
}
