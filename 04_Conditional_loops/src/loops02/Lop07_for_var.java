package loops02;

public class Lop07_for_var {
	public static void main(String[] args) {
		// 자료형이 같은 여러 변수 선언(같은 자료형일때만 가능)
		int num, num1, num2;
		num = num1 = num2 = 10;
		
		int num3 = 8, num4 = 9, num5 = 20;
		
		// for문에 여러개의 변수 사용 o
		// 주의! 변수가 여러개여도 조건식은 반드시 변수가 하나만 들어가야 함
		for(int i = 0, j = 20; i <= 10; i++, j--) {
			System.out.println("i = " + i + ", j = " + j);
		}
		
		for(int i = 0, j = 20, z = 30; j >= 10; i++, j--, z+=2) {
			System.out.println("i = " + i + ", j = " + j + ", z = " + z);
		}
		
		// while(true) 한 것과 동일
		// 초기식, 조건식, 증감식 없음
		for(;;) {
			System.out.println(num++);
			
			if(num == 15)
				break;
		}
		
		// 원하는 부분에서 반복문을 빠져나오고 싶을 때, 이름을 붙여서 사용
		loop : for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
				
				if(j == 5)
					break loop;
			}
			System.out.println();
		}
		System.out.println("구구단 종료");
		
		outter : for(int i = 2; i <= 9; i++) {
			mid : for(int j = 1; j <= 9; j++) {
				for(int z = 1; z <= 5; z++) {
					System.out.println(i + " , " + j + " , " + z);
				
					if(z == 3)
						break mid;
				}
			}
			System.out.println("mid for문 종료");
		}
		System.out.println("outter for문 종료");
	}
}
