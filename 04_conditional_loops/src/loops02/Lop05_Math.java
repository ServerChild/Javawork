package loops02;

public class Lop05_Math {
	public static void main(String[] args) {
		// Math(수학에 관련된 클래스)
		double rand1 = Math.random(); // 랜덤함수 : 실수형(0 ~ 0.9999999999)
		System.out.println(rand1);
		
		System.out.println("====================");
		
		double rand2 = Math.random() * 10; // 0 ~ 9.9999999999
		System.out.println(rand2);
		
		
		int reRand2 = (int)rand2; // 0 ~ 9(소수점 이하 버림)
		System.out.println(reRand2);
		
		
		// 1 ~ 10까지의 숫자를 얻고자 한다면
		int re2Rand2 = (int)rand2 + 1; // 1 ~ 10
		System.out.println(re2Rand2);
		
		System.out.println("====================");
		
		// 0 ~ 4까지의 숫자를 얻고자 한다면
		double rand3 = Math.random() * 5; // 0 ~ 4.9999999999
		System.out.println(rand3);
		
		int reRand3 = (int)rand3; // 0 ~ 4
		System.out.println(reRand3);
		
		int re2Rand3 = (int)rand3 + 1; // 1 ~ 5
		System.out.println(re2Rand3);	
		
		System.out.println("====================");
		
		double rand4 = Math.random() * 100; // 0 ~ 99.9999999999
		System.out.println(rand4);
	}
}
