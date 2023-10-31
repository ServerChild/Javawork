package interface02;

public class RemoteTest {
	public static void main(String[] args) {
		// 인터페이스는 객체 생성을 할 수 없음
		// 형변환 가능
		RemoteControl rc = null;
		
		// new를 한번 선언함으로써 같은 주소에 데이터 넣을 수 있음
		Audio rcAudio = new Audio(); 
		Tv rcTv = new Tv();
		
		
		// Audio
		rc = rcAudio; // rc = new Audio(); -> new 키워드를 쓸때마다 새로운 객체가 따로 생성
		
		rc.turnOn();
		rc.setVolume(-200);
		rc.turnOff();
		
		System.out.println();
		
		
		// Tv
		rc = new Tv(); // rc = rcTv;
		
		rc.turnOn();
		rc.setVolume(400);
		rc.turnOff();
		
		
		// 익명 객체(새로운 클래스 정의) : 일시적으로 한번만 사용하고 버려지는 객체
		// 단 한번만 사용할 때 만들어 사용
		Tv tv = new Tv() {
			// 인스턴스 변수 사용가능
			int a = 3;
			
			// 새롭게 만든 메소드 사용불가
			void tvShow() {
				System.out.println("익명객체 tvShow() 메소드");
			}
			
			// 메소드 재정의 사용가능
			@Override
			public void turnOn() {
				System.out.println("Tv를 켭니다.");
			}
		};
		
		System.out.println();
		
		// 인터페이스를 익명 객체로 만들 수 있음
		RemoteControl rc2 = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("익명 객체에서 라디오를 켬");
			}

			@Override
			public void turnOff() {
				System.out.println("익명 객체에서 라디오를 끔");
			}

			@Override
			public void setVolume(int volume) {
				if(volume > RemoteControl.MAX_VOLUME)
					volume = RemoteControl.MAX_VOLUME;
				
				else if(volume < RemoteControl.MIN_VOLUME)
					volume = RemoteControl.MIN_VOLUME;
				
				else
					volume = volume;
				
				System.out.println("익명 객체의 Radio 볼륨 : " + volume);
			}
		};
		rc2.turnOn();
		rc2.setVolume(30);
		rc2.turnOff();
	}
}
