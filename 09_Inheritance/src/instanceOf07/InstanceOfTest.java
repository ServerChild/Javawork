package instanceOf07;

class Parent {
	
}

class Child extends Parent {
	
}

public class InstanceOfTest {
	public static void main(String[] args) {
		// instanceof : 좌측의 객체가 우측의 타입으로 만들어졌는지 검사
		// - 결과 : true -> 우측타입으로 객체가 만들어짐(즉, 강제형변환 가능)
		//  	false -> 우측타입으로 객체가 만들어지지 않음(즉, 강제형변환 불가) 
		
		// 강제형변환 오류는 컴파일 시에 뜸(미리 알 수 없음)
		
		// 자동형변환(자식타입으로 만들어진 객체를 부모타입으로 형변환)
		// 강제형변환(부모타입을 자식타입으로 형변환)
		//	-> 주의점 : 처음 객체를 만들때 자식타입으로 객체가 생성되어야 함
		//			  처음부터 부모객체로 만들어진 것은 형변환 불가
		
		// 예시 1
		Parent p1 = new Parent();
		
		if(p1 instanceof Child) {
			Child c1 = (Child)p1;
			System.out.println("p1 자식클래스로 강제형변환 성공");
		}
		else System.out.println("p1 강제형변환 불가");
		
		
		// 예시 2
		Parent p2 = new Child(); // 부모, 자식 객체 둘다 생성
		
		if(p2 instanceof Child) {
			Child c2 = (Child)p2;
			System.out.println("p2 자식클래스로 강제형변환 성공");
		}
		else System.out.println("p2 강제형변환 불가");
	}
}
