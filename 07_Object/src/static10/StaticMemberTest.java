// 실행용
package static10;

public class StaticMemberTest {
	public static void main(String[] args) {
		// 정적 클래스는 객체 생성하지 않고 값 호출 o : 클래스 이름 이용
		// 정적 클래스(필드, 메소드)는 "클래스 이름.호출할 이름"을 통해 호출함
		System.out.println("정적 변수(객체 생성x) : " + StaticMember.sName);
		
		StaticMember.sMe2();
		
		
		// 객체 생성해 값 호출
		StaticMember sm = new StaticMember();
		
		// 인스턴스 필드 출력
		System.out.println("인스턴스 변수 : " + sm.num);
		
		// 정적 필드 출력
		System.out.println("정적 변수 : " + sm.sNum);
		
		// 인스턴스 메소드 출력
		sm.Me1();
		
		// 정적 메소드 출력
		sm.sMe1();
	}
}
