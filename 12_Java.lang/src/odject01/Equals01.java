package odject01;

/*
	- java.lang 패키지 주요 클래스와 용도
		-> Object(자바 최상위 클래스) : 모든 클래스는 Object 클래스의 자식이거나 자손 클래스
		-> System(표준 입력 장치로부터 데이터 입.출력)
		-> Class(클래스를 메모리로 로딩할 때)
		-> String(문자열을 저장하고 여러 정보를 얻을 때)
		-> Wrapper_Byte, Short, Character, Integer, Float, Double, Boolean, Long
			(기본 타입의 데이터를 갖는 객체를 만들 때, 문자열을 기본 타입으로 변환할 때)
		-> Math(수학 함수를 이용할 때)
 */

// extends Object(적지 않아도 컴파일할 때 자동) : 상속을 따로 받지 않는다면 기본으로 Object 클래스를 상속받음
class Value extends Object {
	int value;
	
	Value(int value) {
		this.value = value;
	}
	
	// 오버라이딩
	@Override
	public boolean equals(Object o) { // => (Object o = value2(= new Value(10))라는 객체가 대입) -> 자식타입을 부모타입으로 형변환
		Value v = (Value)o; // 부모타입(o)을 자식타입(Value)으로 강제 형변환
		int num = v.value; // => int num = ((Value)o).value; -> equals 클래스의 매개변수(value)에 있는 값을 가져옴(10)
		
		return value == num; 
		// return 한줄로 표현 : return value == ((Value)o).value;
	}
}

// 상속을 따로 받지 않는다면 기본으로 Object 클래스를 상속받음
public class Equals01 {
	public static void main(String[] args) {
		// equals() 메서드 : 객체 비교(비교 연산자인 ==와 동일 결과 리턴) -> 같으면 true, 다르면 false
		//	-> Object의 equals는 주소가 같은가
		//	-> String의 equals는 객체 안의 값이 같은가(Object의 equals를 오버라이딩)
		
		// 객체 선언
		Value value1 = new Value(10); // value1.value = 10
		Value value2= new Value(10); // value2.value = 20
		
		
		// 오버라이딩 하기 전 equals는 주소 비교, 오버라이딩한 후 equals는 값 비교
		// equals 오버라이딩 : 두 객체에 있는 값 비교
		if(value1.equals(value2))
			System.out.println("value1과 value2가 값이 같다");
		else
			System.out.println("value1과 value2가 값이 다르다");
		
		
		// == (equals와 값이 같음) : 두 객체에 있는 주소 비교
		if(value1 == value2)
			System.out.println("value1과 value2가 주소가 같다");
		else
			System.out.println("value1과 value2가 주소가 다르다");
		
		
		// value2의 값을 value1에 대입 = 무조건 같음
		value1 = value2;
				
		if(value1.equals(value2))
			System.out.println("value1과 value2가 같다");
		else
			System.out.println("value1과 value2가 다르다");
	}
}
