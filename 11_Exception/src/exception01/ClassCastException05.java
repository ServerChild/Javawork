package exception01;

class Animal { } // 부모

class Dog extends Animal { } // 자식1

class Cat extends Animal { } // 자식2

// ClassCastException : 상속을 받았을 때 클래스 형변환을 할 수 없는 경우
public class ClassCastException05 {
	public static void main(String[] args) {
		// 예외가 발생할 수 있는 경우
		try {
			Dog dog1 = new Dog(); // 부모, 자식1 객체 모두 사용
			Animal ani = dog1; // 부모 객체 사용, 자식1 객체 사용 x
			Dog dog2 = (Dog)ani; // 부모, 자식1 객체 모두 사용
			
			System.out.println("Dog 형변환");
			
			
			Animal ani2 = new Animal(); // 부모 객체 사용
			Cat cat = (Cat)ani2; // 부모 객체 사용, 자식2 객체 사용 (오류 : 자식2를 쓴다는 의미인데 생성한 자식2 객체가 없음)
			
			System.out.println("Cat 형변환");
		}
		
		// 예외가 발생했을 때 실행
		catch(ClassCastException e) {
			System.out.println("클래스 형변환 불가");
		}
	}
}
