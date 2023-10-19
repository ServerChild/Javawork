package print02;

public class Ch02_printf_digit {
	public static void main(String[] args) {
		// 자릿수 맞춤
		System.out.printf("%7d\n", 32000);
		System.out.printf("%7d\n", 132000);
		System.out.printf("%7d\n\n", 7800);
		
		// 빈자리 0으로 채움
		System.out.printf("%07d\n", 32000);
		System.out.printf("%07d\n", 132000);
		System.out.printf("%07d\n", 7800);
		
		System.out.println("------------------");
		
		System.out.printf("[%10s]\n", "abcdefg"); // 오른쪽 정렬
		System.out.printf("[%-10s]\n", "abcdefg"); // 왼쪽 정렬(지정한 자릿 수만큼 차지)
		System.out.printf("[%s]\n", "abcdefg"); // 왼쪽 정렬(문자 자릿 수만큼만 차지)
		
		System.out.println("------------------");
		
		// 반올림하여 소수점 몇 번째 자리까지 -> %.(자릿수)f
		System.out.printf("%10.2f\n", 22.365);
		System.out.printf("%.3f\n", 22.36553856);
	}
}
