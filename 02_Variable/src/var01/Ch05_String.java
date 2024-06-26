package var01;

public class Ch05_String {
	public static void main(String[] args) {
		// 참조 자료형 : String
		// "" : 문자열
		String str1 = "3강의실";
		String str2 = "엘라스틱 서치 빅데이터";
		
		System.out.println(str1);
		
		// escape sequence(이스케이프 문자)
		/*
		 	\ + 문자 조합으로 특수 기능 수행
		 	\n : 줄바꿈
		 	\t : 탭(tab)만큼 띄우기
		 	\" : 쌍따옴표(") 출력
		 	\\ : 역슬래시(\) 출력
		 	%% : 퍼센트(%) 출력
		*/
		
		System.out.println("강의실 : 3강의실\n강좌명 : 엘라스틱서치");
		System.out.println("강의실 : 3강의실\t강좌명 : 엘라스틱서치");
		System.out.println("강의실 : \"3강의실\" \t 강좌명 : \"엘라스틱서치\"");
		System.out.println("강의실 : 3강의실 \t \\ \t강좌명 : 엘라스틱서치");
	}
}
