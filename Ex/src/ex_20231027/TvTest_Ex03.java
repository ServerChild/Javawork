package ex_20231027;

public class TvTest_Ex03 {
	public static void main(String[] args) {
		AiTv_Ex03 ai = new AiTv_Ex03();
		
		
		ai.power();
		
		ai.setChannel(11);
		System.out.println("현재 채널 : " + ai.getChannel());
		
		System.out.println(ai.internet("java"));
		
		System.out.println(ai.genre("스릴러"));
		
		ai.setVolume(17);
		System.out.println("현재 볼륨 : " + ai.getVolume());
		
		ai.power();
	}
}
