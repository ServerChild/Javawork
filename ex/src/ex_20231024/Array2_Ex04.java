package ex_20231024;

public class Array2_Ex04 {
	public static void main(String[] args) {
		// 배열(Array) - 2차원
		// 2차원 배열에 각 학생(5명)별 점수를 입력 -> 행(학생)
		// 국어, 영어, 수학 -> 열(과목)
		/* 출력  
		 	번호	국어	영어	수학	총점	평균
		  -------------------------
		   	 1	97 100 78 273 83.3
		   	 2	97 100 78 273 83.3
		   	 3  97 100 78 273 83.3
		   	 4  97 100 78 273 83.3
		   	 5  97 100 78 273 83.3
		  -------------------------
		  총점 479 500 387
		  평균 97.0 100.0 78.3
		 */
		int score[][] = {{95, 100, 78}, 
						 {90, 80, 70}, 
						 {96, 100, 54}, 
						 {46, 57, 95}, 
						 {85, 35, 84}};
		
		System.out.println("번호	국어	영어	수학	총점	평균");
		System.out.println("---------------------------------------------");
		int KorSum = 0;
		int EngSum = 0;
		int MathSum = 0;
		double KorAvg = 0;
		double EngAvg = 0;
		double MathAvg = 0; 
		
		for(int i = 0; i < score.length; i++) {
			int sum = 0;

			// 각 과목별 총점
			KorSum += score[i][0];
			EngSum += score[i][1];
			MathSum += score[i][2];
			
			// 각 과목별 평균
			KorAvg = (double)KorSum / 5;
			EngAvg = (double)EngSum / 5;
			MathAvg = (double)MathSum / 5;
			
			System.out.print(i + 1 + "\t"); // 번호 출력

			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.print(score[i][j] + "\t");
			}
			System.out.print(sum + "\t");
			
			double avg = (double)sum / score.length;
			
			System.out.printf("%.1f", avg);
			System.out.println("\n");
			// System.out.printf("%d\t%.1f\n", sum, avg);
		}
		
		System.out.println("---------------------------------------------");
		
		System.out.print("총점\t" + KorSum + "\t" + EngSum + "\t" + MathSum + "\n");
		
		System.out.printf("%s\t%.1f\t%.1f\t%.1f\t","평균",KorAvg, EngAvg, MathAvg);
	}
}
