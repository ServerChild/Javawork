package objTv06;

public class TvTest {

	public static void main(String[] args) {
		Tv tv = new Tv();
		
		System.out.println("[ Tv 정보 ]");
		
		System.out.println("회사 : " + tv.company);
		System.out.println("모델 : " + tv.model);
		System.out.println("인치 : " + tv.inch);
		
		System.out.println();
		
		// tv 켜기
		tv.on();
		
		// 채널 이동
		System.out.println("현재 채널 : " + tv.chUp());
		System.out.println("현재 채널 : " + tv.chUp());
		System.out.println("현재 채널 : " + tv.chUp());
		System.out.println("현재 채널 : " + tv.chDown());
		System.out.println();
		
		// 볼륨 조절
		System.out.println("현재 볼륨 : " + tv.Vol(13));
		
		// tv 끄기
		tv.on();
	}

}
