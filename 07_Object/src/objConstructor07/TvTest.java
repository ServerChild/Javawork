package objConstructor07;

public class TvTest {
	public static void main(String[] args) {
		Tv tv1 = new Tv("삼성", "아날로그 TV", "45인치");
		
		System.out.println(tv1.company);
		System.out.println(tv1.model);
		System.out.println(tv1.inch);
		
		System.out.println();
		
		Tv tv2 = new Tv("LG", "디지털 TV", "50인치");
		
		System.out.println(tv2.company);
		System.out.println(tv2.model);
		System.out.println(tv2.inch);
	}
}
