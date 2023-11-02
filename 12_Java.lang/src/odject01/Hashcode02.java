package odject01;

public class Hashcode02 {
	public static void main(String[] args) {
		// hashCode() 메서드 : 객체 자신의 해시코드를 반환
		// 참조 자료형은 객체 생성 시 덮어쓰기가 되지 않으며 새로 생성됨
		
		// 다른 주소를 가진 객체 선언
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2)); // 재정의
		
		// hashCode() : 하위 클래스에서 override 가능, 객체마다 유일한 값을 갖고 있지 않음
		System.out.println(str1.hashCode()); // 재정의
		System.out.println(str2.hashCode());
		
		// System.identityHashCode() : override 불가능, 객체의 고유한 해시코드값
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		
		// 같은 주소를 가진 객체 선언
		String str3 = "def";
		String str4 = "def";
		
		
		// 다른 주소인 새로운 객체 선언(덮어쓰기 x)
		// str1 = "jjjj";
	}
}
