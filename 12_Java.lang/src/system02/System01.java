package system02;

import java.util.Scanner;

public class System01 {
	public static void main(String[] args) {
		// 시간 잴 떄 사용 : System.currentTimeMillis(), System.nanoTime()
		long startTime = System.currentTimeMillis(); // Millis 단위
		long startNano = System.nanoTime(); // nano 단위
		
		for(int i = 1; i < 1000; i++) {
			System.out.print(i);
		}
		System.out.println();
		
		long endTime = System.currentTimeMillis();
		long endNano = System.nanoTime();
		
		// 출력 : System.out
		System.out.println(endTime - startTime);
		System.out.println(endNano - startNano);
		
		// 입력 : System.in
		Scanner sc = new Scanner(System.in);
	}
}
