package objTv06;

public class Tv {
	// 필드
	String company = "삼성";
	String model = "아날로그 TV";
	String inch = "50인치";
	int vol;
	int ch;
	boolean on;
	
	// 메소드
	
	// Tv 키거나 끄기
	void on() {
		on = !on;
		if(on)
			System.out.println("Tv를 켭니다.");
		else
			System.out.println("Tv를 끕니다.");
	}
	
	// 채널 올리기(2채널씩 올리기), 매개변수 x
	int chUp() {
		ch += 2;
		return ch;
	}
	
	// 채널 내리기(2채널씩 내리기), 매개변수 x
	int chDown() {
		ch -= 2;
		return ch;
	}
	
	// 볼륨 바꾸기, 매개변수 o
	int Vol(int vol) {
		this.vol = vol;
		return this.vol;
	}
}
