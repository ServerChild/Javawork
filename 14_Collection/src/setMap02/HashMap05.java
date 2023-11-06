package setMap02;

import java.util.*;

public class HashMap05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap map = new HashMap<>();
		
		// 값 추가 : put("키", "값")
		map.put("myId", "pw1234");
		map.put("20231106", "pw0001");
		map.put("20231107", "pw0002");
		
		System.out.print("Id와 Pw를 입력 : ");
		String id = sc.next();
		String pw = sc.next();
		
		
		// 매치 확인
		// map.containsKey(키값) : 키 값이 있는지 확인
		// map.containsValue(값) : 값이 있는지 확인
		if(map.containsKey(id)) {
			// map.get(id) -> 엔트리 값으로 가져옴
			// 엔트리 값을 가져오므로 String 형으로 형변환
			//String value = (String)map.get(id);
		
			// 패스워드 값 일치 여부 확인
			// if(value.equals(pw)) -> value 객체 선언 + 조건
			if(map.get(id).equals(pw)) // value 객체 선언 x, 한줄 조건
				System.out.println("로그인 성공");
			else
				System.out.println("로그인 실패. 패스워드가 틀림");
		}
		else
			System.out.println("Id가 일치하지 않습니다.");
	}
}
