package exception01;

// NumberFormatException : 문자열에 숫자로 변환될 수 없는 문자가 포함되어 있는 경우
public class NumberFormat04 {
	public static void main(String[] args) {
		String strNum[] = {"23", "17", "12a", "3.141592"};
		int i = 0;
		
		// 예외가 발생할 수 있는 경우
		try {
			for(i = 0; i < strNum.length; i++) {
				int result = Integer.parseInt(strNum[i]);
				
				System.out.println("숫자로 변환된 값 : " + result);
			}
			
			/* 풀이 2
			 	// 향상된 for 문 : 배열을 처음부터 순서대로 출력
				for(String num : strNum) {
					int result = Integer.parseInt(num);
				
					System.out.println("숫자로 변환된 값 : " + result);
				}
			*/
			
		}
		
		// 예외가 발생했을 때 실행
		catch(NumberFormatException e) {
			System.out.println("'" + strNum[i] + "'는 숫자로 변경 불가");
		}
	}
}
