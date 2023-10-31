package abs01;

// 추상 클래스 : 여러 클래스의 공통된 특성(필드, 메소드)를 추출해서 선언한 것
//   -> 추상 메소드(구현되지 않은 메소드)가 1개이상 포함되어 있음
//   -> 용도 : 실체 클래스의 설계 규격(객체 생성용 x)
//   -> abstract 키워드 : 상속 통해 자식 클래스만 만들 수 있게 만듬(부모 역할만 수행)
// 추상 메소드가 1개 이상 포함되어 있으면 반드시 추상 클래스로 만듬
public abstract class Pet {
	// 필드
	private String kind; // 종류
	private String color; // 색
	
	// 생성자
	Pet() { }
	
	Pet(String kind, String color) {
		this.kind = kind;
		this.color = color;
	}
	
	// 추상 메소드 : 선언부만 있고 실행부분이 없는 메소드
	// 메소드 선언만 통일하고 실행 내용은 실체 클래스마다 달라야 하는 경우
	// 하위 클래스는 반드시 재정의해서 실행 내용 채워야 함
	// 선언 : [public / protected] abstract 리턴타입 메소드이름(매개변수, ...);
	public abstract void sound(); // 울음소리
	
	public abstract void pattern(); // 특징
}
