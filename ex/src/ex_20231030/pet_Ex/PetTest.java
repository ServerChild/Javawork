package ex_20231030.pet_Ex;

public class PetTest {
	public static void main(String[] args) {
		// 예제 1. 강아지
		Pet pet = new Dog("흰색");
		
		pet.sound();
		pet.pattern();
		
		// 필드가 private가 아닌 경우 직접 가져올 수 있음(권장하는 방법 x)
		// System.out.println(pet.kind);
		
		// getter 출력(변수에 저장 후 출력 or 바로 출력)
		System.out.println(pet.getKind());
		
		// 반환타입이 없기때문에 호출만 가능
		pet.getColor(); 
		pet.information();
		
		// toString() 호출 : 주소 호출이 toString에 정의되어 있기 때문에
		System.out.println(pet);
		
		
		System.out.println();
		
		
		// 예제 2. 개구리
		pet = new Frog();
		
		pet.sound();
		pet.pattern();
		
		System.out.println(pet);
	}
}
