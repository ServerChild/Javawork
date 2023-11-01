package abs01;

public class PetTest {
	public static void main(String[] args) {
		// 추상 클래스는 객체를 생성할 수 없음
		// Pet pet = new Pet("강아지", "흰색");
		Dog dog = new Dog("검정");
		
		
		// 형변환 가능 -> 자식 객체를 부모 객체로
		Pet pet = new Dog("갈색");
		
		dog.sound();
	}
}
