package exception01;

// ClassCastException : 상속을 받았을 때 클래스 형변환을 할 수 없는 경우
public class ClassCastException05_1 {
	public static void main(String[] args) {
		// 메소드 2. if 문
		ClassCastException05_1.changeIf(new Animal()); // 변환할 수 없음 -> ? Animal 로 만들었기 때문에
		ClassCastException05_1.changeIf(new Dog()); // Dog 클래스로 형변환
		
		// 메소드 1. try - catch 문
		ClassCastException05_1.changeTry(new Animal()); // 변환할 수 없음
		ClassCastException05_1.changeTry(new Dog()); // Dog 클래스로 형변환
	}
	
	// Dog 클래스만 사용
	// 메소드 1. try - catch 문 사용
	public static void changeTry(Animal ani) {
		// 예외가 발생할 수 있는 경우
		try {
			Dog dog = (Dog)ani;
			System.out.println("Dog 클래스로 형변환");
		}
		
		// 예외가 발생했을 때 실행
		catch(ClassCastException e) {
			System.out.println("클래스 형변환 불가");
		}
	}
	
	
	// 클래스 형변환 : 매개변수에 부모를 넣으면 부모, 자식 다 가능 / 자식을 넣으면 자식만 가능
	// 메소드 2. if 문 사용(instanceof 로 비교)
	public static void changeIf(Animal ani) {
		if(ani instanceof Dog) {
			Dog dog = (Dog)ani;
			System.out.println("Dog 클래스로 형변환");
		}
		
		else if(ani instanceof Cat) {
			Cat cat = (Cat)ani;
			System.out.println("Cat 클래스로 형변환");
		}
		
		else System.out.println("클래스 형변환 불가");
	}
}
