package loops02;

public class Lop02_for_for {
	public static void main(String[] args) {
		// 중첩 for 문
		for(int i = 1; i <= 3; i++) {
			for(int j = 5; j <= 10; j++) {
				System.out.println("i = " + i + ", " + "j = " + j);
			}
			System.out.println();
		}
		
	}
}
