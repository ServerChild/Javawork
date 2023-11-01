package exception01;

import java.util.Arrays;

// ArrayIndexOutOfBoundsException : 배열에서 인덱스 범위를 초과했을 경우
public class ArrayIndexOutOfBounds03 {
	public static void main(String[] args) {
		String str[] = {"a", "b", "c", "d"};
		
		// 예외가 발생할 수 있는 경우
		try {
			str[5] = "d";
			// 예외 2 : System.out.println(str[5]);
		}
		
		// 예외가 발생했을 때 실행
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 넘었음. index는 " + (str.length - 1) + "까지만 사용가능");
			System.out.println(e);
		}
		System.out.println(Arrays.toString(str));
	}
}
