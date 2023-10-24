package array01;

public class Array_Ex03 {
	public static void main(String[] args) {
		int score[] = {100, 91, 58, 85, 77};
		// 예시 1. 총점, 평균 구하기
		// 점수 합계
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println("점수 합계 : " + sum);
		
		// 점수 평균
		double avg = (double)sum / score.length;
		
		System.out.printf("점수 평균 : %.2f\n", avg);
		System.out.println();
		
		// 예시 2. 최대값, 최소값 구하기
		int num[] = {45, 5, 77, 2, 40, 35, 99};
		
		// 최대값, 최소값
		int max = num[0];
		int min = num[0];
		
		for(int i = 1; i < num.length; i++) {
			if(max < num[i]) max = num[i];
			
			if(min > num[i]) min = num[i];
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println();
		
		// 인덱스(index) 번호에 연산 가능
		int k = 3;
		System.out.println(num[0+k]);
		System.out.println(num[0+5]);
		System.out.println(num[2*3]);
	}
}
