// 실행용
package static10;

public class StaticMemberTest {
	int a; // 인스턴스 필드(static 메소드 안에서 사용 x)
	static int b; // 정적 필드(static 메소드 안에서 사용 o) = 클래스 필드
	
	
	public static void main(String[] args) {
		// 정적 클래스는 객체 생성하지 않고 값 호출 o : 클래스 이름 이용
		// 정적 클래스(필드, 메소드)는 "클래스 이름.호출할 이름"을 통해 호출함
		int c; // 지역 변수(main 안에서만 사용 가능)
		
		System.out.println(b); // 사용 o
		
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
		
		
		// 객체 생성
		StaticMember sm1 = new StaticMember();
		
		sm1.sNum = 100;
		
		
		// 클래스를 이용하는 모든 객체들의 공통으로 사용
		System.out.println(StaticMember.sNum);
		System.out.println(sm.sNum);
		System.out.println(sm1.sNum);
		
		System.out.println(StaticMemberTest.Method1());
	} // 정적 main() 메소드
	
	static int Method1() {
		return 10;
	}
}
