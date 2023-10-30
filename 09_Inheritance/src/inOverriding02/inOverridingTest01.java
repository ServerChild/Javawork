package inOverriding02;

// 오버라이딩 : 상속에서 자식이 부모의 메소드의 원형은 그대로 하고 실행내용만 다르게 정의 
// 오버라이딩한 자식의 메소드가 호출됨 
class F {
	// 오버라이딩과 같은 메소드
	void show() {
		System.out.println("부모 클래스 show()메소드 호출");
	}
	
	void play(String title) {
		System.out.println("부모 클래스에서 " + title + "을 플레이합니다.");
	}
}

class G extends F {
	// 오버라이딩, 자신이 우선순위가 높아 지신에 있는 값을 호출
	@Override // 오버라이딩 어노테이션
	void show() {
		System.out.println("자식 클래스 show()메소드 호출");
	}
	
	// 오버로딩 : 매개변수의 갯수가 다르거나 자료형이 달라야 함
	void play(int a) {
		System.out.println("자식 클래스에서 " + a + "을 플레이합니다.");
	}
}

public class inOverridingTest01 {
	public static void main(String[] args) {
		G g = new G();
		
		g.show();
		g.play("영화");
		g.play(4);
	}
}
