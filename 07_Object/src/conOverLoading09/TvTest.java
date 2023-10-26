package conOverLoading09;

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
		
		System.out.println();
		
		Tv tv3 = new Tv("LG", "고급 TV", "100인치");
		System.out.println(tv3.company);
		System.out.println(tv3.model);
		System.out.println(tv3.inch);
		
		System.out.println();
		
		// tv1 켜기
		tv1.on();
				
		// 채널 이동
		System.out.println("1번 TV 현재 채널 : " + tv1.chUp());
		System.out.println("1번 TV 현재 채널 : " + tv1.chUp());
		System.out.println("1번 TV 현재 채널 : " + tv1.chChage());
		System.out.println("1번 TV 현재 채널 : " + tv1.chDown());
		System.out.println();
		
		// 볼륨 조절
		System.out.println("1번 TV 현재 볼륨 : " + tv1.Vol(13));
				
		// tv1 끄기
		tv1.on();
		
		System.out.println();
		
		tv2.on();
		
		System.out.println("2번 TV 현재 채널 : " + tv2.chChage());
		System.out.println("2번 TV 현재 채널 : " + tv2.chChage());
		
		tv2.on();
	}
}
