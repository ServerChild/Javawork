package print01;

public class Ch01_print_println {
	public static void main(String[] args) {
		// 한 줄 주석
		// - 주석은 컴파일하지 않음
		// - 실행되지 않음
		// - 설명, 날짜, 누가 만들었는지, 중요한 메서드에 대한 설명
		// - 단축키 : ctrl +  / (토글)
		
		/* 
		  여러 줄 주석
		   - 이 안의 모든 글씨는 주석임	 
		   - 단축키 : ctrl + shitf + /
		   - 해제단축키 : ctrl + shift + \(원표시)
		*/
		
		// println : 줄바꿈
		System.out.println("허수연"); 
		System.out.println("과정명 : 엘라스틱서치 로그 빅데이터 분석 및 시각화 개발자 양성과정");
		
		System.out.println(10+30); // 연산된 결과로 출력, 숫자는 쌍따옴표 사용 x
		System.out.println("10+30"); // 문자열로 인식
		
		//print : 줄바꿈 하지 않음
		System.out.print("줄바꿈 안함");
		System.out.print("강의실 : 3강의실");
	}
}
