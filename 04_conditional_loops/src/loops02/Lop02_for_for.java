package loops02;

public class Lop02_for_for {
	public static void main(String[] args) {
		// 중첩 for 문
		// 지역변수는 for 문이 끝나면 stack 에서 사라지기 때문에 사용할 수 없음
		// 안쪽에 있는 for 문이 더 많이 돔
		for(int i = 1; i <= 3; i++) {
			for(int j = 5; j <= 10; j++) {
				System.out.println("i = " + i + ", " + "j = " + j);
			}
			System.out.println();
		}
		
		// 구구단 출력(세로)
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				// System.out.println(i + "*" + j + "=" + i * j);
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
			System.out.println();
		}
		
		//구구단 출력(가로)
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %d\t", j, i, i * j);
			}
			System.out.println();
		}
		
	}
}
