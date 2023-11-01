package final04;

// 상속할 수 없는 final 클래스 : 부모 클래스가 될 수 업어 자식 클래스를 만들 수 없음
// 클래스에 final을 붙이면 상속할 수 없음
final class Final01 {
	
}

/* final이 붙어있는 클래스를 상속받으려 했으므로 error
class FinalInher extends Final01 { 
	
}
*/

class Final02 {
	int num = 10;
	
	// 상수 : 변수 앞에 final을 붙임, 값이 한번 저장되면 변경 불가
	final int NUM2 = 34;
	
	// 재정의할 수 없는 final 메소드 : 부모 클래스에 선언된 final 메소드는 자식 클래스에서 재정의 할 수 없음
	// 메소드 앞에 final을 붙이면 오버라이딩 불가
	final int play() {
		return num;
	}
	
	int show() {
		return num;
	}
}


class Final02Inher extends Final02 {
	/*
	  	// 메소드 재정의 불가
	  	int play() {
		return 3;
	}
	*/
	
	@Override
	int show() {
		return 5;
	}
}


public class FinalTest {
	public static void main(String[] args) {
		// final 키워드 : 해당 선언이 최종 상태이며 수정될 수 없음을 의미
	}
}
