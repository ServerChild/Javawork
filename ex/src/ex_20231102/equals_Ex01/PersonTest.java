package ex_20231102.equals_Ex01;

class Person {
	int id;
	
	Person(int id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object o) {
		// 풀이 1. 부모타입을 자식타입으로 강제 형변환 후 값 가져와 비교
		// return id == ((Person)o).id;
		
		
	 	// 풀이 2. o 객체가 Person 타입으로 만들어졌는지 확인 후 강제형변환
		if(o instanceof Person)
			return id == ((Person)o).id;
		else
			return false;
	}
}


public class PersonTest {
	public static void main(String[] args) {
		Person ps1 = new Person(20231102);
		Person ps2 = new Person(20231102);
		
		// equals 메소드 호출 : 값 비교
		// 같으면 ?, 다르면 ??
		if(ps1.equals(ps2))
			System.out.println("값 같음");
		else
			System.out.println("값 다름");
		
		
		// == 사용 : 주소 비교
		// 같으면 ???, 다르면 ????
		if(ps1 == ps2)
			System.out.println("주소 같음");
		else
			System.out.println("주소 다름");
	}
}
