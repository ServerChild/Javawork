package objConstructor07;

public class Tv {
	String company;
	String model;
	String inch;
	int vol;
	int ch;
	boolean on;
	
	Tv(String company, String model, String inch){
		this.company = company;
		this.model = model;
		this.inch = inch;
	}
	
	
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
	
	
	// 채널 바꾸기(랜덤)
	int chChage() {
		ch = (int)(Math.random() * 100) + 1;
		return ch;
	}
	
	
	// 볼륨 바꾸기, 매개변수 o
	int Vol(int vol) {
		this.vol = vol;
		return this.vol;
	}
}
